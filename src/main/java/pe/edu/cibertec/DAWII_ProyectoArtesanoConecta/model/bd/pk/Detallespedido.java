package pe.edu.cibertec.DAWII_ProyectoArtesanoConecta.model.bd.pk;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
@Table(name = "detallesPedido")
public class Detallespedido {
    @EmbeddedId
    private DetallePedidoId detallePedidoId;

    @Column(name="preciounitario")
    private Double preciounitario;

    @Column(name="cantidad")
    private Integer cantidad;

    @Column(name="descuento")
    private Double descuento;
}