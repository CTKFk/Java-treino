# Java-treino

# Teste github #
**Conversão temp codigo**

import java.util.Scanner;

public class ConversãodeTemp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite a temperatura em Fahrenheit: ");
        double F = scanner.nextDouble();

    
        double celsius = (F - 32) * 5 / 9;

 
        System.out.println("A temperatura em Celsius: " + celsius);

    }
}

**triangulo codigo**

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

**Verificador de conta codigo**

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

**Caixa**

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
