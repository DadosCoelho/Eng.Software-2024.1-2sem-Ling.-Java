package Exercicios.Aula_3;

public class CalculoDesconto {
    public static void main(String[] args) {
        double valorCompra = 2024.0; // Substitua pelo valor da compra

        String tipoCliente = "VIP"; // Substitua pelo tipo de cliente (VIP ou outro)

        double desconto = 0.0;

        if (valorCompra > 100 && tipoCliente.equals("VIP")) {
            desconto = 0.2; // 20% de desconto
        } else if (valorCompra > 50) {
            desconto = 0.1; // 10% de desconto
        }

        double valorFinal = valorCompra - (valorCompra * desconto);

        System.out.println("Valor final da compra: R$ " + valorFinal);
    }
}

