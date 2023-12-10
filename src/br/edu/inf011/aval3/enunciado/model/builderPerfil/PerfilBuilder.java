package br.edu.inf011.aval3.enunciado.model.builderPerfil;

import br.edu.inf011.aval3.enunciado.model.*;

import java.util.List;

import java.util.ArrayList;
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
        this.documentos = new ArrayList<>();
    }

    @Override
    public PerfilBuilder addUsuario(String user) {
        if (user != null && !user.isEmpty()) {
            this.user = user;
        }
        return this;
    }

    @Override
    public PerfilBuilder addNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        }
        return this;
    }

    @Override
    public PerfilBuilder addSenha(String senha) {
        if (senha != null && !senha.isEmpty()) {
            this.pwd = senha;
        }
        return this;
    }

    @Override
    public PerfilBuilder addDocumento(Documento doc) {
        if (doc instanceof CPF && countDocumentType(CPF.class) >= 1) {
            return this;
        } else if (doc instanceof RG && countDocumentType(RG.class) >= 1) {
            return this;
        } else if (doc instanceof EMail && countDocumentType(EMail.class) >= 2) {
            return this;
        } else if (doc instanceof CartaoCredito && countDocumentType(CartaoCredito.class) >= 3) {
            return this;
        }
        documentos.add(doc);
        return this;
    }

    private int countDocumentType(Class<?> type) {
        return (int) documentos.stream()
                .filter(type::isInstance)
                .count();
    }

    @Override
    public PerfilBuilder reset() {
        this.nome = null;
        this.user = null;
        this.pwd = null;
        this.documentos.clear();
        return this;
    }

    @Override
    public Perfil build() {
        return new Perfil(nome, user, pwd, documentos);
    }
}
