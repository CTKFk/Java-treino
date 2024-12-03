public class Instrutor extends Funcionario {
    private String disciplina;

    // Construtor
    public Instrutor(String nome, String email, String disciplina) {
        super(nome, email);
        this.disciplina = disciplina;
    }

    // Métodos
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public void exibeDados() {
        super.exibeDados();
        System.out.println("Disciplina: " + disciplina);
    }
}