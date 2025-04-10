import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.println("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        if (num1 > num2) {
            System.out.println("Ordem crescente: " + num1 + ", " + num2);
        }else{
            System.out.println("Ordem descrecente: " + num2 + ", " + num1);
        }
        scanner.close();
    }
}