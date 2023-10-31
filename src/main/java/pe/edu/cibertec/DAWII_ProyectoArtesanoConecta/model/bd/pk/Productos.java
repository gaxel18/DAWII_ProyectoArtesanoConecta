package pe.edu.cibertec.DAWII_ProyectoArtesanoConecta.model.bd.pk;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@Data
@Entity
@Table(name="productos")
public class Productos {
    @Id
    private Integer productoid;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "precio")
    private Double precio;
    @Column(name = "stock")
    private Integer stock;

    @ManyToOne
    @JoinColumn(name="categoriaid")
    private Categorias categorias;

    @ManyToOne
    @JoinColumn(name = "artesanoid")
    private Artesanos artesanos;

    @Column(name = "fechaCreacion")
    private Date fechaCreacion;
}