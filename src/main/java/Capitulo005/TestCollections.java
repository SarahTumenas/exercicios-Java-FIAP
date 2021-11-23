package Capitulo005;

import java.util.*;

public class TestCollections {

    public static void main(String[] args) {

        ArrayList carrinho = new ArrayList();
        Double valor = 100.55;
        int valor2 = 1;
        int valor3;

        carrinho.add(valor);
        carrinho.add("Manga");
        carrinho.add(valor2);

        System.out.println(carrinho.get(1));

        valor3 = (int) carrinho.get(2);

        System.out.println(valor3);


        //Interface List e uso de Generics
        //Generics não permite tipos primitivos

        List<String> carrinho1 = new ArrayList<String>();

        System.out.println(carrinho1.isEmpty());

        carrinho1.add("Maçã");
        carrinho1.add("Morango");
        carrinho1.add("Manga");
        carrinho1.set(1,"Pera");

        System.out.println(carrinho1.isEmpty());
        System.out.println(carrinho1.size());

        System.out.println(carrinho1.contains("Maçã"));
        System.out.println(carrinho1.indexOf("Maçã"));
        System.out.println(carrinho1.get(carrinho1.indexOf("Maçã")));
        System.out.println(carrinho1.lastIndexOf("Manga"));

        carrinho1.remove(carrinho1.indexOf("Maçã"));
        System.out.println(carrinho1.get(0));

        carrinho1.clear();
        System.out.println(carrinho1.isEmpty());


        Set <String> cesta = new HashSet<>();

        System.out.println(cesta.isEmpty());
        cesta.add("Uva");
        cesta.add("Uva");
        cesta.add("uva");
        System.out.println(cesta.isEmpty());

        System.out.println(cesta.size());
        System.out.println(cesta);


        Map <String, String> caixa = new HashMap<>();
        caixa.put("M2225", "Fernando");
        caixa.put("M2226", "Maria");
        caixa.put("M2227", "Sandra");

        System.out.println(caixa.isEmpty());
        System.out.println(caixa.size());
        System.out.println(caixa.containsKey("M2225"));
        System.out.println(caixa.containsValue("Fernando"));
        System.out.println(caixa);


    }


}
