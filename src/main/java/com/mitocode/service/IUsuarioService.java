package com.mitocode.service;

import java.util.List;

import com.mitocode.model.Usuario;

public interface IUsuarioService {

	Usuario login(Usuario us);
	List<Usuario> buscarPorNombreUsuario(String us);//**agregado
}
