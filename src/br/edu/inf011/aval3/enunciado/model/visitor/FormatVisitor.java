package br.edu.inf011.aval3.enunciado.model.visitor;

import br.edu.inf011.aval3.enunciado.model.CPF;
import br.edu.inf011.aval3.enunciado.model.CartaoCredito;
import br.edu.inf011.aval3.enunciado.model.EMail;
import br.edu.inf011.aval3.enunciado.model.RG;

//concrete visitor for format document
public class FormatVisitor implements DocumentVisitor {
    @Override
    public Object visit(CPF cpf) {
       return cpf.formatar();
    }

    @Override
    public Object visit(RG rg) {
        return rg.formatar();
    }

    @Override
    public Object visit(EMail email) {
        return email.formatar();
    }

    @Override
    public Object visit(CartaoCredito cartao) {
        return cartao.formatar();
    }
}
