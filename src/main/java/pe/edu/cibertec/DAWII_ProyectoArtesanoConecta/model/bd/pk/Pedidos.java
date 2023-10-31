package pe.edu.cibertec.DAWII_ProyectoArtesanoConecta.model.bd.pk;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@Data
@Entity
@Table(name = "pedidos")
public class Pedidos {
    @Id
    private Integer pedidoid;

    @ManyToOne
    @JoinColumn(name="clienteid")
    private Clientes clientes;

    @Column(name = "fechaPedido")
    private Date fechaPedido;
}
