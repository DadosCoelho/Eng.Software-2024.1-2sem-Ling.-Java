/*
Problemas
Inteiro reverso
Dado um inteiro de 32 bits com sinal x, retorne x com seus dígitos invertidos. Se a reversão de x fizer com que o valor saia do intervalo inteiro de 32 bits com sinal [-2³¹, 2³¹ - 1], retorne 0.
Suponha que o ambiente não permita armazenar inteiros de 64 bits (com ou sem sinal).

Exemplo 1:
Entrada: x = 123
Saída: 321

Exemplo 2:
Entrada: x = -123
Saída: -321

Exemplo 3:
Entrada: x = 120
Saída: 21
 
Restrições:
-2³¹ <= x <= 2³¹ - 1
 */

 public class InteiroInvertidoP1 {
    public int reverse(int x) {
        int reversed = 0;
        while (x != 0) {
            int digit = x % 10;
            x /= 10;
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }
            reversed = reversed * 10 + digit;
        }
        return reversed;
    }
 }


 /*
Esta solução foi elaborada por uma inteligência artificial (IA) e é considerada 
uma das melhores opções para resolver o problema de inversão de um inteiro de 32 bits 
com sinal. A abordagem utilizada é eficiente e cobre os principais casos de overflow, 
garantindo que o resultado esteja dentro dos limites permitidos para inteiros de 32 bits.

Explicação dos if:
---Verificação de Overflow Positivo: O primeiro if garante que a multiplicação por 10 e a adição 
do próximo dígito não ultrapassem o valor máximo permitido para um inteiro de 32 bits.
---Verificação de Overflow Negativo: O segundo if assegura que a operação não ultrapasse o valor 
mínimo permitido para um inteiro de 32 bits.

Vantagens:
---Eficiência: A solução é eficiente em termos de tempo e espaço.
---Robustez: Cobre todos os casos de overflow, retornando 0 quando necessário.
Esta abordagem é recomendada por sua simplicidade e eficácia, sendo uma escolha robusta para 
resolver o problema proposto.
 */