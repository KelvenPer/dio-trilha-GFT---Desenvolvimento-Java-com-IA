
public class Fatorial {

    public static void main(String[] args) {
        int numero = 5;
        int fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial = fatorial * i;
            // fatorial *= i;
        }

        System.out.println("o fatorial de " + numero + " é " + fatorial);
    }
}
