//package br.edu.inf011.aval3.enunciado.model.builderDocumento;
//
//import br.edu.inf011.aval3.enunciado.model.CartaoCredito;
//import br.edu.inf011.aval3.enunciado.model.Documento;
//
//import java.time.LocalDate;
//
//public class BuilderCartaoCredito implements BuilderDocumento {
//
//    public String nome;
//    public String numero;
//    public String cvc;
//    public LocalDate vencimento;
//
//    public void addNome(String nome) {
//        this.nome = nome;
//    }
//
//    public void addNumero(String numero) {
//        this.numero = numero;
//    }
//
//    public void addCvc(String cvc) {
//        this.cvc = cvc;
//    }
//
//    public void addVencimento(LocalDate vencimento) {
//        this.vencimento = vencimento;
//    }
//
//    @Override
//    public Documento build() {
//        return new CartaoCredito( nome,  numero,  cvc,  vencimento);
//    }
//
//    @Override
//    public void reset() {
//        numero= null;
//        vencimento = null;
//        nome = null;
//        cvc = null;
//    }
//}
