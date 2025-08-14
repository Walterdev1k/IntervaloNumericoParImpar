package main.java;

    import java.util.Scanner;

    public class GeradorIntervalo {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("=== INTERVALO PAR/ÍMPAR ===");

            // Solicita os números
            System.out.print("Digite o primeiro número: ");
            int primeiroNumero = scanner.nextInt();

            System.out.print("Digite o segundo número (maior que o primeiro): ");
            int segundoNumero = scanner.nextInt();

            // Validação do intervalo
            if (segundoNumero <= primeiroNumero) {
                System.out.println("Erro: O segundo número deve ser maior que o primeiro!");
                return;
            }

            // Solicita a escolha par/ímpar
            System.out.print("Escolha (P)ar ou (I)mpar: ");
            String escolha = scanner.next().toUpperCase();

            // Processamento
            System.out.println("\nNúmeros no intervalo [" + primeiroNumero + ", " + segundoNumero + "]:");

            // Percorre do maior para o menor
            for (int i = segundoNumero; i >= primeiroNumero; i--) {
                if (escolha.equals("P") && i % 2 == 0) {
                    System.out.print(i + " ");
                } else if (escolha.equals("I") && i % 2 != 0) {
                    System.out.print(i + " ");
                }
            }

            scanner.close();
        }
    }

