package pe.edu.cibertec.DAWII_ProyectoArtesanoConecta.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pe.edu.cibertec.DAWII_ProyectoArtesanoConecta.model.bd.pk.Artesanos;
import pe.edu.cibertec.DAWII_ProyectoArtesanoConecta.service.ArtesanoService;

import java.util.List;

@AllArgsConstructor
@Controller
@RequestMapping("/artesano")
public class ArtesanoController {

    private ArtesanoService artesanoService;

    @GetMapping("/listar")
    @ResponseBody
    public List<Artesanos> listarArtesanos(){
        return artesanoService.listarArtesanos();
    }
}
