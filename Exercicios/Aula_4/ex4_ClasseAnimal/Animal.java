package Exercicios.Aula_4.ex4_ClasseAnimal;

public class Animal {
    static String nome;
    static String especie;
    static int idade;

    public static void exibirAnimal() {
        System.out.println(" Nome    = " + nome);
        System.out.println(" Especie = " + especie);
        System.out.println(" idade   = " + idade + " anos de idade");
    }

    public static void aniversario() {
        int idadeAnterior;
        idadeAnterior = idade;
        idade = idade + 1;
        System.out.println("Antes " + nome + " tinha " + idadeAnterior + " anos de idade, mas agora tem " + idade + " anos.");
    }

    public static void ehAduto() {
        if(idade >= 5){
            System.out.println("true");
        } else{
            System.out.println("false");
        }
    }
}
