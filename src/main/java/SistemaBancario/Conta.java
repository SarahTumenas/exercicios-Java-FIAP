package SistemaBancario;

/**
 * Classe que abstrai uma Conta Bancária
 * @author Sarah Tumenas
 * @version 1.0
 */

public class Conta {

    //atributos que caracterizam a classe
    int agencia;
    int numero;
    double saldo;


    //construtor padrão, necessário para o consumo de APIs
    public Conta () {



    }


    //construtor de classe com as informações para gerar objetos
    public Conta (int agencia, int numero, double saldo){


        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;

    }

    /**
     * Acrescenta valor ao Saldo da Conta
     * @param valor que será depositado
     */
        public void depositar (double valor){

        this.saldo += valor;
    }


    /**
     * Retira um valor do Saldo da Conta
     * @param valor
     * @see depositar
     */
    public void  retirar ( double valor){

        this.saldo -= valor;
    }


    /**
     * Verifica o saldo da Conta
     * @return Valor do Saldo da Conta
     */
    public double verificarSaldo (){

        return this.saldo;
    }

}
