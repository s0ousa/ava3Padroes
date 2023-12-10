//package br.edu.inf011.aval3.enunciado.model.builderDocumento;
//
//import br.edu.inf011.aval3.enunciado.model.CPF;
//import br.edu.inf011.aval3.enunciado.model.CartaoCredito;
//import br.edu.inf011.aval3.enunciado.model.EMail;
//import br.edu.inf011.aval3.enunciado.model.RG;
//
//public class DirectorDocumento {
//    private BuilderDocumento builder;
//
//    public void setBuilder(BuilderDocumento builder) {
//        this.builder = builder;
//    }
//
//    public CPF construirCPF() {
//        return builder.addNome().addNumero().build();
//    }
//
//    public RG construirRG(){
//        return builder.addNome().addNumero().addExpedidor().addValidade().build();
//    }
//
//    public EMail construirEmail(){
//        return builder.addConta().build();
//    }
//
//    public CartaoCredito construirCartaoCredito(){
//        return builder.addNome().addNumero().addCvc().addVencimento().build();
//    }
//}
