package Capitulo005;

public class Caixa extends Produto {

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


        Produto [] produtos = new Produto[2];

        Produto prod1 = new Produto();
        prod1.setNome("Limão");
        prod1.setDescricao("Galego");
        prod1.setValor(4);

        Produto prod2 = new Produto();
        prod2.setNome("Maça");
        prod2.setDescricao("Gala");
        prod2.setValor(5);

        produtos[0] = prod1;
        produtos[1]= prod2;

        /* for (int i = 0; i < produtos.length; i++){

            System.out.println(produtos[i].toString());
        } */

        for (Produto prod: produtos) {

            System.out.println(prod.toString());

        }

        //10 corredores com três parteleiras cada
        Produto[][] localizacaoProduto = new Produto[10][3];
        localizacaoProduto [2][1] = prod1;
        localizacaoProduto [2][2] = prod2;

        System.out.println(localizacaoProduto[2][1].getNome());
    }
}
