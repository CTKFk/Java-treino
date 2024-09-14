import java.util.Scanner;

public class MediaTurma {
    public static void main(String args[]) {
        final int ALUNOS = 5;
        final int PROVAS = 2;

        int lin, col;
        double media;
        double mediaturma = 0;

        double notas[][] = new double[ALUNOS][PROVAS];
        Scanner entrada = new Scanner(System.in);

        for (lin = 0; lin < ALUNOS; lin++) { 
            System.out.printf("\nDigite as notas do %do aluno: ", lin + 1); 
            for (col = 0; col < PROVAS; col++) { 
                double nota;
                do {
                    nota = entrada.nextDouble();
                    if (nota > 10) {
                        System.out.println("Nota inválida. Digite uma nota até 10.");
                    }
                } while (nota > 10);
                notas[lin][col] = nota;
                mediaturma += notas[lin][col];
            }
        }
        mediaturma = mediaturma / (ALUNOS * PROVAS);
        System.out.println();
        System.out.println("Notas e Média");

        for (lin = 0; lin < ALUNOS; lin++) {
            System.out.printf("\nAluno %d: ", lin + 1);
            media = 0;
            for (col = 0; col < PROVAS; col++) {
                System.out.printf("%2.2f ", notas[lin][col]);
                media += notas[lin][col];
            }
            System.out.printf(" - Média %2.2f ", media / PROVAS);
            if (media / PROVAS < mediaturma)
                System.out.print(" - Abaixo da média");
            else if (media / PROVAS > mediaturma)
                System.out.print(" - Acima da média");
            else
                System.out.print(" - Na média");
        }
        System.out.printf("\nMédia da turma %2.2f ", mediaturma);
    }
}