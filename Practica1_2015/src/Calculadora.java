import java.util.Scanner;

public class Calculadora {

	public static void operacion(){
		
		Scanner n=new Scanner(System.in);
		
		String z="";
		
		//Ingreso de valores
		System.out.println("Ingrese el primer numero");
		int x=n.nextInt();
		
		System.out.println("Ingrese el segundo numero");
		int y=n.nextInt();
	
		System.out.println("�Que operacion desea realizar?"
				+ "\n[s] Suma"
				+ "\n[r] Resta"
				+ "\n[m] Multiplicacion"
				+ "\n[d] Division");
		z=n.next();
		//Opciones
		switch (z) {
		case "s"://Suma
			System.out.println("La suma es: "+(x+y)+"\n \n");
			break;
			
		case "r"://Resta
			System.out.println("La resta es: "+(x-y)+"\n \n");
			break;
			
		case "m"://Multiplicaci�n
			System.out.println("La multiplicacion es: "+(x*y)+"\n \n");
			break;
			
		case "d"://Divisi�n
			System.out.println("La division es: "+(x/y)+"\n \n");
			break;

		default:
			System.err.println("Opcion invalida");//Mensaje de error
			break;
		}
	}
}
