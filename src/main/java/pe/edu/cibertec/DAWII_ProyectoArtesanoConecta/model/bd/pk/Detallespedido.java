package pe.edu.cibertec.DAWII_ProyectoArtesanoConecta.model.bd.pk;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
@Table(name = "detallesPedido")
public class Detallespedido {
    @Id
    private Integer detalleid;

    @ManyToOne
    @JoinColumn(name = "pedidoid")
    private Pedidos pedidos;

    @ManyToOne
    @JoinColumn(name = "productoid")
    private Productos productos;

    @Column(name = "cantidad")
    private Integer cantidad;
    @Column(name = "precioUnitario")
    private Double precioUnitario;
}
