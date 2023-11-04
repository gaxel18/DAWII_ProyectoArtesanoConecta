package pe.edu.cibertec.DAWII_ProyectoArtesanoConecta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.DAWII_ProyectoArtesanoConecta.model.bd.pk.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    Usuario findByEmailUsuario(String email);
    Usuario findByNomUsuario(String nomusuario);
}
