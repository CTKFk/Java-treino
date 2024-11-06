public class Circuloabst extends FormaGeometrica
{
   private double raio;
   public void setRaio(double raio)
   {
      if (raio<0) this.raio = 0;
      else this.raio = raio;
   }
   
   public Circuloabst (double raio)
   {
      setRaio(raio);
   }
   
   @Override
   public double area()
   {
      return (Math.PI * Math.pow(raio, 2));
   }
   @Override
   public void imprime()
   {
      System.out.println("Dados do Circulo");
      super.imprime();
      System.out.println("Raio: "+ raio);
   }
}
