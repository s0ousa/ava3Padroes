package br.edu.inf011.aval3.enunciado.model.builderPerfil;


import br.edu.inf011.aval3.enunciado.model.Documento;
import br.edu.inf011.aval3.enunciado.model.Perfil;

public interface Builder {
    public PerfilBuilder addUsuario(String user);
    public PerfilBuilder addNome(String nome);
    public PerfilBuilder addSenha(String senha);
    public PerfilBuilder addDocumento(Documento doc);
    public PerfilBuilder reset();
    public Perfil build();
}
