package pe.edu.cibertec.DAAII_T1_Nicolas_Segovia.service;

import pe.edu.cibertec.DAAII_T1_Nicolas_Segovia.model.bd.Usuario;

import java.util.List;

public interface IUsuarioService {
    Usuario buscarUsuarioXNomUsuario(String nomusuario);
    //Usuario registrarUsuario(Usuario usuario);
    Usuario buscarUsuarioXIdUsuario(Integer idusuario);
}
