import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Possui titulo de eleitor? (sim/não): ");
        boolean possuiTitulo = scanner.nextBoolean();

        System.out.println("Possui documento com foto? (sim/não): ");
        boolean possuiDocumento = scanner.nextBoolean();

        System.out.println("Está regular com a justiça eleitoral? (sim/não): ");
        boolean regularJustica = scanner.nextBoolean();

        if (idade < 16) {
            System.out.println("Você não pode votar.");
        } else if (idade >= 16 && idade < 18) {
            System.out.println("Você pode votar, mas o voto é opcional.");
        } else if (idade >= 18 && idade < 70) {
        if (possuiTitulo && possuiDocumento && regularJustica) {
                System.out.println("Você deve votar.");
        } else {
                System.out.println("Você não pode votar.");
        }
            
        }
    }
}
