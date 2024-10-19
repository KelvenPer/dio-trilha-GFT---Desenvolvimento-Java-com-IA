
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {

    public static void main(String[] args) {
        try {
            try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
                System.out.println("Digite seu nome: ");
                String nome = scanner.next();

                System.out.println("Digite seu sobrenome: ");
                String sobrenome = scanner.next();

                System.out.println("Digite sua idade: ");
                int idade = scanner.nextInt();

                System.out.println("Digite a sua altura: ");
                double altura = scanner.nextDouble();

                System.out.println("Ola me chamo " + nome.toUpperCase() + " " + sobrenome);
                System.out.println("Tenho " + idade + " anos de idade.");
                System.out.println("Tenho " + altura + " de altura.");
            }
        } catch (InputMismatchException e) {
            System.out.println("os campos idade e altura precisam ser numericos");
        }

    }
}
