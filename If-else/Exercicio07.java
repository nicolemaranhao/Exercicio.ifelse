import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite um número inteiro: ");
        int num2 = scanner.nextInt();

        System.out.println("Digite um número inteiro: ");
        int num3 = scanner.nextInt();

        if (num1 == num2 && num2 == num3) {
            System.out.println("Os números são iguais.");
            
        }else {
            int maior = num1;

            if (num2 > maior) {
                maior = num2;
            }
            if (num3 > maior) {
                maior = num3;
            }
            System.out.println("O maior número é: " + maior);
        }
        scanner.close();
    }
}
