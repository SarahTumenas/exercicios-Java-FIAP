package SistemaBancario;

import java.io.Serializable;

/**
 * Classe que abstrai uma Conta Bancária
 * @author Sarah Tumenas
 * @version 1.0
 */

public class Conta implements Serializable {

    //atributos que caracterizam a classe

    private static final long serialVersionUID = 1L;
    private int agencia;
    private int numero;
    private double saldo;


    //construtor padrão, necessário para o consumo de APIs
    public Conta () {



    }


    //construtor de classe com as informações para gerar objetos
    public Conta (int agencia, int numero, double saldo){


        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;

    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
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
    public double getSaldo (){

        return this.saldo;
    }

}
