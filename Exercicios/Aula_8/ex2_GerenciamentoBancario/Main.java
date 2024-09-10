package Exercicios.Aula_8.ex2_GerenciamentoBancario;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("Reinaldo", "00001-01");
        ContaBancaria conta2 = new ContaBancaria("Reinaldo", "00002-01");

        /*
        conta1.ativarConta();
        conta1.depositar(500);

        conta1.sacar(200);

        conta1.transferir(conta2, 100);

        conta2.ativarConta();

        conta1.transferir(conta2, 100);
        */

        conta1.ativarConta();
        conta2.ativarConta();

        conta1.depositar(500);
        conta2.depositar(300);

        System.out.println("Titular: " + conta1.getTitular());
        System.out.println("Número da Conta: " + conta1.getNumeroConta());
        System.out.println("Saldo: " + conta1.getSaldo());

        System.out.println("Titular: " + conta2.getTitular());
        System.out.println("Número da Conta: " + conta2.getNumeroConta());
        System.out.println("Saldo: " + conta2.getSaldo());

        conta1.desativarConta();

        conta1.transferir(conta2, 200);

        System.out.println("Saldo Conta 1 após tentativa de transferência: " + conta1.getSaldo());
        System.out.println("Saldo Conta 2 após tentativa de transferência: " + conta2.getSaldo());

        conta1.ativarConta();
        conta1.transferir(conta2, 200);

        System.out.println("Saldo Conta 1 após transferência: " + conta1.getSaldo());
        System.out.println("Saldo Conta 2 após transferência: " + conta2.getSaldo());

        conta2.desativarConta();
        conta2.sacar(100);

        System.out.println("Saldo Conta 2 final: " + conta2.getSaldo());

    }
}
