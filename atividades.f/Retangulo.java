public class Retangulo
{
      private int base = 2;
      private int altura = 1;
      int area;
      int perimetro;
      boolean quadrado;
      
      public Retangulo(){}
      
      public Retangulo(int altura, int base)
      {
         setBase(base);
         setAltura(altura);
      }
      
      public void setBase(int b) 
      {
         if (b < 0)
            System.out.println("A base não pode ser negativa.");
         else
            base = b;
      }
      public void setAltura(int a) 
      {
         if (a < 0)
            System.out.println("A altura não pode ser negativa.");
         else
            altura = a;
      }   
         
      public int getAltura()
      {
            return altura;
      } 
      
      public int getBase()
      {
            return base;
      }
      
      public int calcularArea()
      {
         return altura * base;
      }
      
      public int calcularPerimetro()
      {
         return 2 * (altura + base);
      }
      
      public boolean isQuadrado()
      {
         if (altura == base)
            return true;
         else
            return false;
      }
      public void exibeDados() 
      {
         int perimetro = calcularPerimetro();
         int area = calcularArea();
         boolean quadrado = isQuadrado();
         
         System.out.println("Altura: " + altura);
         System.out.println("Base: " + base);
         System.out.println("Perímetro: " + perimetro);
         System.out.println("Área: " + area);
         System.out.println("É quadrado: " + quadrado);
      }
   
}


