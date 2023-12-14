package br.edu.inf011.aval3.enunciado.model.proxyClassificador;

import br.edu.inf011.aval3.enunciado.model.Perfil;
import br.edu.inf011.aval3.enunciado.model.service.Classificador;
import br.edu.inf011.aval3.enunciado.model.service.NivelPerfil;

import java.util.Scanner;

//classe PROXY dentro do padrão proxy
public class Proxy implements Classificador {
    private Classificador classificador;

    public Proxy(Classificador classificador) {
        this.classificador = classificador;
    }

    public boolean credenciaisOk(){
        Perfil perfil = classificador.getPerfil();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Por favor insira o nome de usuario desse perfil.\n");
        String userFornecido = entrada.nextLine();
        System.out.println("Por favor insira a senha desse perfil.\n");
        String senhaFornecida = entrada.nextLine();

        return (userFornecido.equals(perfil.getNome())) && (senhaFornecida.equals(perfil.getPwd()));
    }
    @Override
    public NivelPerfil nivel() {
        if (this.credenciaisOk()) return classificador.nivel();
        return NivelPerfil.DESCONHECIDO;
    }

    @Override
    public Perfil getPerfil() {
        return classificador.getPerfil();
    }
}
