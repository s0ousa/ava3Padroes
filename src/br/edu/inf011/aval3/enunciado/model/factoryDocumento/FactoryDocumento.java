package br.edu.inf011.aval3.enunciado.model.factoryDocumento;

import br.edu.inf011.aval3.enunciado.model.*;

import java.time.LocalDate;

public interface FactoryDocumento {
    Documento createCpf(String nome, String numero);
    Documento createEmail(String conta);
    Documento createRG(String nome, String numero, String expedidor, String validade);
    Documento CartaoCredito(String nome, String numero, String cvc, String vencimento);
}
