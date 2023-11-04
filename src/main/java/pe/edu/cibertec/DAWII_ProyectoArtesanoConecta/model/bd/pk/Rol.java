package pe.edu.cibertec.DAWII_ProyectoArtesanoConecta.model.bd.pk;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "rol")
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idrol;
    @Column(name = "nomrol")
    private String nomrol;
}
