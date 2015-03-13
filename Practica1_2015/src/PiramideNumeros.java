import java.util.Scanner;

public class PiramideNumeros {
	public static  void imprimir() {
		Scanner x=new Scanner(System.in);
		
		int n=0;
		int cont=0;
		
		do {
			System.out.println("Ingrese el numero de pisos de la piramide (0-9)");
			n=x.nextInt();
			
			if (n<0 || n>9)
			System.err.println("El numero de pisos solo puede estar entre 1 y 9");
			
		} while (n<0 || n>9);
		
		for(int h=n;h>=0;h--){ //Ciclo de numero de filas
			System.out.println("");
			for(int k=0;k<=cont;k++)//Ciclo de espacios a la izquierda
			System.out.print(" ");
			
			for(int m=2*h-1;m>=1;m--){//Ciclo de numero de caracteres por fila
				System.out.print(cont+1);//Numero "cont" de la "n" fila
			}
		cont++;//Aumento de "cont"
		
	}
}
}

