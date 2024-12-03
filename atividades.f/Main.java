import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Funcionario[] funcionarios = new Funcionario[5];

        for (int i = 0; i < funcionarios.length; i++) {
            System.out.println("Digite o tipo de funcionário (1 - Funcionario, 2 - Programador, 3 - Instrutor): ");
            int tipo = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            System.out.println("Digite o nome: ");
            String nome = scanner.nextLine();

            System.out.println("Digite o email: ");
            String email = scanner.nextLine();

            switch (tipo) {
                case 1:
                    System.out.println("Digite a idade: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine(); // Consumir a quebra de linha
                    funcionarios[i] = new Funcionario(nome, email, idade);
                    break;

                case 2:
                    System.out.println("Digite a linguagem de programação: ");
                    String linguagem = scanner.nextLine();
                    Programador programador = new Programador(nome, email, linguagem);

                    System.out.println("Digite o sistema operacional: ");
                    String sistOper = scanner.nextLine();
                    programador.setSO(sistOper);

                    funcionarios[i] = programador;
                    break;

                case 3:
                    System.out.println("Digite a disciplina: ");
                    String disciplina = scanner.nextLine();
                    Instrutor instrutor = new Instrutor(nome, email, disciplina);

                    funcionarios[i] = instrutor;
                    break;

                default:
                    System.out.println("Opção inválida. Criando um funcionário genérico.");
                    funcionarios[i] = new Funcionario(nome, email);
            }
        }

        System.out.println("\n--- Dados dos Funcionários ---");
        for (Funcionario funcionario : funcionarios) {
            funcionario.exibeDados();
            System.out.println();
        }

        scanner.close();
    }
}