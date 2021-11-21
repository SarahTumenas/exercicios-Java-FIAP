package SistemaBancario;

public class TesteUnitario {

    public static void main(String[] args) { /*método main para poder executar a classe, não precisa de atributos,
     pois usará os da Classe */


        // para criar a conta corrente,foi utilizado o construtor padrão da Classe Conta
        // cc é a variável referência ao objeto Conta

        Conta cc = new Conta ();
        cc.depositar(253.00);
        cc.setAgencia(123);
        cc.setNumero(3214);


        cc.depositar(1000);

        System.out.println(cc.getSaldo());



        //para criar a conta poupança, foi utilizado o construtor de Classe da Classe Conta

        Conta poupanca = new Conta (111, 222, 3200);

        poupanca.retirar(250);
        System.out.println(poupanca.getSaldo());

        /* quando a variável não está referenciada ao objeto, dará um erro de nulidade de exceção(NullPointerException),
        utilizamos o if para proteger o código para que este tipo de erro não ocorra
         */

        Conta cc2 = null;
        if (cc2 != null){
            cc2.depositar(100);
        } else {
            System.out.println("Conta inválida");
        }

/*
Utilizando superclasse e subclasses
 */
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.setAgencia(123);
        contaCorrente.setNumero(4321);
        contaCorrente.setTipo("PF");
        contaCorrente.setChequeEspecial(2000);

        contaCorrente.retirar(500);
        System.out.println(contaCorrente.getSaldoDisponivel());

/*
Utilizando Override
 */
        Conta conta1 = new Conta();
        conta1.depositar(1000);
        conta1.retirar(100);

        ContaCorrente conta2 = new ContaCorrente();
        conta2.depositar(1000);
        conta2.retirar(100);

        Conta conta3 = new ContaCorrente();
        conta3.depositar(1000);
        conta3.retirar(100);

        System.out.println("Conta1: " + conta1.getSaldo());
        System.out.println("Conta2: " + conta2.getSaldo());
        System.out.println("Conta3: " + conta3.getSaldo());



    }
}
