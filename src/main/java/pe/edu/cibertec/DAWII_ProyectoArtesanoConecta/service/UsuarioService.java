package pe.edu.cibertec.DAWII_ProyectoArtesanoConecta.service;

import lombok.AllArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DAWII_ProyectoArtesanoConecta.model.bd.pk.Rol;
import pe.edu.cibertec.DAWII_ProyectoArtesanoConecta.model.bd.pk.Usuario;
import pe.edu.cibertec.DAWII_ProyectoArtesanoConecta.repository.RolRepository;
import pe.edu.cibertec.DAWII_ProyectoArtesanoConecta.repository.UsuarioRepository;

import java.util.Arrays;
import java.util.HashSet;

@Service
@AllArgsConstructor
public class UsuarioService {

    private UsuarioRepository usuarioRepository;
    private RolRepository rolRepository;

    private BCryptPasswordEncoder bCryptPasswordEncoder=
            new BCryptPasswordEncoder();

    public Usuario findUserByEmail(String email){
        return usuarioRepository.findByEmailUsuario(email);
    }

    public Usuario findUserByUserName(String username){
        return usuarioRepository.findByNomUsuario(username);
    }

    public Usuario saveUser(Usuario usuario){
        usuario.setPass(bCryptPasswordEncoder.encode(
                usuario.getPass()));
        usuario.setActivo(true);
        Rol usuarioRol = rolRepository.findByNomRol("ADMIN");
        usuario.setRoles(new HashSet<>(Arrays.asList(usuarioRol)));
        return usuarioRepository.save(usuario);
    }
}
