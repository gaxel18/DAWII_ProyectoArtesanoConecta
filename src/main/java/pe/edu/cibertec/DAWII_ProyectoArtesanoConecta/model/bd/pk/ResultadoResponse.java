package pe.edu.cibertec.DAWII_ProyectoArtesanoConecta.model.bd.pk;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResultadoResponse {
    private Boolean respuesta;
    private String mensaje;
}
