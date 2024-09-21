
public class ContaCorrente {
    // atributos
    private final int numeroConta1;
    private final String titular1;
    private double saldo;
    
    // construtor
    public ContaCorrente(int numeroConta, String titular, double saldo) {
        this.numeroConta1 = numeroConta;
        this.titular1 = titular;
        this.saldo = saldo;
    }
    // métodos
    public void depositar(double valor) {
        saldo += valor;
    }
    //  método para sacar um valor
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
    //  método para exibir os dados da conta
    public void exibirDados() {
        System.out.println("Número da conta: " + numeroConta1);
        System.out.println("Titular: " + titular1);
        System.out.println("Saldo: " + saldo);
    }
    //  método main
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(1234, "John Doe", 0.0);
        cc.exibirDados();
        cc.depositar(500.0);
        System.out.println("Saldo após depósito: " + cc.saldo);
        cc.sacar(200.0);
        System.out.println("Saldo após saque: " + cc.saldo);

    }
}

