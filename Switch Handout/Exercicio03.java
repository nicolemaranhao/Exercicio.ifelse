import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o período que estuda, sendo M para Matutino, V para Vespertino e N para Noturno: ");
        char periodo = scanner.next().toUpperCase().charAt(0);

        switch (periodo) {
            case 'M':
                System.out.println("Bom dia!");
                break;
            case 'V':
                System.out.println("Boa tarde!");
                break;
                case 'N':
                System.out.println("Boa noite!");
            default:
                System.out.println("Período inválido. Por favor, digite M, V ou N.");
                break;
        }
        scanner.close();
    }
}
