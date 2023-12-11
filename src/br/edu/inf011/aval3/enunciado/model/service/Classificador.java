package br.edu.inf011.aval3.enunciado.model.service;

import br.edu.inf011.aval3.enunciado.model.Perfil;

//serviceInterface dentro do padrão PROXY
public interface Classificador {
	
	public NivelPerfil nivel();
	public Perfil getPerfil();
	
}
