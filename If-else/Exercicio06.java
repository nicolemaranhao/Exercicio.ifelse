import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do seu salário bruto: ");
        double salárioBruto = scanner.nextDouble();

        System.out.println("Digite o valor da prestação: ");
        double prestação = scanner.nextDouble();

        double limitePrestação = salárioBruto * 0.30;

        if (prestação <= limitePrestação) {
            System.out.println("Empréstimo concedido.");
        }else {
            System.out.println("Empréstimo não concedido.");
        }
        scanner.close();
    }
}
