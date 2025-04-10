import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite se seu plano de trabalho é A, B ou C: ");
        char plano = scanner.next().toUpperCase().charAt(0);

        System.out.println("Digite o valor do seu salário: ");
        double salário = scanner.nextDouble();

        double novoSalario;

        switch (plano) {
            case 'A':
                novoSalario = salário + (salário * 1.10);
                break;
                case 'B':
                novoSalario = salário + (salário * 1.15);
                break;
                case 'C':
                novoSalario = salário + (salário * 1.20);
                break;
                default:
                System.out.println("Plano inválido. Por favor, digite A, B ou C.");

                scanner.close();
                return;
        }
        System.out.println("Seu novo salário é: "+ novoSalario);

        scanner.close();
    }
}
