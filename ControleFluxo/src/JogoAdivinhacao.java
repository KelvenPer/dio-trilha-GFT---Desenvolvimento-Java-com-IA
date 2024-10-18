
import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {

    public static void main(String[] args) {
        // devemos instanciar o import
        Random random = new Random();

        try (Scanner scanner = new Scanner(System.in)) {
            // agora geramos o numero aleatorio de 1 a 10
            int numeroAleatorio = random.nextInt(10) + 1;
            int tentativas = 0;
            int palpites = 0; // criamos palpites para contar o numero de tentarivas

            // agora vamos iniciar o loop para adivinhar o numero
            System.out.println("Tente adivinhar o numero que estou pensando (entre 1 e 10)");
            while (tentativas != numeroAleatorio) {
                System.out.print("Digite seu palpite: ");
                tentativas = scanner.nextInt();
                palpites++;

                // agora vamos usar if/else para comparar o palpite
                if (tentativas < numeroAleatorio) {
                    System.out.println("o numero é maior que " + tentativas);
                } else if (tentativas > numeroAleatorio) {
                    System.out.println("o numero é menor que " + tentativas);
                } else {
                    System.out.println("Parabéns! Voce acertou o numero " + numeroAleatorio + " em " + palpites + " tentativas.");
                }
            }
        }
    }
}
