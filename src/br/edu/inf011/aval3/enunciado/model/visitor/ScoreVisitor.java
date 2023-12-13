package br.edu.inf011.aval3.enunciado.model.visitor;

import br.edu.inf011.aval3.enunciado.model.CPF;
import br.edu.inf011.aval3.enunciado.model.CartaoCredito;
import br.edu.inf011.aval3.enunciado.model.EMail;
import br.edu.inf011.aval3.enunciado.model.RG;

//concrete visitor for calculate score
public class ScoreVisitor implements DocumentVisitor {

    @Override
    public Object visit(CPF cpf) {
        return  cpf.pontuar();
    }

    @Override
    public Object visit(RG rg) {
        return  rg.pontuar();
    }

    @Override
    public Object visit(EMail email) {
        return  email.pontuar();
    }

    @Override
    public Object visit(CartaoCredito cartao) {
        return  cartao.pontuar();
    }
}
