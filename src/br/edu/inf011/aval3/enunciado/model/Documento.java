package br.edu.inf011.aval3.enunciado.model;

import br.edu.inf011.aval3.enunciado.model.visitor.DocumentVisitor;

public interface Documento {
	public String formatar();
	public boolean validar();
	public Integer pontuar();
	//define method for different visitable documents to implement
	public void aceitar(DocumentVisitor visitor);
}
