package br.edu.inf011.aval3.enunciado.model.visitor;

import br.edu.inf011.aval3.enunciado.model.CPF;
import br.edu.inf011.aval3.enunciado.model.CartaoCredito;
import br.edu.inf011.aval3.enunciado.model.EMail;
import br.edu.inf011.aval3.enunciado.model.RG;

import javax.print.Doc;

public class FormatVisitor implements DocumentoVisitor {
    @Override
    public void visit(CPF cpf) {
        System.out.println( cpf.formatar());
    }

    @Override
    public void visit(RG rg) {
        System.out.println( rg.formatar());
    }

    @Override
    public void visit(EMail email) {
        System.out.println( email.formatar());
    }

    @Override
    public void visit(CartaoCredito cartao) {
        System.out.println( cartao.formatar());
    }
}
