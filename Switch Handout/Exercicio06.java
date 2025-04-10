import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o código do produto: ");
        int código = scanner.nextInt();

        System.out.println("Digite a quantidade: ");
        int quantidade = scanner.nextInt();

        double preco = 0.0;
        boolean produtoValido = true;

        switch (código) {
            case 100:
            preco = 1.20;
            break;
            case 101:
            preco = 1.30;
            break;
            case 102:
            preco = 1.50;
            break;
            case 103:
            preco = 1.20;
            break;
            case 104:
            preco = 1.30;
            break;
            case 105:
            preco = 1.00;
            break;
            default:
            System.out.println("Código inválido.");
            produtoValido = false;
        }
        if (produtoValido) {
            double total = preco * quantidade;
            System.out.println("Total a pagar: R$ " + total);
        }
        scanner.close();
    }
}
