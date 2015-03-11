import java.util.Scanner;

public class NotaEstudiante {
	
	public static void promedio(){
		Scanner s = new Scanner(System.in);
		
		int nota=0;
		int n=1;
		int suma=0;
		
		//Ingreso de notas
			do{
				System.out.println("Ingrese la nota "+n);
			nota = s.nextInt();
			
			if(nota<0 || nota>100){
				System.err.println("Ingrese numeros del 1-100"); //Mensaje de error
			}else{suma += nota; n++;}
				
			}while(n>=0 && n<=6);
				
		int promedio=suma/6;
		
		System.out.println("Promedio: "+promedio);
		
		//Comparacion de rangos de calificaciones
		
		if(promedio>=90 && promedio<=100)
			System.out.print("(A)");
		
		if(promedio>=80 && promedio<=89)
			System.out.print("(B)");
		
		if(promedio>=70 && promedio<=79)
			System.out.print("(C)");
		
		if(promedio>=60 && promedio<=69)
			System.out.print("(D)");
		
		if(promedio>=0 && promedio<=59)
			System.out.print("(E)");
		
		}
	}
