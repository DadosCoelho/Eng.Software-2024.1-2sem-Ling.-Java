import java.util.ArrayList;

class EmpresaE2 {
    private ArrayList<FuncionarioE2> funcionarios;

    public EmpresaE2() {
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(FuncionarioE2 funcionario) {
        funcionarios.add(funcionario);
    }

    public void removerFuncionario(String cpf) {
        funcionarios.removeIf(funcionario -> funcionario.getCpf().equals(cpf));
    }

    public ArrayList<FuncionarioE2> buscarFuncionarioPorNome(String nome) {
        ArrayList<FuncionarioE2> resultado = new ArrayList<>();
        for (FuncionarioE2 funcionario : funcionarios) {
            if (funcionario.getNome().equalsIgnoreCase(nome)) {
                resultado.add(funcionario);
            }
        }
        return resultado;
    }

    public double calcularFolhaDePagamento() {
        double total = 0;
        for (FuncionarioE2 funcionario : funcionarios) {
            total += funcionario.calcularSalario();
        }
        return total;
    }
}