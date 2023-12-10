//package br.edu.inf011.aval3.enunciado.model.builderDocumento;
//
//import br.edu.inf011.aval3.enunciado.model.Documento;
//import br.edu.inf011.aval3.enunciado.model.RG;
//
//import java.time.LocalDate;
//
//public class BuilderRG implements BuilderDocumento {
//
//    public String nome;
//    public String numero;
//    public String expedidor;
//    public LocalDate validade;
//
//
//    public BuilderRG addNome(String nome) {
//        this.nome = nome;
//        return this;
//    }
//
//    public BuilderRG addNumero(String numero) {
//        this.numero = numero;
//        return this;
//    }
//
//    public BuilderRG addExpedidor (String expedidor) {
//        this.expedidor = expedidor;
//        return this;
//    }
//
//    public BuilderRG addValidade ( LocalDate validade) {
//        this.validade = validade;
//        return this;
//    }
//
//
//    @Override
//    public RG build() {
//        return new RG(nome,  numero,  expedidor,  validade);
//    }
//
//    public void reset() {
//        nome = null;
//        numero = null;
//        expedidor = null;
//        validade = null;
//    }
//}
