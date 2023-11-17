package pe.edu.cibertec.DAWII_ProyectoArtesanoConecta.model.bd.pk;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
@Table(name="categorias")
public class Categorias {
    @Id
    private Integer categoriaid;
    @Column(name = "nombre")
    private String nombre;
    @Column(name="descripcion")
    private String descripcion;
}