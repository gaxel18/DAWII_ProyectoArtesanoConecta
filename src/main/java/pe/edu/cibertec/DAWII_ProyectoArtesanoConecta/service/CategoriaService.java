package pe.edu.cibertec.DAWII_ProyectoArtesanoConecta.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DAWII_ProyectoArtesanoConecta.model.bd.pk.Categorias;
import pe.edu.cibertec.DAWII_ProyectoArtesanoConecta.repository.CategoriaRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class CategoriaService {

    private CategoriaRepository categoriaRepository;

    public List<Categorias> listarCategorias(){
        return categoriaRepository.findAll();
    }
}
