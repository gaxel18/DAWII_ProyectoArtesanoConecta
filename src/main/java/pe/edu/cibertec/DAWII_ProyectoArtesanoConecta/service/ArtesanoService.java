package pe.edu.cibertec.DAWII_ProyectoArtesanoConecta.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DAWII_ProyectoArtesanoConecta.model.bd.pk.Artesanos;
import pe.edu.cibertec.DAWII_ProyectoArtesanoConecta.repository.ArtesanoRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ArtesanoService {

    private ArtesanoRepository artesanoRepository;

    public List<Artesanos> listarArtesanos(){
        return artesanoRepository.findAll();
    }
}
