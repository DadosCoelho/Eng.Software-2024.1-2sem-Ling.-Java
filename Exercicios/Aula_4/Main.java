package Exercicios.Aula_4;

public class Main {
    public static void main(String[] args) {
        System.out.println("Teste");

        Carro car = new Carro();


        Comer();
        //num.Voar();
        Carro.Ligar();
        car.Desligar();
    }

    public static void Comer() {
        System.out.println("Comendo!");
    }

    public void Voar() {
        System.out.println("Voando!");
    }
}
