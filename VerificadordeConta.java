import java.util.Scanner;

public class VerificadordeConta {

    public static void main(String[] args) {
        try (Scanner nconta = new Scanner(System.in)) {
            System.out.print("Digite o número da conta (até 6 dígitos): ");
            String numeroConta = nconta.nextLine();
            
            int soma = 0;
            for (int i = 0; i < numeroConta.length(); i++) {
                soma += Character.getNumericValue(numeroConta.charAt(i));
            }
            
            int digitoVerificador = soma % 10;
            
            
            System.out.printf("O número da conta completo é: %06d-%d%n", Integer.valueOf(numeroConta), digitoVerificador);
        }
    }
}
