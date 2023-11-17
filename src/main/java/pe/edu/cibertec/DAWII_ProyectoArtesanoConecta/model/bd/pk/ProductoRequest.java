package pe.edu.cibertec.DAWII_ProyectoArtesanoConecta.model.bd.pk;

import lombok.Data;

import java.util.Date;

@Data
public class ProductoRequest {
    private Integer productoid;
    private String nombre;
    private Double precio;
    private Boolean discontinued;
    private Integer categoriaid;
    private Integer artesanoid;
}
