import java.util.Scanner;

public class JogoDaVelha {

    static char[][] tabuleiro = {
        {'1', '2', '3'},
        {'4', '5', '6'},
        {'7', '8', '9'}
    };

    static char jogadorAtual = 'X';

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int jogadas = 0;
            boolean jogoAtivo = true;
            
            while (jogoAtivo) {
                imprimirTabuleiro();
                System.out.print("Jogador " + jogadorAtual + ", escolha uma posição (1-9): ");
                int posicao = scanner.nextInt();
                
                if (!fazerJogada(posicao)) {
                    System.out.println("Posição inválida. Tente novamente.");
                    continue;
                }
                
                jogadas++;
                
                if (verificarVitoria()) {
                    imprimirTabuleiro();
                    System.out.println("Jogador " + jogadorAtual + " venceu!");
                    jogoAtivo = false;
                } else if (jogadas == 9) {
                    imprimirTabuleiro();
                    System.out.println("Empate!");
                    jogoAtivo = false;
                } else {
                    jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
                }
            }
        }
    }

    static void imprimirTabuleiro() {
        System.out.println("\n");
        for (int i = 0; i < 3; i++) {
            System.out.println(" " + tabuleiro[i][0] + " | " + tabuleiro[i][1] + " | " + tabuleiro[i][2]);
            if (i < 2) System.out.println("---|---|---");
        }
        System.out.println();
    }

    static boolean fazerJogada(int posicao) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == Character.forDigit(posicao, 10)) {
                    tabuleiro[i][j] = jogadorAtual;
                    return true;
                }
            }
        }
        return false;
    }

    static boolean verificarVitoria() {
        // Linhas e colunas
        for (int i = 0; i < 3; i++) {
            if ((tabuleiro[i][0] == jogadorAtual && tabuleiro[i][1] == jogadorAtual && tabuleiro[i][2] == jogadorAtual) ||
                (tabuleiro[0][i] == jogadorAtual && tabuleiro[1][i] == jogadorAtual && tabuleiro[2][i] == jogadorAtual)) {
                return true;
            }
        }

        // Diagonais
        if ((tabuleiro[0][0] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][2] == jogadorAtual) ||
            (tabuleiro[0][2] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][0] == jogadorAtual)) {
            return true;
        }

        return false;
    }
}
