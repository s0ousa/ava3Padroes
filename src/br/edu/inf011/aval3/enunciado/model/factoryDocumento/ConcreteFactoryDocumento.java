package br.edu.inf011.aval3.enunciado.model.factoryDocumento;

import br.edu.inf011.aval3.enunciado.model.CPF;
import br.edu.inf011.aval3.enunciado.model.CartaoCredito;
import br.edu.inf011.aval3.enunciado.model.EMail;
import br.edu.inf011.aval3.enunciado.model.RG;

import java.time.LocalDate;

public class ConcreteFactoryDocumento implements FactoryDocumento{
    @Override
    public CPF createCpf(String nome, String numero) {
        return new CPF(nome, numero);
    }

    @Override
    public EMail createEmail(String conta) {
        return new EMail(conta);
    }

    @Override
    public RG createRG(String nome, String numero, String expedidor, String  validade) {
        return new RG( nome,  numero,  expedidor,   validade);
    }

    @Override
    public CartaoCredito CartaoCredito(String nome, String numero, String cvc, String vencimento) {
        return null;
    }
}
