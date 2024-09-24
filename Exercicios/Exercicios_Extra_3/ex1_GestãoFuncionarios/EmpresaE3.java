import java.util.ArrayList;

public class EmpresaE3 {
    private ArrayList<FuncionarioE3> funcionarios;

    public EmpresaE3() {
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(FuncionarioE3 funcionario) {
        funcionarios.add(funcionario);
    }

    public void removerFuncionario(String cpf) {
        funcionarios.removeIf(funcionario -> funcionario.getCpf().equals(cpf));
    }

    public ArrayList<FuncionarioE3> buscarFuncionarioPorNome(String nome) {
        ArrayList<FuncionarioE3> resultado = new ArrayList<>();
        for (FuncionarioE3 funcionario : funcionarios) {
            if (funcionario.getNome().equalsIgnoreCase(nome)) {
                resultado.add(funcionario);
            }
        }
        return resultado;
    }

    public double calcularFolhaDePagamento() {
        double total = 0;
        for (FuncionarioE3 funcionario : funcionarios) {
            if (funcionario.isAtivo()) {
                total += funcionario.calcularSalario();
            }
        }
        return total;
    }

    public void demitirFuncionario(String cpf) {
        for (FuncionarioE3 funcionario : funcionarios) {
            if (funcionario.getCpf().equals(cpf)) {
                funcionario.demitir();
                break;
            }
        }
    }
}
