package SistemaBancario;

import java.io.Serializable;

public class Pessoa implements Serializable {
    /*
    Utilizando o padrão JavaBeans para nenhum outro poder modificar os atributos, mas podendo acessá-los =
    padronizar a implementação do conceito de encapsulamento de orientação a objetos
     */

    private static final long serialVersionUID = 1L;

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
