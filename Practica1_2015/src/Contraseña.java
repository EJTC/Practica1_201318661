import java.util.Scanner;
public class Contraseņa {
	
	public static void ocultar(){
		
		String contraseņa="";
		
		Scanner cadena=new Scanner(System.in);
		
		System.out.println("Ingrese su contraseņa (sin espacios):");
		contraseņa=cadena.next();
		
		for (int i = 0; i < contraseņa.length(); i++)
			System.out.print("*");
		
		System.out.println("\n");
	}

}
