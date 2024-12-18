public class Triangleabst extends FormaGeometrica
{
   private double base, altura;
   public Triangleabst(double base, double altura)
   {
      super.setLados(3);
      setBase(base);
      setAltura(altura);
   }
   
   public void setBase(double base)
   {
      if (base<0) this.base = 0;
      else this.base = base;
   }
   
   public void setAltura(double altura)
   {
      if (altura<0) this.altura = 0;
      else this.altura = altura;
   }
   
   @Override
   public double area()
   {
      return (base * altura)/2;
   }
   
   @Override
   public void imprime()
   {
      System.out.println("Dados do Triangulo");
      super.imprime();
      System.out.println("Base: "+ base);
      System.out.println("Altura: "+ altura);
   }
}
