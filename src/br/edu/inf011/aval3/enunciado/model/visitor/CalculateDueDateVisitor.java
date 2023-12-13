package br.edu.inf011.aval3.enunciado.model.visitor;

import br.edu.inf011.aval3.enunciado.model.CPF;
import br.edu.inf011.aval3.enunciado.model.CartaoCredito;
import br.edu.inf011.aval3.enunciado.model.EMail;
import br.edu.inf011.aval3.enunciado.model.RG;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CalculateDueDateVisitor implements DocumentVisitor {
    @Override
    public Object visit(CPF cpf) {
        return "Não há validade para esse documento";
    }

    @Override
    public Object visit(RG rg) {
        LocalDate hoje = LocalDate.now();

        long diasRestantes = ChronoUnit.DAYS.between(hoje, rg.validade);
        return "Dias restantes até o fim da validade do RG: " + diasRestantes;
    }

    @Override
    public Object visit(EMail email) {
        return "Não há validade para esse documento";
    }

    @Override
    public Object visit(CartaoCredito cartao) {
        LocalDate hoje = LocalDate.now();
        LocalDate umAnoDepois = hoje.plusYears(1);

        long diasRestantes = ChronoUnit.DAYS.between(hoje, umAnoDepois);
        return "Dias restantes até o fim da validade do Cartao: " + diasRestantes;
    }
}
