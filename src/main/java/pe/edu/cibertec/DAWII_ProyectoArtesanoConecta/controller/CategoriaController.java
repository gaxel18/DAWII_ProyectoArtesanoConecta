package pe.edu.cibertec.DAWII_ProyectoArtesanoConecta.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pe.edu.cibertec.DAWII_ProyectoArtesanoConecta.model.bd.pk.Categorias;
import pe.edu.cibertec.DAWII_ProyectoArtesanoConecta.service.CategoriaService;

import java.util.List;

@AllArgsConstructor
@Controller
@RequestMapping("/categoria")
public class CategoriaController {
    private CategoriaService categoriaService;

    @GetMapping("/listar")
    @ResponseBody
      public List<Categorias> listarCategorias(){
        return categoriaService.listarCategorias();
    }
}
