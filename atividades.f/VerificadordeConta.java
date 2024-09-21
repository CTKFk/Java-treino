
import java.util.Scanner;

public class VerificadordeConta {

    public static void main(String[] args) {
        try (Scanner nconta = new Scanner(System.in)) {
            System.out.print("Digite o número da conta (até 6 dígitos): ");
            String numeroConta = nconta.nextLine();
            if (numeroConta.length() > 6 ) {
             System.out.printf("Número de conta invalido");   
          } else {    
            
            int soma = 0;
            for (int i = 0; i < numeroConta.length(); i++) {
                soma += Character.getNumericValue(numeroConta.charAt(i));
            }
            
            int digitoVerificador = soma % 10;
            
            
            System.out.printf("O número da conta completo é: %06d-%d%n", Integer.valueOf(numeroConta), digitoVerificador);
            }
        }
    }   
}
/*
Alternativa com int e restrição de numero
 String numero;
  int s;
  int digito;
  
  System.out.print("Digite o número da conta (até 6 dígitos): ");
  numero = input.nextLine();     
  if (numero.length() > 6 ) {
     System.out.printf("Número de conta invalido");   
  } else {    
     s = 0;
     for (int i = 0; i < numero.length(); i++) {
        s += Character.getNumericValue(numero.charAt(i));
     }
     digito = s % 10;
     System.out.printf("O número da conta é: %06d-%d%n", Integer.valueOf(numero), digito);
  }*/
