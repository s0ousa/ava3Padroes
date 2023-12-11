package br.edu.inf011.aval3.enunciado.model.visitor;

import br.edu.inf011.aval3.enunciado.model.CPF;
import br.edu.inf011.aval3.enunciado.model.CartaoCredito;
import br.edu.inf011.aval3.enunciado.model.EMail;
import br.edu.inf011.aval3.enunciado.model.RG;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CalculateDueDateVisitor implements DocumentoVisitor{
    @Override
    public void visit(CPF cpf) {

    }

    @Override
    public void visit(RG rg) {
        LocalDate hoje = LocalDate.now();

        long diasRestantes = ChronoUnit.DAYS.between(hoje, rg.validade);
        System.out.println("Dias restantes até o fim da validade do RG: " + diasRestantes);
    }

    @Override
    public void visit(EMail email) {

    }

    @Override
    public void visit(CartaoCredito cartao) {
        LocalDate hoje = LocalDate.now();
        LocalDate umAnoDepois = hoje.plusYears(1);

        long diasRestantes = ChronoUnit.DAYS.between(hoje, umAnoDepois);
        System.out.println("Dias restantes até o fim da validade do Cartao: " + diasRestantes);
    }
}
