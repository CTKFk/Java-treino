public class TesteFormas
{
   public static void main (String args[])
   {
      Circuloabst c = new Circuloabst(5);
      c.imprime();
      System.out.println();
      
      Retanguloabst r = new Retanguloabst(3, 4);
      r.imprime();
      System.out.println();

      Triangleabst t = new Triangleabst(4, 5);
      t.imprime();
   }
}
