package Exercicios.Aula_4.ex4_ClasseAnimal;

public class Main {

    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        Animal Animal = new Animal();

        Animal.nome = "Bili";
        Animal.especie = "Desconhecido";
        Animal.idade = 4;

        Animal.exibirAnimal();
        Animal.aniversario();
        Animal.ehAduto();

        Animal Animal2 = new Animal();

        Animal2.nome = "Lulu";
        Animal2.especie = "Vira lata";
        Animal2.idade = 4;

        Animal2.exibirAnimal();
        Animal.ehAduto();
    }
}
