import java.util.ArrayList;

public class SupermercadoE3e4 {
    private ArrayList<FuncionarioE3e4> funcionarios;
    private ArrayList<ContaE3e4> contas;
    private ArrayList<ProdutoE3e4> produtos;
    private ArrayList<OperacaoE3e4> operacoes;

    public SupermercadoE3e4() {
        this.funcionarios = new ArrayList<>();
        this.contas = new ArrayList<>();
        this.produtos = new ArrayList<>();
        this.operacoes = new ArrayList<>();
    }

    public void adicionarFuncionario(FuncionarioE3e4 funcionario) {
        funcionarios.add(funcionario);
    }

    public void removerFuncionario(String cpf) {
        funcionarios.removeIf(funcionario -> funcionario.getCpf().equals(cpf));
    }

    public ArrayList<FuncionarioE3e4> buscarFuncionarioPorNome(String nome) {
        ArrayList<FuncionarioE3e4> resultado = new ArrayList<>();
        for (FuncionarioE3e4 funcionario : funcionarios) {
            if (funcionario.getNome().equalsIgnoreCase(nome)) {
                resultado.add(funcionario);
            }
        }
        return resultado;
    }

    public void adicionarConta(ContaE3e4 conta) {
        contas.add(conta);
    }

    public void removerConta(String numeroConta) {
        contas.removeIf(conta -> conta.getNumeroConta().equals(numeroConta));
    }

    public ArrayList<ContaE3e4> buscarContaPorTitular(String titular) {
        ArrayList<ContaE3e4> resultado = new ArrayList<>();
        for (ContaE3e4 conta : contas) {
            if (conta.getTitular().equalsIgnoreCase(titular)) {
                resultado.add(conta);
            }
        }
        return resultado;
    }

    public void adicionarProduto(ProdutoE3e4 produto) {
        produtos.add(produto);
    }

    public void removerProduto(String codigo) {
        produtos.removeIf(produto -> produto.getCodigo().equals(codigo));
    }

    public ArrayList<ProdutoE3e4> buscarProdutoPorNome(String nome) {
        ArrayList<ProdutoE3e4> resultado = new ArrayList<>();
        for (ProdutoE3e4 produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                resultado.add(produto);
            }
        }
        return resultado;
    }

    public void adicionarOperacao(OperacaoE3e4 operacao) {
        operacoes.add(operacao);
    }

    public void removerOperacao(String idOperacao) {
        operacoes.removeIf(operacao -> ((OperacaoConcretaE3e4) operacao).getIdOperacao().equals(idOperacao));
    }

    public double calcularFolhaDePagamento() {
        double total = 0;
        for (FuncionarioE3e4 funcionario : funcionarios) {
            total += funcionario.getSalario();
        }
        return total;
    }

    public double calcularSaldoTotal() {
        double total = 0;
        for (ContaE3e4 conta : contas) {
            total += conta.getSaldo();
        }
        return total;
    }

    public double calcularValorTotalEstoque() {
        double total = 0;
        for (ProdutoE3e4 produto : produtos) {
            total += produto.calcularValorEstoque();
        }
        return total;
    }

    public String gerarRelatorioGeral() {
        StringBuilder relatorio = new StringBuilder();
        relatorio.append("Relatório Geral:\n");
        relatorio.append("Funcionários:\n");
        for (FuncionarioE3e4 funcionario : funcionarios) {
            relatorio.append(funcionario.getNome()).append(", ").append(funcionario.getCargo()).append("\n");
        }
        relatorio.append("Contas:\n");
        for (ContaE3e4 conta : contas) {
            relatorio.append(conta.getTitular()).append(", Saldo: ").append(conta.getSaldo()).append("\n");
        }
        relatorio.append("Produtos:\n");
        for (ProdutoE3e4 produto : produtos) {
            relatorio.append(produto.getNome()).append(", Quantidade: ").append(produto.getQuantidade()).append("\n");
        }
        return relatorio.toString();
    }

    public void realizarVenda(String codigoProduto, int quantidade, ContaE3e4 conta) {
        for (ProdutoE3e4 produto : produtos) {
            if (produto.getCodigo().equals(codigoProduto)) {
                produto.removerEstoque(quantidade);
                conta.depositar(produto.getPreco() * quantidade);
                break;
            }
        }
    }

    public void realizarCompra(String codigoProduto, int quantidade, ContaE3e4 conta) {
        for (ProdutoE3e4 produto : produtos) {
            if (produto.getCodigo().equals(codigoProduto)) {
                produto.adicionarEstoque(quantidade);
                conta.sacar(produto.getPreco() * quantidade);
                break;
            }
        }
    }

    public String gerarRelatorioInventario() {
        StringBuilder relatorio = new StringBuilder();
        relatorio.append("Relatório de Inventário:\n");
        for (ProdutoE3e4 produto : produtos) {
            relatorio.append(produto.getNome()).append(", Quantidade: ").append(produto.getQuantidade()).append("\n");
        }
        return relatorio.toString();
    }
}

