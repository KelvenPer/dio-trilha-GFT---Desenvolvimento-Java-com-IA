
public class Vogais {

    public static void main(String[] args) {

        String vogal = "B";

        switch (vogal) {
            case "A", "E", "I", "O", "U" ->
                System.out.println("É uma vogal");
            default ->
                System.out.println("Não é uma vogal");
        }
    }
}
