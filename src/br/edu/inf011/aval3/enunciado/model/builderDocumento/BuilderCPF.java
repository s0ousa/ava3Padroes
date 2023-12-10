//package br.edu.inf011.aval3.enunciado.model.builderDocumento;
//
//import br.edu.inf011.aval3.enunciado.model.CPF;
//
//public class BuilderCPF implements BuilderDocumento{
//
//    private String nome;
//    private String numero;
//
//    public BuilderCPF addNome(String nome) {
//        this.nome = nome;
//        return this;
//    }
//
//    public BuilderCPF addNumero(String numero) {
//        this.numero = numero;
//        return this;
//    }
//
//    @Override
//    public CPF build() {
//        return new CPF(nome, numero);
//
//    }
//
//    @Override
//    public void reset() {
//        nome = null;
//        numero = null;
//    }
//}
