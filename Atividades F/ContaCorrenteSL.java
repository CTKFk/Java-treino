import java.util.Scanner;



public class ContaCorrenteSL {
    private final double numeroConta;
    private final String titular;
    private double saldo;
    private double limite;  // Novo atributo para limite

    // Construtor atualizado para incluir limite
    public ContaCorrenteSL(double numeroConta, String titular, double saldo, double limite)
    {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
        this.limite = limite;  // Definir limite
    }

    public void deposito(double valor)
    {
        if (valor > 0)
        {
            saldo += valor;
        } else {
            System.out.println("Deposito invalido");
        }
    }

    public void saque(double valor)  {
        double totalDisponivel = saldo + limite;
        
        if (valor <= totalDisponivel)
        {
          
            if (valor <= saldo)
            {
                saldo -= valor;
            }
    
            else
            {
                limite -= (valor - saldo);
                saldo = 0;
            }
        } else {
            System.out.println("Saldo insuficiente. O saque excede o saldo e o limite disponível.");
        }
    }

    public void verDados()
    {
        System.out.println("Número da conta: " + numeroConta);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
        System.out.println("Limite: " + limite);  // Exibe o limite
    }

    public static void main(String[] args)
    {
        ContaCorrenteSL cc1 = new ContaCorrenteSL(12345, "João da Silva", 3500, 4000.0);  // Adicionado limite
        cc1.verDados();

        Scanner entrada = new Scanner(System.in);

        System.out.printf("\n Valor para deposito em c1: ");
        double vlr = entrada.nextDouble();
        cc1.deposito(vlr);
        cc1.verDados();

        System.out.printf("\n Valor para saque em c2: ");
        cc1.saque(entrada.nextDouble());
        cc1.verDados();
    }
}