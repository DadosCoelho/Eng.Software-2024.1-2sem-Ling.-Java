package Exercicios.Aula_9.Ex2_CarroEranca;

public class Main {
    public static void main(String[] args) {
        Energia carro1 = new Energia();
        Gasolina carro2 = new Gasolina();

        carro1.nome = "Corsa";
        carro1.marca = "W";
        carro1.ApresentacaoEnergia();

        carro2.nome = "Fiurino";
        carro2.marca = "F";
        carro2.ApresentacaoGasolina();
    }
}
