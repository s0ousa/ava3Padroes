package br.edu.inf011.aval3.enunciado.model;

import br.edu.inf011.aval3.enunciado.model.visitor.DocumentoVisitor;

public interface Documento {
	public String formatar();
	public boolean validar();
	public Integer pontuar();
	public void aceitar(DocumentoVisitor visitor);
}
