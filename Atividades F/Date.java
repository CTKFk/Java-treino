public class Date {
    private int mes;
    private int dia;
    private int ano;

    public Date (int d, int m, int a) {
        mes = m;
        ano = a;
        dia = checkDia(d);
    }
 public  void setData(int d, int m, int a) {
    if (m > 0 && m <= 12) {
        mes = m;
    }
  else{
    mes = 1;
    System.err.println("mes" + mes + " invalido, setado para 1");
  }
  ano = a;
    dia = checkDia(d);
}
    private int bissexto() {
        if (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)) {
            return 1;
        }
       else {
            return 0;
        } 
    }
     private int checkDia(int diaTeste) {
        int diasMes[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (mes == 2 && bissexto() == 1) {
            diasMes[2] = 29; // Ajusta fevereiro para 29 dias
        }

        // Verifica se o dia está dentro do intervalo válido para o mês
        if (diaTeste > 0 && diaTeste <= diasMes[mes]) {
            return diaTeste;
        }

        // Caso o dia seja inválido
        System.err.println("Dia inválido, setado para 1");
        return 1;
    }

    @Override
    public String toString() {
    return dia + "/" + mes + "/" + ano;
}
public static void main (String args[])
	{
		Date data = new Date(06, 04, 2024);
		System.out.println("Meu aniversário:"  + data.toString());

        data.setData(29, 02, 2023);
		System.out.println("Que data é essa?" + data.toString());


	}	
}



