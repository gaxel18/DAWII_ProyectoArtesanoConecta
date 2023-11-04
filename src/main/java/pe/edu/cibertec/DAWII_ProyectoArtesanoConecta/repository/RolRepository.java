package pe.edu.cibertec.DAWII_ProyectoArtesanoConecta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.DAWII_ProyectoArtesanoConecta.model.bd.pk.Rol;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer> {
    Rol findByNomRol(String nombrerol);
}
