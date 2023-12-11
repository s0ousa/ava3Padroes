package br.edu.inf011.aval3.enunciado.model.visitor;

import br.edu.inf011.aval3.enunciado.model.CPF;
import br.edu.inf011.aval3.enunciado.model.CartaoCredito;
import br.edu.inf011.aval3.enunciado.model.EMail;
import br.edu.inf011.aval3.enunciado.model.RG;

public class ScoreVisitor implements DocumentoVisitor{

    @Override
    public void visit(CPF cpf) {
        System.out.println( cpf.pontuar());
    }

    @Override
    public void visit(RG rg) {
        System.out.println( rg.pontuar());
    }

    @Override
    public void visit(EMail email) {
        System.out.println( email.pontuar());
    }

    @Override
    public void visit(CartaoCredito cartao) {
        System.out.println( cartao.pontuar());
    }
}
