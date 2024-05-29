import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[4];
        double soma = 0;

        // Ler as quatro notas
        for (int i = 0; i < 4; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            soma += notas[i];
        }

        // Calcular a média
        double media = soma / 4;

        // Verificar a situação do aluno
        if (media >= 7) {
            System.out.println("Aluno aprovado com média: " + media);
        } else if (media >= 5) {
            System.out.println("Aluno em recuperação com média: " + media);
        } else {
            System.out.println("Aluno reprovado com média: " + media);
        }

        scanner.close();
    }
}
