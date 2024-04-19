import java.util.Scanner;

public class Main {
    public static boolean ehPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[9];

        System.out.println("Digite os nove números inteiros:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = scanner.nextInt();
        }

        System.out.println("Números primos e suas respectivas posições:");

        for (int i = 0; i < vetor.length; i++) {
            if (ehPrimo(vetor[i])) {
                System.out.println("Número primo: " + vetor[i] + ", posição: " + i);
            }
        }
    }
}
