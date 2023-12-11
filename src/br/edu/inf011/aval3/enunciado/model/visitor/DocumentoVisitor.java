package br.edu.inf011.aval3.enunciado.model.visitor;

import br.edu.inf011.aval3.enunciado.model.CPF;
import br.edu.inf011.aval3.enunciado.model.CartaoCredito;
import br.edu.inf011.aval3.enunciado.model.EMail;
import br.edu.inf011.aval3.enunciado.model.RG;

public interface DocumentoVisitor {
    void visit(CPF cpf);
    void visit(RG rg);
    void visit(EMail email);
    void visit(CartaoCredito cartao);

}
