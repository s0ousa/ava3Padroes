package br.edu.inf011.aval3.enunciado.model.factoryDocumento;

import br.edu.inf011.aval3.enunciado.model.*;

import java.time.LocalDate;

public class ConcreteFactoryDocumento implements FactoryDocumento{
    @Override
    public Documento createCpf(String nome, String numero) {
        return new CPF(nome, numero);
    }

    @Override
    public Documento createEmail(String conta) {
        return new EMail(conta);
    }

    @Override
    public Documento createRG(String nome, String numero, String expedidor, String  validade) {
        return new RG( nome,  numero,  expedidor,   validade);
    }

    @Override
    public Documento CartaoCredito(String nome, String numero, String cvc, String vencimento) {
        return null;
    }
}
