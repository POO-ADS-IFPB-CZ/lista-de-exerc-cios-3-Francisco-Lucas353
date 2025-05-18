package Questão2;

import java.util.Arrays;
import java.util.Scanner;

public class nMegasena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[6];
        int quantidade = 0;

        System.out.println("Digite 6 numeros distintos entre 1 e 60:");

        while (quantidade < 6) {
            System.out.print("Numero " + (quantidade + 1) + ": ");
            int numero = scanner.nextInt();

            if (numero < 1 || numero > 60) {
                System.out.println("Numero invalido. Deve estar entre 1 e 60.");
            } else if (contido(numeros, quantidade, numero)) {
                System.out.println("Numero ja inserido. Digite um diferente.");
            } else {
                numeros[quantidade] = numero;
                quantidade++;
            }
        }

        Arrays.sort(numeros);

        System.out.println("\nNúmeros digitados em ordem crescente:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }

    private static boolean contido(int[] array, int tamanho, int valor) {
        for (int i = 0; i < tamanho; i++) {
            if (array[i] == valor) {
                return true;
            }
        }
        return false;
    }
}
