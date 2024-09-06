package Exercicios.Aula_08.ex2_GerenciamentoBancario;

public class ContaBancaria {
    String titular;
    String numeroConta;
    private double saldo;
    private boolean ativar;

    public ContaBancaria(String titular, String numeroConta){
        this.titular = titular;
        this.numeroConta = numeroConta;
    }

    public String getTitular(){
        return titular;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }



}
