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

    @Column(name="fechapedido")
    private Date fechaPedido;

    @Column(name = "fechaenvio")
    private Date fechaEnvio;

    @Column(name="direccion")
    private String direccion;

    @ManyToOne
    @JoinColumn(name="clienteid")
    private Clientes clientes;

    @ManyToOne
    @JoinColumn(name="artesanoid")
    private Artesanos artesanos;
}