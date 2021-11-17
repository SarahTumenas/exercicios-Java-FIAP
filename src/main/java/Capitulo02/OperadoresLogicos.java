package Capitulo02;

public class OperadoresLogicos {
    public static void main(String[] args) {

        int idade = 20;

        boolean precisaVotar = idade >= 18 && idade < 70;

        System.out.println(precisaVotar);

        int nrAmarelo = 1, nrVermelho = 0;

        boolean suspenso = nrAmarelo == 2 || nrVermelho == 1; // inclusivo ||

        System.out.println(suspenso);


        int x = 9, y =11;
        boolean teste = x > 10 ^ y > 10; // exclusivo ^
        boolean segundoteste = x >10 ^ y < 10;

        System.out.println(teste);
        System.out.println(segundoteste);


        int age = 20;
        boolean  ageofmajority = !(idade >= 18);

        System.out.println(ageofmajority);






    }
}
