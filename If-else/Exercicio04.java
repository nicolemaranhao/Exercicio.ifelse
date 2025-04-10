import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do seu salário: ");
        double salário = scanner.nextDouble();

        System.out.println("Digite o seu tempo de empresa em anos: ");
        int tempoDeEmpresa = scanner.nextInt();

        double bonus;

        if (tempoDeEmpresa >= 5) {
            bonus = salário * 0.20;
            
        }else {
            bonus = salário * 0.10;
        }

        System.out.println("Seu bonus é de: " + bonus + " reais.");

        scanner.close();
    }
}
