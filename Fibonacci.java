package Questão3;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de numeros da serie de Fibonacci: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Por favor, digite um número maior que zero.");
        } else {
            int[] fibonacci = new int[n];

            for (int i = 0; i < n; i++) {
                if (i == 0) {
                    fibonacci[i] = 0;
                } else if (i == 1) {
                    fibonacci[i] = 1;
                } else {
                    fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
                }
            }

            System.out.print("[");
            for (int i = 0; i < n; i++) {
                System.out.print(fibonacci[i]);
                if (i < n - 1) System.out.print(", ");
            }
            System.out.println("]");
        }
    }
}
