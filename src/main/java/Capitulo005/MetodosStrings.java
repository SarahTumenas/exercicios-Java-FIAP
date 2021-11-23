package Capitulo005;

import java.util.Arrays;
import java.util.Locale;

public class MetodosStrings {
    public static void main(String[] args) {


        String nome = new String("uva");
        String nome2 = new String("Uva");
        String nome3 = new String("uva");

        System.out.println(nome.equals(nome2)); // false

        System.out.println(nome.equalsIgnoreCase(nome2)); // true

        System.out.println(nome.equals(nome3)); // true

        boolean teste = (nome == nome3);
        System.out.println(teste); // false

        String nome4 = "caju";
        String nome5 = "caju";

        teste = (nome4 == nome5);
        System.out.println(teste);//true


        String descricao = new String("Maçã Gala, a mais doce do mercado!");

        System.out.println(descricao.length());

        System.out.println(descricao.startsWith("Maçã"));

        System.out.println(descricao.endsWith("!"));

        System.out.println(descricao.charAt(1));

        System.out.println(descricao.indexOf("G"));

        System.out.println(descricao.indexOf("Gala"));

        System.out.println(descricao.indexOf("a"));

        System.out.println(descricao.lastIndexOf("a"));

        System.out.println(descricao.replace("G", "g"));
        System.out.println(descricao.replace("Gala", "Fuji"));

        System.out.println(descricao.split(" ").length);
        System.out.println(Arrays.toString(descricao.split(" ")));


        System.out.println(descricao.toLowerCase());
        System.out.println(descricao.toUpperCase());

        System.out.println(descricao.substring(0,3));
        System.out.println(descricao.substring(6));

        System.out.println(descricao.substring(
                descricao.indexOf("Maçã"),
                descricao.indexOf(" ")
        ));

        System.out.println(descricao);


    }
}
