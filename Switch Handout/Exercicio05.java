import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número: ");
        double primeiroNumero = scanner.nextDouble();

        System.out.println("Digite o segundo número: ");
        double segundoNumero = scanner.nextDouble();

        System.out.println("Escolha uma das opções, sendo M - média, S - diferença, P - produto, D - divisão: ");
        char opções = scanner.next().toUpperCase().charAt(0);

        double resultado;

        switch (opções) {
            case 'M':
                resultado = (primeiroNumero + segundoNumero) / 2;
                System.out.println("A média é: " + resultado);
                break;
        
                case 'S':
                resultado = Math.abs(primeiroNumero - segundoNumero);
                System.out.println("A diferença é: " + resultado);
                break;

                case 'P':
                resultado = primeiroNumero * segundoNumero;
                System.out.println("O produto é: " + resultado);
                break;

                case 'D':
                resultado = primeiroNumero / segundoNumero;
                System.out.println("A divisão é: " + resultado);
                break;

            default:
            System.out.println("Opção inválida.");
                break;
        }
        scanner.close();
    }
}
