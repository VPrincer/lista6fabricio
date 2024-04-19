import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] vetorIntercalado = new int[20];

        System.out.println("Digite os 10 elementos do primeiro vetor:");
        for (int i = 0; i < vetor1.length; i++) {
            vetor1[i] = scanner.nextInt();
        }

        System.out.println("Digite os 10 elementos do segundo vetor:");
        for (int i = 0; i < vetor2.length; i++) {
            vetor2[i] = scanner.nextInt();
        }
        int indiceVetor1 = 0;
        int indiceVetor2 = 0;
        for (int i = 0; i < vetorIntercalado.length; i++) {
            if (i % 2 == 0) {
                vetorIntercalado[i] = vetor1[indiceVetor1];
                indiceVetor1++;
            } else {
                vetorIntercalado[i] = vetor2[indiceVetor2];
                indiceVetor2++;
            }
        }

        System.out.println("Vetor resultante da intercalação:");
        for (int i = 0; i < vetorIntercalado.length; i++) {
            System.out.print(vetorIntercalado[i] + " ");
        }
    }
}