package Capitulo03Classes;

public class Conta {

    private int numero;
    int agencia;
    private double saldo;

    public Conta (){

    }


    public Conta (int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;

    }

    Cliente cliente = new Cliente();

    public double recuperarSaldo (){
        return saldo;
    }

    public void depositar (double valor){
        saldo = saldo + valor;
    }

    public void retirar (double valor){
        saldo = saldo - valor;
    }

    public void retirar (double valor, double taxa){
        saldo = saldo - valor -taxa;
    }

    public void setAgencia (int agencia){
        this.agencia = agencia;
    }

    public void setNumero (int numero) {
        this.numero = numero;
    }

    public int getNumero (){
        return numero;
    }

}
