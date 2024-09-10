package Exercicios.Aula_8.ex2_GerenciamentoBancario;

public class ContaBancaria {
    String titular;
    String numeroConta;
    private double saldo;
    private boolean ativa;

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

    public String getNumeroConta(){
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta){
        this.numeroConta = numeroConta;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public boolean getAtiva(){
        return ativa;
    }

    public void setAtiva(boolean ativa){
        this.ativa = ativa;
    }

    public void depositar(double valor){
        if(valor > 0){
            if(getAtiva()){
                setSaldo(getSaldo()+valor);
                System.out.println(" ");
                System.out.println("Deposito efetuado na conta "+getNumeroConta()+" no valor R$"+valor);
                System.out.println(" ");
            } else {
                System.out.println("Deposito não foi possivel pois:");
                System.out.println("Conta "+getNumeroConta()+" está desativada.");
                System.out.println(" ");
            }
        } else {
            System.out.println("Deposito não foi possivel pois:");
            System.out.println("Erro ao digitar o valor.");
            System.out.println(" ");
        }
    }

    public void sacar(double valor){
        if(valor > 0){
            if(getAtiva()){
                if(valor <= getSaldo()){
                    setSaldo(getSaldo()-valor);
                    System.out.println(" ");
                    System.out.println("Saque efetuado na conta "+getNumeroConta()+" no valor R$"+valor);
                    System.out.println(" ");
                } else {
                    System.out.println("Saque não foi possivel pois:");
                    System.out.println("saldo insuficiente para saque.");
                    System.out.println(" ");
                }
            } else {
                System.out.println("Saque não foi possivel pois:");
                System.out.println("Conta "+getNumeroConta()+" está desativada.");
                System.out.println(" ");
            }
        } else {
            System.out.println("Saque não foi possivel pois:");
            System.out.println("Erro ao digitar o valor.");
            System.out.println(" ");
        }
    }

    public void ativarConta(){
        if(getAtiva()){
            System.out.println("Ativar conta não foi possivel pois:");
            System.out.println("Conta "+getNumeroConta()+" já se encontra ativada.");
            System.out.println(" ");
        } else {
            setAtiva(true);
            System.out.println(" ");
            System.out.println("Conta "+getNumeroConta()+" ativada com sucesso!");
            System.out.println(" ");
        }
    }

    public void desativarConta(){
        if(getAtiva()){
            setAtiva(false);
            System.out.println(" ");
            System.out.println("Conta "+getNumeroConta()+" desativada com sucesso!");
            System.out.println(" ");
        } else {
            System.out.println("Desativar conta não foi possivel pois:");
            System.out.println("Conta "+getNumeroConta()+" já se encontra desativada.");
            System.out.println(" ");
        }
    }

    public void transferir(ContaBancaria numeroContaDestino, double valor){
        if(valor > 0){
            if(getAtiva() && numeroContaDestino.ativa){
                if(valor <= getSaldo()){
                    this.sacar(valor);
                    numeroContaDestino.depositar(valor);
                    System.out.println(" ");
                    System.out.println("Transferência efetuado na conta "+getNumeroConta()+" no valor R$"+valor);
                    System.out.println(" ");
                } else {
                    System.out.println("Transferencia não foi possivel pois:");
                    System.out.println("saldo insuficiente na conta:"+getNumeroConta()+" para Transferência.");
                    System.out.println(" ");
                }
            } else {
                if (getAtiva()) {
                    System.out.println("Transferencia não foi possivel pois:");
                    System.out.println("Conta "+numeroContaDestino.getNumeroConta()+" desativada.");
                    System.out.println(" ");
                } else {
                    System.out.println("Transferencia não foi possivel pois:");
                    System.out.println("Conta "+numeroConta+" desativada.");
                    System.out.println(" ");
                }
            }
        } else {
            System.out.println("Transferencia não foi possivel pois:");
            System.out.println("Erro ao digitar o valor.");
            System.out.println(" ");
        }
    }
}
