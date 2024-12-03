public class Programador extends Funcionario {
    private String linguagem;
    private String sistOper;

    // Construtor
    public Programador(String nome, String email, String linguagem) {
        super(nome, email);
        this.linguagem = linguagem;
    }

    // Métodos
    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    public void setSO(String sistOper) {
        this.sistOper = sistOper;
    }

    @Override
    public void exibeDados() {
        super.exibeDados();
        System.out.println("Linguagem: " + linguagem);
        System.out.println("Sistema Operacional: " + sistOper);
    }
}