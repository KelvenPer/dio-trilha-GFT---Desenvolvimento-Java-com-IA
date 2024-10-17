
public class CaixaEletronico {

    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 26.0;

        if (valorSolicitado >= saldo) {
            System.out.println("Valor menor, Saque não pode ser realizado");
        } else {
            System.out.println("Transação completa, saque realizado");
        }
    }
}
