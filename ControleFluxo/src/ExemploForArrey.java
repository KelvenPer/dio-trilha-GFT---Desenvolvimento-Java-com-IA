
public class ExemploForArrey {

    public static void main(String[] args) {

        String alunos[] = {"KELVEN", "KASSYA", "BENJAMIM"};

        for (int x = 0; x < alunos.length; x++) {
            System.out.println("O aluno no indice x = " + x + " é " + alunos[x]);
        }

        System.out.println("ou ate mesmo.");

        for (String aluno : alunos) {
            System.out.println("O nome do aluno é: " + aluno);
        }
    }
}
