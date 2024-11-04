public class TesteFormas
{
   public static void main (String args[])
   {
      Circulo2 c = new Circulo2(5);
      c.imprime();
      System.out.println();
      
      Retangulo2 r = new Retangulo2(3, 4);
      r.imprime();
      System.out.println();

      Triangulo2 t = new Triangulo2(4, 5);
      t.imprime();
   }
}
