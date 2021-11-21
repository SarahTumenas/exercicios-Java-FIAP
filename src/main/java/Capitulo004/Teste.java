package Capitulo004;

public class Teste {

    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.setAlimenta("Todo animal se alimenta.");
        animal.setLocomove("todo animal se locomove");

        Cachorro cachorro = new Cachorro();
        cachorro.setAlimenta("Cachorro come ração de cachorro.");
        cachorro.setLocomove("Cachorro usa 4 patas.");
        cachorro.setLatido("Au Au");


        Animal pitbull = new Cachorro();
        pitbull.setLocomove("Pitbull usa 4 patas");
        pitbull.setAlimenta("Pitbull usa 4 patas");

        Passaro passaro = new Passaro();
        passaro.setAlimenta("Pássaros comem grãos");
        passaro.setLocomove("Passáros voam");
        passaro.setPia("Piu Piu");

        Animal galinha = new Passaro();
        galinha.setAlimenta("Galinhas comem grãos");
        galinha.setLocomove("Galinhas não voam");

        System.out.println(galinha.getLocomove());

    }
}
