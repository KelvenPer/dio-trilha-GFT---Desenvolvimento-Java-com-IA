
public class SistemaEscolar {

    public static void main(String[] args) {
        int nota = 9;
        boolean presenca = false;

        if (presenca) {
            switch (nota) {
                case 10, 9 ->
                    System.out.println("Aluno Excelente");
                case 8, 7 ->
                    System.out.println("Aluno bom");
                default ->
                    System.out.println("Aluno regular");
            }
        } else {
            System.out.println("Aluno reprovado por falta");
        }
    }
}
