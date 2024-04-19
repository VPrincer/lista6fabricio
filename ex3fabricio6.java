import java.util.Scanner;
//Faça um programa que preencha um vetor com oito números inteiros, calcule e mostre dois vetores resultantes. O primeiro vetor resultante deve conter os números positivos e o segundo, os números negativos. Cada vetor resultante vai ter, no máximo, oito posições, que não poderão ser completamente utilizadas.

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetorOriginal = new int[8];
        int[] vetorPositivos = new int[8]; 
        int[] vetorNegativos = new int[8]; 

        System.out.println("Digite os 8 números inteiros:");
        for (int i = 0; i < vetorOriginal.length; i++) {
            vetorOriginal[i] = scanner.nextInt();
        }

        int indicePositivos = 0;
        int indiceNegativos = 0;

        for (int i = 0; i < vetorOriginal.length; i++) {
            if (vetorOriginal[i] >= 0) {
                vetorPositivos[indicePositivos] = vetorOriginal[i];
                indicePositivos++;
            } else {
                vetorNegativos[indiceNegativos] = vetorOriginal[i];
                indiceNegativos++;
            }
        }

        System.out.println("Vetor de números positivos:");
        for (int i = 0; i < indicePositivos; i++) {
            System.out.print(vetorPositivos[i] + " ");
        }
        System.out.println();

        System.out.println("Vetor de números negativos:");
        for (int i = 0; i < indiceNegativos; i++) {
            System.out.print(vetorNegativos[i] + " ");
        }
        System.out.println();
    }
}