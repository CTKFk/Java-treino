
import java.util.Scanner;


public class triangle {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o valor do primeiro lado: ");
            double lado1 = scanner.nextDouble();
            
            System.out.print("Digite o valor do segundo lado: ");
            double lado2 = scanner.nextDouble();
            
            System.out.print("Digite o valor do terceiro lado: ");
            double lado3 = scanner.nextDouble();
            
            
            if ((lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1)) {
                System.out.println("Os valores formam um triângulo.");
                if (lado1 == lado2 && lado2 == lado3) {
                    System.out.println("O triângulo é equilátero.");
                } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                    System.out.println("O triângulo é isósceles.");
                } else {
                    System.out.println("O triângulo é escaleno.");
                }
            } else {
                System.out.println("Os valores não formam um triângulo.");
            }
        }
    }
}
