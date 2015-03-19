import java.util.Scanner;

public class Cuadrado {
	
	public static void imprimir(){
		int n=0;
		
		Scanner s = new Scanner(System.in);
	
		do {
			System.out.println("Ingrese el numero de lados del cuadrado"
					+ "(mayor a 2)");
			n=s.nextInt();
			
			if (n<3) 
			System.err.println("Numero no valido"
					+ "\nDebe ser mayor a 2");	
			
		} while (n<3);
		
		for (int j=0;j<n;j++) //Primera linea
			System.out.print("* ");
		
		System.out.println("");
		//Lineas medias
			for (int k=0;k<(n-2);k++)
			{	System.out.print("* ");
				
				for (int l=0;l<(2*n-4);l++) 
				System.out.print(" ");
				 
				System.out.print("* ");
				System.out.println("");}
		
		for (int j=0;j<n;j++) //Ultima linea
			System.out.print("* ");
		
		System.out.println("");
	}
}
