import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numerosVoos = new int[12];
        String[] origens = new String[12];
        String[] destinos = new String[12];
        int[] lugaresDisponiveis = new int[12];

        int opcao;
        do {
            System.out.println("\nMENU PRINCIPAL");
            System.out.println("1. Consultar");
            System.out.println("2. Efetuar reserva");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    consultarMenu(scanner, numerosVoos, origens, destinos, lugaresDisponiveis);
                    break;
                case 2:
                    efetuarReserva(scanner, numerosVoos, lugaresDisponiveis);
                    break;
                case 3:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 3);
    }

    public static void consultarMenu(Scanner scanner, int[] numerosVoos, String[] origens,
                                      String[] destinos, int[] lugaresDisponiveis) {
        int opcao;
        do {
            System.out.println("\nMENU CONSULTA");
            System.out.println("1. Por número do voo");
            System.out.println("2. Por origem");
            System.out.println("3. Por destino");
            System.out.println("4. Voltar ao menu principal");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    consultarPorNumero(scanner, numerosVoos, origens, destinos, lugaresDisponiveis);
                    break;
                case 2:
                    consultarPorOrigem(scanner, origens, destinos, lugaresDisponiveis);
                    break;
                case 3:
                    consultarPorDestino(scanner, origens, destinos, lugaresDisponiveis);
                    break;
                case 4:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);
    }

    public static void consultarPorNumero(Scanner scanner, int[] numerosVoos, String[] origens,
                                          String[] destinos, int[] lugaresDisponiveis) {
        System.out.print("Digite o número do voo: ");
        int numeroVoo = scanner.nextInt();
        boolean encontrado = false;
        for (int i = 0; i < numerosVoos.length; i++) {
            if (numerosVoos[i] == numeroVoo) {
                System.out.println("Número do voo: " + numerosVoos[i]);
                System.out.println("Origem: " + origens[i]);
                System.out.println("Destino: " + destinos[i]);
                System.out.println("Lugares disponíveis: " + lugaresDisponiveis[i]);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Voo inexistente.");
        }
    }

    public static void consultarPorOrigem(Scanner scanner, String[] origens, String[] destinos,
                                           int[] lugaresDisponiveis) {
        System.out.print("Digite a origem: ");
        String origem = scanner.next();
        boolean encontrado = false;
        System.out.println("Voos com origem em " + origem + ":");
        for (int i = 0; i < origens.length; i++) {
            if (origens[i].equalsIgnoreCase(origem)) {
                System.out.println("Número do voo: " + (i + 1));
                System.out.println("Destino: " + destinos[i]);
                System.out.println("Lugares disponíveis: " + lugaresDisponiveis[i]);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Nenhum voo encontrado com origem em " + origem);
        }
    }

    public static void consultarPorDestino(Scanner scanner, String[] origens, String[] destinos,
                                            int[] lugaresDisponiveis) {
        System.out.print("Digite o destino: ");
        String destino = scanner.next();
        boolean encontrado = false;
        System.out.println("Voos com destino " + destino + ":");
        for (int i = 0; i < destinos.length; i++) {
            if (destinos[i].equalsIgnoreCase(destino)) {
                System.out.println("Número do voo: " + (i + 1));
                System.out.println("Origem: " + origens[i]);
                System.out.println("Lugares disponíveis: " + lugaresDisponiveis[i]);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Nenhum voo encontrado com destino " + destino);
        }
    }

    public static void efetuarReserva(Scanner scanner, int[] numerosVoos, int[] lugaresDisponiveis) {
        System.out.print("Digite o número do voo: ");
        int numeroVoo = scanner.nextInt();
        if (numeroVoo >= 1 && numeroVoo <= 12) {
            int indiceVoo = numeroVoo - 1;
            if (lugaresDisponiveis[indiceVoo] > 0) {
                lugaresDisponiveis[indiceVoo]--;
                System.out.println("Reserva confirmada. Lugares disponíveis restantes: " + lugaresDisponiveis[indiceVoo]);
            } else {
                System.out.println("Voo lotado.");
            }
        } else {
            System.out.println("Voo inexistente.");
        }
      //Faça um programa que efetue reserva de passagens aéreas de uma companhia. O programa deverá ler informações sobre os voos (número, origem e destino) e o número de lugares disponíveis para doze aviões (um vetor para cada um desses dados). Depois da leitura, o programa deverá apresentar um menu com as seguintes opções:
    }
}