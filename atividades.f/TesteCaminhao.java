public class TesteCaminhao
{
   public static void main(String args[])
   {
      Caminhao c;
      c = new Caminhao("Mercedes", "XYZ3456", 2000, 10, 3, 50000);
      c.imprime();
      c.deprecia(10);
      
      System.out.println("Caminhao depreciado");
      c.imprime();
   }
}
