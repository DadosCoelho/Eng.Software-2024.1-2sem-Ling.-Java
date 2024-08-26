package Exercicios.projetos_Alonza;

import java.util.Scanner;

public class Calculator {
   public static void main(String[] args) {
       double num1;
       double num2;
       char operator;
       try (Scanner scanner = new Scanner(System.in)) {
           System.out.print("Digite o primeiro número: ");
           num1 = scanner.nextDouble();
           System.out.print("Digite o segundo número: ");
           num2 = scanner.nextDouble();
           System.out.print("Digite a operação (+, -, *, /): ");
           operator = scanner.next().charAt(0);
       }
      double result;

      switch(operator) {
         case '+' -> result = num1 + num2;
         case '-' -> result = num1 - num2;
         case '*' -> result = num1 * num2;
         case '/' -> result = num1 / num2;
         default -> {
             System.out.println("Operação inválida.");
             return;
           }
      }

      System.out.println(num1+" "+operator+" "+num2+": "+result);
   }
}
