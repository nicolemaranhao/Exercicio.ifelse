import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero >= 50 && numero <= 100) {
            System.out.println("Pertence ao intervalo.");
            }else {
                System.out.println("Não pertence ao intervalo.");
            }
            scanner.close();
    }
}
