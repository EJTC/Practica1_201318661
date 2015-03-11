import java.util.Scanner;

public class Tabla {
	
	public static void multiplicar(){
		Scanner n=new Scanner(System.in);
		
		int op=0;
		do{ System.out.println("Ingrese el numero de la tabla que desea ver \n");
		op=n.nextInt();
		
		if (op>10 || op<=0) 
			System.err.println("Numero no valido \nDebe estar entre 1 y 10");
		
		 }while (op>10 || op<=0);
		
		for (int i = 10; i >=1; i--) {
			System.out.println(op+" X "+i+" = "+(op*i));	
		}
	}

}
