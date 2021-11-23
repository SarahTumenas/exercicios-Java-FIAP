package Capitulo005;

public class Caixa {

    public static void main(String[] args) {

        int qtdProdutos = 5;
        //int registro = 0;

        /* utilizando while

        while (registro < qtdProdutos){

            registro++;
            System.out.println("O produto número: " + registro + " foi registrado");
        }*/



        /* Utilizando do while

        do {
            registro++;
            System.out.println("O caixa registrou o produto: " + registro);
        } while (registro < qtdProdutos);
        */

        /* Utilizando for */

        for (int i = 1 ; i <= qtdProdutos; i++){

            System.out.println("O caixa registrou o produto: " + i);
        }



    }
}
