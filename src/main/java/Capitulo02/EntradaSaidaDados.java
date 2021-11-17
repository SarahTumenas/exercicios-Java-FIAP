package Capitulo02;

import java.util.Scanner;

public class EntradaSaidaDados {

    public static void main(String[] args) {

        int age = 0;

        Scanner sc = new Scanner (System.in);

        System.out.println("Digite seu nome:");
        String name = sc.next();

        System.out.println("Digite o nome completo: ");
        String nomecompleto = sc.nextLine();


        System.out.println("Digite sua idade: ");
        age = sc.nextInt();


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

