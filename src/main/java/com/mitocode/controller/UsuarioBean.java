package com.mitocode.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.mitocode.model.Persona;
import com.mitocode.model.Usuario;
import com.mitocode.service.IUsuarioService;

@Named
@ViewScoped
public class UsuarioBean implements Serializable{

	@Inject
	private IUsuarioService service;
	
	private String textoBuscar="";
	private Usuario usuario;
	private List<Usuario> lista;
	private String tipoDialog;
	
	@PostConstruct
	public void init() {
		this.usuario=new Usuario();
		this.tipoDialog="";
		
	}
	public void llenarUsuario() {
		this.lista=this.service.buscarPorNombreUsuario(textoBuscar);
	}
	public void mostrarData(Usuario u) {
		this.usuario=u;
		this.tipoDialog="Modificando Usuario : ";
	}

	/*
	 * metodos get and set
	 * */
	public String getTextoBuscar() {
		return textoBuscar;
	}

	public void setTextoBuscar(String textoBuscar) {
		this.textoBuscar = textoBuscar;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Usuario> getLista() {
		return lista;
	}

	public void setLista(List<Usuario> lista) {
		this.lista = lista;
	}
	public String getTipoDialog() {
		return tipoDialog;
	}
	public void setTipoDialog(String tipoDialog) {
		this.tipoDialog = tipoDialog;
	}
	
	
}
