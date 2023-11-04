package pe.edu.cibertec.DAWII_ProyectoArtesanoConecta.model.bd.pk;

import lombok.Data;

import java.util.Date;

@Data
public class ProductoRequest {
    private Integer productoid;
    private String nombre;
    private String descripcion;
    private Double precio;
    private Integer stock;
    private Boolean discontinued;
    private Integer categoriaid;
    private Integer artesanoid;
    private Date fechaCreacion;
}
