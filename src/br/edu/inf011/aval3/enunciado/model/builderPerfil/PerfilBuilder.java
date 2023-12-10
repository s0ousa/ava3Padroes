package br.edu.inf011.aval3.enunciado.model.builderPerfil;

import br.edu.inf011.aval3.enunciado.model.*;

import java.util.List;

public class PerfilBuilder implements Builder {
    private String nome;
    private String user;
    private String pwd;
    private List<Documento> documentos;
    public PerfilBuilder(String nome) {
        this.nome = nome;
        this.user = nome;
        this.pwd = nome;
    }
    @Override
    public PerfilBuilder addUsuario(String user) {
       this.user = user;
       return this;
    }

    @Override
    public PerfilBuilder addNome(String nome) {
        this.nome = nome;
        return this;
    }

    @Override
    public PerfilBuilder addSenha(String senha) {
        this.pwd = senha;
        return this;
    }

    @Override
    public PerfilBuilder reset() {
        pwd = null;
        nome = null;
        user = null;
        return this;
    }

    @Override
    public Perfil build() {
        return new Perfil( nome, user, pwd);
    }
}
