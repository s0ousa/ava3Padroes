package br.edu.inf011.aval3.enunciado.model.visitor;

import br.edu.inf011.aval3.enunciado.model.CPF;
import br.edu.inf011.aval3.enunciado.model.CartaoCredito;
import br.edu.inf011.aval3.enunciado.model.EMail;
import br.edu.inf011.aval3.enunciado.model.RG;
//Interface Visitor
public interface DocumentVisitor {
    Object visit(CPF cpf);
    Object visit(RG rg);
    Object visit(EMail email);
    Object visit(CartaoCredito cartao);

}
