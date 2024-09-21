
public class BancoTerminal{
        public static void main(String[] args) {
            double saldo = 25.0;
            double valorSolicitado = 22.0;
             if (saldo >= valorSolicitado){
                saldo = saldo - valorSolicitado;
                System.out.printf("Saque realizado com sucesso. Saldo: R$ %.2f%n", saldo);
             }else {
                System.out.println("Saldo insuficiente.");
             }
    }
}