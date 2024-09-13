import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        EmpresaE2 empresa = new EmpresaE2();

        FuncionarioHoristaE2 horista = new FuncionarioHoristaE2("João", "123456789", 0, 160, 50);
        FuncionarioMensalistaE2 mensalista = new FuncionarioMensalistaE2("Maria", "987654321", 0, 3000);

        System.out.println("Folha de pagamento: " + empresa.calcularFolhaDePagamento());
        empresa.adicionarFuncionario(horista);
        
        System.out.println("Folha de pagamento: " + empresa.calcularFolhaDePagamento());
        empresa.adicionarFuncionario(mensalista);

        System.out.println("Folha de pagamento: " + empresa.calcularFolhaDePagamento());

        ArrayList<FuncionarioE2> funcionarios = empresa.buscarFuncionarioPorNome("João");
        for (FuncionarioE2 funcionario : funcionarios) {
            System.out.println("Funcionário encontrado: " + funcionario.getNome());
        }

        empresa.removerFuncionario("123456789");
        System.out.println("Folha de pagamento após remoção: " + empresa.calcularFolhaDePagamento());
    }
}