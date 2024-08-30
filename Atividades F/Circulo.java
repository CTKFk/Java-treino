
public class Circulo {
    //variavel para armazenar o raio
    private double raio;

    //metodo construtor
    public Circulo(double raio) {
        this.raio = raio;
    }
    //metodo para alterar o raio
    public void setRaio(double raio) {
        this.raio = raio;
    }
//metodo para retornar o raio
    public double getRaio() {
        return raio;
    }
//metodo para calcular o diametro
    public double calcularDiametro() {
        return 2 * raio;
    }
//  metodo para calcular a area
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    public double calcularCircunferencia() {
        return 2 * Math.PI * raio;
    }

    public void exibirDados() {
        double diametro = calcularDiametro();
        double area = calcularArea();
        double circunferencia = calcularCircunferencia();

        System.out.println("Diâmetro: " + diametro);
        System.out.println("Área: " + area);
        System.out.println("Circunferência: " + circunferencia);
    }
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5);
        circulo.exibirDados();
        circulo.setRaio(7.5);
        circulo.exibirDados();
    }
}

