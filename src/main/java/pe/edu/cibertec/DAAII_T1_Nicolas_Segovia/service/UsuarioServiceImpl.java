package pe.edu.cibertec.DAAII_T1_Nicolas_Segovia.service;

import lombok.AllArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DAAII_T1_Nicolas_Segovia.model.bd.Usuario;
import pe.edu.cibertec.DAAII_T1_Nicolas_Segovia.repository.IRolRepository;
import pe.edu.cibertec.DAAII_T1_Nicolas_Segovia.repository.IUsuarioRepository;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

@Service
@AllArgsConstructor
public class UsuarioServiceImpl implements IUsuarioService{

    private IUsuarioRepository usuarioRepository;
    private IRolRepository rolRepository;

    @Override
    public Usuario buscarUsuarioXNomUsuario(String nomusuario) {
        return usuarioRepository.findByNomusuario(nomusuario);
    }


    @Override
    public Usuario buscarUsuarioXIdUsuario(Integer idusuario) {
        return usuarioRepository.findById(idusuario).orElse(null);
    }
}
