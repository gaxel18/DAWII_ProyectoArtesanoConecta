package pe.edu.cibertec.DAWII_ProyectoArtesanoConecta.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DAWII_ProyectoArtesanoConecta.model.bd.pk.*;
import pe.edu.cibertec.DAWII_ProyectoArtesanoConecta.repository.ProductoRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class ProductoService {
    private ProductoRepository productoRepository;

    public List<Productos> listarProductos(){
        return productoRepository.findAll();
    }

    public ResultadoResponse guardarProducto(ProductoRequest producto){
        String mensaje = "Su producto fue registrado correctamente";
        Boolean respuesta = true;
        try{
            Productos objProducto = new Productos();
            if(producto.getProductoid() > 0){
                objProducto.setProductoid(producto.getProductoid());
            }
            objProducto.setNombre(producto.getNombre());
            objProducto.setPrecio(producto.getPrecio());
            Boolean discontinued = false;
            if(producto.getDiscontinued() != null){
                discontinued = producto.getDiscontinued();
            }
            objProducto.setDiscontinued(discontinued);
            Categorias categorias = new Categorias();
            categorias.setCategoriaid(producto.getCategoriaid());
            Artesanos artesanos = new Artesanos();
            artesanos.setArtesanoid(producto.getArtesanoid());
            objProducto.setCategorias(categorias);
            objProducto.setArtesanos(artesanos);
            productoRepository.save(objProducto);
        }catch (Exception ex){
            mensaje = "Producto no registrado";
            respuesta = false;
        }
        return ResultadoResponse.builder().mensaje(mensaje).respuesta(respuesta).build();
    }
}