public class ContaCorrente {
    // atributos
    private int numeroConta1;
    private String titular1;
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
        cc.depositar(500.0);
        cc.sacar(600.0);
        cc.exibirDados();
    }
}
/*Alternativa com método para retornar uma conta corrente
        ContaCorrente cc = method();
        
        cc.depositar(500.0);
        cc.sacar(200.0);
        cc.exibirDados();
    }
    //  método para retornar uma conta corrente
    private static ContaCorrente method() {
        ContaCorrente cc = new ContaCorrente(1234, "John Doe", 0.0);
        return cc;
    }
}
*/
