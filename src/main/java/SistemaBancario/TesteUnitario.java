package SistemaBancario;

public class TesteUnitario {

    public static void main(String[] args) { /*método main para poder executar a classe, não precisa de atributos,
     pois usará os da Classe */


        // para criar a conta corrente,foi utilizado o construtor padrão da Classe Conta
        // cc é a variável referência ao objeto Conta

        Conta cc = new Conta ();
        cc.saldo = 253.00;
        cc.agencia = 123;
        cc.numero = 3214;

        cc.depositar(1000);

        System.out.println(cc.verificarSaldo());



        //para criar a conta poupança, foi utilizado o construtor de Classe da Classe Conta

        Conta poupanca = new Conta (111, 222, 3200);

        poupanca.retirar(250);
        System.out.println(poupanca.verificarSaldo());

        /* quando a variável não está referenciada ao objeto, dará um erro de nulidade de exceção(NullPointerException),
        utilizamos o if para proteger o código para que este tipo de erro não ocorra
         */

        Conta cc2 = null;
        if (cc2 != null){
            cc2.depositar(100);
        } else {
            System.out.println("Conta inválida");
        }



    }
}
