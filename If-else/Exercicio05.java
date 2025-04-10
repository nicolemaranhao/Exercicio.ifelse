import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String senhaCorreta = "R10p5";

        System.out.println("Digite a senha: ");
        String senhaDigitada = scanner.nextLine();

        if (senhaDigitada.equals(senhaCorreta)) {
            System.out.println("Acesso permitido.");
        }else {
            System.out.println("Acesso negado.");
        }
        scanner.close();
    }
}
