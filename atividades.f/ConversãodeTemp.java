

import java.util.Scanner;

public class ConversãodeTemp {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite a temperatura em Fahrenheit: ");
            double F = scanner.nextDouble();

   
            double celsius = (F - 32) * 5 / 9;

 
            System.out.println("A temperatura em Celsius: " + celsius);
        }

    }
}
