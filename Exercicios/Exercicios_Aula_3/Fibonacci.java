package Exercicios.Exercicios_Aula_3;
/*
public class Fibonacci {
    static long fibo(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            System.out.print(fibo(i) + " ");
        }
    }
}
*/

public class Fibonacci {
    static long fibo(int n) {
        return (n < 2) ? n : fibo(n - 1) + fibo(n - 2);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            System.out.print(fibo(i) + " ");
        }
    }
}

/*
public class Fibonacci {
    static long fibo(int n) {
        int F = 0;
        int ant = 0;

        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                F = 1;
                ant = 0;
            } else {
                F += ant;
                ant = F - ant;
            }
        }

        return F;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            System.out.print(fibo(i) + " ");
        }
    }
}
*/
