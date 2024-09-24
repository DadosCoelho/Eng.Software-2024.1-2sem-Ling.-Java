import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        SupermercadoE3e4 supermercado = new SupermercadoE3e4();

        FuncionarioE3e4 funcionario1 = new FuncionarioE3e4("João Silva", "12345678900", 2500.0, LocalDate.of(2022, 1, 10), true, "Caixa") {
            @Override
            public double calcularSalario() {
                return getSalario();
            }
        };
        FuncionarioE3e4 funcionario2 = new FuncionarioE3e4("Maria Oliveira", "09876543211", 3000.0, LocalDate.of(2021, 5, 15), true, "Gerente") {
            @Override
            public double calcularSalario() {
                return getSalario();
            }
        };
        supermercado.adicionarFuncionario(funcionario1);
        supermercado.adicionarFuncionario(funcionario2);

        // Adicionando contas
        ContaE3e4 conta1 = new ContaE3e4("001", "Supermercado Central", 10000.0) {
            @Override
            public double calcularSaldo() {
                return getSaldo();
            }
        };
        ContaE3e4 conta2 = new ContaE3e4("002", "Supermercado Filial", 5000.0) {
            @Override
            public double calcularSaldo() {
                return getSaldo();
            }
        };
        supermercado.adicionarConta(conta1);
        supermercado.adicionarConta(conta2);

        // Adicionando produtos
        ProdutoE3e4 produto1 = new ProdutoE3e4("001", "Arroz", 20.0, 100);
        ProdutoE3e4 produto2 = new ProdutoE3e4("002", "Feijão", 10.0, 200);
        supermercado.adicionarProduto(produto1);
        supermercado.adicionarProduto(produto2);

        // Realizando operações de entrada e saída de estoque
        OperacaoE3e4 operacao1 = new OperacaoConcretaE3e4("001", produto1, 50, "entrada", conta1);
        OperacaoE3e4 operacao2 = new OperacaoConcretaE3e4("002", produto2, 30, "saida", conta2);
        supermercado.adicionarOperacao(operacao1);
        supermercado.adicionarOperacao(operacao2);
        operacao1.executar();
        operacao2.executar();

        // Realizando vendas e compras de produtos
        supermercado.realizarVenda("001", 10, conta1);
        supermercado.realizarCompra("002", 20, conta2);

        // Buscando funcionários, contas e produtos por nome
        System.out.println("Funcionários com nome 'João': " + supermercado.buscarFuncionarioPorNome("João Silva"));
        System.out.println("Contas com titular 'Supermercado Central': " + supermercado.buscarContaPorTitular("Supermercado Central"));
        System.out.println("Produtos com nome 'Arroz': " + supermercado.buscarProdutoPorNome("Arroz"));

        // Calculando folha de pagamento, saldo total das contas e valor total do estoque
        System.out.println("Folha de pagamento total: " + supermercado.calcularFolhaDePagamento());
        System.out.println("Saldo total das contas: " + supermercado.calcularSaldoTotal());
        System.out.println("Valor total do estoque: " + supermercado.calcularValorTotalEstoque());

        // Gerando relatórios
        System.out.println(supermercado.gerarRelatorioGeral());
        System.out.println(supermercado.gerarRelatorioInventario());

        // Removendo funcionários, contas, produtos e operações do sistema
        supermercado.removerFuncionario("12345678900");
        supermercado.removerConta("001");
        supermercado.removerProduto("001");
        supermercado.removerOperacao("001");
    }
}
