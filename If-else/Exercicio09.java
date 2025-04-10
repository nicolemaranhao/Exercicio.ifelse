import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do seu salário: ");
        double salário = scanner.nextDouble();

        double desconto;

        if (salário <= 600.00) {
            System.out.println("Isento de imposto de renda.");
        } else if (salário > 600.00 && salário <= 1200.00) {
            desconto = salário * 0.20;
            System.out.println("Desconto INSS: " + desconto + " reais.");
            
        }else if (salário > 1200.00 && salário <= 2000.00) {
            desconto = salário * 0.25;
            System.out.println("Desconto INSS: " + desconto + " reais.");
        }else if (salário > 2000.00) {
            desconto = salário * 0.30;
            System.out.println("Desconto INSS: " + desconto + "reais.");
        }
        scanner.close();
    }
}
