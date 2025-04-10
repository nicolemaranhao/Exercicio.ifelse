import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Digite seu sexo (M/F): ");
        char sexo = scanner.next().charAt(0);

        double pesoIdeal;
        
        if (sexo == 'M' || sexo == 'm') {
            pesoIdeal = (72.7 * altura) - 58;
            System.out.println("O peso ideal é: " + pesoIdeal + " kg");
        }else if (sexo == 'F' || sexo == 'f') {
            pesoIdeal = (62.1 * altura) - 44.7;
            System.out.println("O peso ideal é : " + pesoIdeal + " kg");
            
        }else{
            System.out.println("Sexo inválido. Por favor, use M ou F.");
            
        }
        scanner.close();
    }
}
