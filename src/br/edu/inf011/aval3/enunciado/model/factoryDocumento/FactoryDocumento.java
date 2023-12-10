package br.edu.inf011.aval3.enunciado.model.factoryDocumento;

import br.edu.inf011.aval3.enunciado.model.CPF;
import br.edu.inf011.aval3.enunciado.model.CartaoCredito;
import br.edu.inf011.aval3.enunciado.model.EMail;
import br.edu.inf011.aval3.enunciado.model.RG;

import java.time.LocalDate;

public interface FactoryDocumento {
    CPF createCpf(String nome, String numero);
    EMail createEmail(String conta);
    RG createRG(String nome, String numero, String expedidor, String validade);
    CartaoCredito CartaoCredito(String nome, String numero, String cvc, String vencimento);
}
