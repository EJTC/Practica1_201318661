import java.util.Scanner;
public class Contraseña {
	
	public static void ocultar(){
		
		String contraseña="";
		
		Scanner cadena=new Scanner(System.in);
		
		System.out.println("Ingrese su contraseï¿½a (sin espacios):");
		contraseña=cadena.next();
		
		for (int i = 0; i < contraseña.length(); i++)
			System.out.print("*");
		
		System.out.println("\n");
	}

}
