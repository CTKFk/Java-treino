import java.util.Scanner;

public class Caixa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double total = 0.0;
        double desconto = 0.0;

 
        while (true) {
            System.out.print("Digite o preco da mercadoria (ou 0 para finalizar): R$ ");
            double preco = scan.nextDouble();
            
            if (preco == 0) {
                break;
            }

            total += preco;

        if (total > 0 && total < 50) {
            desconto = 0.05 * total; 
        } else if (total >= 50 && total <= 100) {
            desconto = total * 0.10;
        } else if (total > 100 && total <= 200) {
            desconto = total * 0.15; 
        } else if (total > 200) {
            desconto = total * 0.20;
        }


        double valorAPagar = total - desconto;


        System.out.printf("Total das compras: R$ %.2f%n", total);
        System.out.printf("Desconto aplicado: R$ %.2f%n", desconto);
        System.out.printf("Valor a ser pago: R$ %.2f%n", valorAPagar);
     }
    }
}
