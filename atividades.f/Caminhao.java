public class Caminhao extends Veiculo
{
   private int numEixos;
   private int capacidade;
   
   public Caminhao(String modelo, String placa, int anoFabr, int numEixos, int capacidade, double valor){
      super(modelo, placa, anoFabr, valor);
      setEixos(numEixos);
      setCapacidade(capacidade);
   }
   
   public void setEixos(int numEixos){
      this.numEixos = 2;
      if (numEixos > 2) this.numEixos = numEixos;
   }
   public int getEixos(){
      return numEixos;
   }
   public void setCapacidade(int capacidade){
      this.capacidade = capacidade;
   }
   public int getCapacidade(){
      return capacidade;
   }
   public void imprime()
   {
      System.out.printf("\nVeiculo: %s\nPlaca: %7s", modelo, placa);
      System.out.printf("\nFabr: %4d\nCapacidade: %d", anoFabr, capacidade);
      System.out.printf("\n%02d Eixos\nR$ %.2f\n", numEixos, valor);
   }
}
