package br.edu.inf011.aval3.enunciado.model.visitor;

import br.edu.inf011.aval3.enunciado.model.CPF;
import br.edu.inf011.aval3.enunciado.model.CartaoCredito;
import br.edu.inf011.aval3.enunciado.model.EMail;
import br.edu.inf011.aval3.enunciado.model.RG;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ValidationVisitor implements DocumentoVisitor{
    @Override
    public void visit(CPF cpf) {
        System.out.println( cpf.validar());
    }

    @Override
    public void visit(RG rg) {
        System.out.println( rg.validar());
    }

    @Override
    public void visit(EMail email) {
        System.out.println( email.validar());
    }

    @Override
    public void visit(CartaoCredito cartao) {
        System.out.println( cartao.validar());
    }
}
