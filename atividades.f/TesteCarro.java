public class TesteCarro
{
   public static void main(String args[])
   {
      Carro c;
      c = new Carro("Fiesta", "ABC1678", 2006, 2007, 3, 31000);
      c.imprime();
      c.deprecia(10);
      
      System.out.println("Carro depreciado");
      c.imprime();
   }
}
