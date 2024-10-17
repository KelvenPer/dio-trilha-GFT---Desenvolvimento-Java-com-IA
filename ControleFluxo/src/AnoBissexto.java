
public class AnoBissexto {

    public static void main(String[] args) {
        float ano = 2024;

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println("ano bissexto");
        } else {
            System.out.println("ano não é bissexto");
        }
    }
}
