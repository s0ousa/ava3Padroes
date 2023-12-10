//package br.edu.inf011.aval3.enunciado.model.builderDocumento;
//
//import br.edu.inf011.aval3.enunciado.model.Documento;
//import br.edu.inf011.aval3.enunciado.model.EMail;
//
//public class BuilderEmail implements BuilderDocumento {
//
//    public String conta;
//
//
//    public BuilderEmail addConta(String conta) {
//        this.conta = conta;
//        return this;
//    }
//
//    @Override
//    public EMail build() {
//        return new EMail(conta);
//    }
//
//    @Override
//    public void reset() {
//         conta = null;
//    }
//}
