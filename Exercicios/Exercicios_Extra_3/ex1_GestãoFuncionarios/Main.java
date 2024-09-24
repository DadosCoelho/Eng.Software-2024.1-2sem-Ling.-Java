import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        EmpresaE3 empresa = new EmpresaE3();

        FuncionarioHoristaE3 horista = new FuncionarioHoristaE3("João", "12345678900", 0, LocalDate.now(), "Desenvolvedor", 160, 50);
        FuncionarioMensalistaE3 mensalista = new FuncionarioMensalistaE3("Maria", "09876543211", 0, LocalDate.now(), "Gerente", 5000);

        empresa.adicionarFuncionario(horista);
        empresa.adicionarFuncionario(mensalista);

        System.out.println("Folha de pagamento: " + empresa.calcularFolhaDePagamento());

        empresa.demitirFuncionario("12345678900");

        System.out.println("Folha de pagamento após demissão: " + empresa.calcularFolhaDePagamento());
    }
}

