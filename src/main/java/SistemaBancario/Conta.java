package SistemaBancario;

//atributos que caracterizam a classe
public class Conta {

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

    //método de depósito
    public void depositar (double valor){

        this.saldo += valor;
    }


    // método de saque
    public void  retirar ( double valor){

        this.saldo -= valor;
    }


    // método de saldo
    public double verificarSaldo (){

        return this.saldo;
    }

}
