package Capitulo02;

public class FluxoControle {
    public static void main(String[] args) {

        int age = 25;


        if (age >= 18 && age < 70) {

            System.out.println("Maioridade");

        } else if (age >= 70){

            System.out.println("Terceira idade");

            if (age >= 100){
                System.out.println("Centenária");
            }

        } else {

            System.out.println("Menoridade");
        }
    }
}