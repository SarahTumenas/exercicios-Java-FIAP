package Capitulo03Classes;

public class TesteConta {
    public static void main(String[] args) {
        Conta contaCorrente = new Conta ();
        Conta contaPoupanca = new Conta ();
        Conta contaInvestimento = new Conta ();
        Conta cc = new Conta(1000, 50.0);



        //contaCorrente.numero = 11;
        //contaCorrente.saldo = 20.20;
        contaCorrente.cliente.nome = "Leandro";
        contaCorrente.cliente.idade = 36;

       // contaPoupanca.numero =  22;
       // contaPoupanca.saldo =   300;
        contaPoupanca.cliente.nome = "Marcos";
        contaPoupanca.cliente.idade = 55;

        //contaInvestimento.numero = 33;
        //contaInvestimento.saldo = 1500;
        contaInvestimento.cliente.nome = "Marcia";
        contaInvestimento.cliente.idade = 41;

        //System.out.println(contaCorrente.numero);
        //System.out.println(contaCorrente.saldo);
        System.out.println(contaCorrente.cliente.nome);
        System.out.println(contaCorrente.cliente.idade);

        cc.setNumero(1000);
        System.out.println(cc.recuperarSaldo());


    }
}
