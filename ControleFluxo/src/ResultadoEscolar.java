
public class ResultadoEscolar {

    public static void main(String[] args) {
        int nota = 9;
        boolean presenca = false;

        if (nota >= 7 && presenca == true) {
            System.out.println("Parabéns! Aprovado");
        } else if (nota >= 5 && nota < 7 && presenca == true) {
            System.out.println("Que pena, Recuperação.");
        } else {
            System.out.println("Reprovado");
        }
    }
}
