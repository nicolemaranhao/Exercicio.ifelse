import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        if (idade >= 5 && idade <= 7) {
            System.out.println("Você está na categoria Infantil A.");
            
        }else if (idade >= 8 && idade <= 10) {
            System.out.println("Você está na categoria Infantil B.");
        }else if (idade >= 11 && idade <= 13) {
            System.out.println("Você está na categoria Juvenil A.");
        }else if (idade >= 14 && idade <= 17) {
            System.out.println("Você está na categoria Juvenil B.");
        }else if (idade >= 18) {
            System.out.println("Você está na categoria Sênior.");
        }else {
            System.out.println("Você não se enquadra em nossas categorias.");
        }
        scanner.close();
    }
}
