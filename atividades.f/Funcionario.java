public class Funcionario {
    private String nome;
    private String email;
    private int idade;

    // Construtores
    public Funcionario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public Funcionario(String nome, String email, int idade) {
        this(nome, email);
        this.idade = idade;
    }

    // Métodos
    public void setEmail(String email) {
        this.email = email;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void exibeDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Idade: " + idade);
    }
}

