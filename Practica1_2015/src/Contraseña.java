import java.util.Scanner;
public class Contrase�a {
	
	public static void ocultar(){
		
		String contrase�a="";
		
		Scanner cadena=new Scanner(System.in);
		
		System.out.println("Ingrese su contrase�a (sin espacios):");
		contrase�a=cadena.next();
		
		for (int i = 0; i < contrase�a.length(); i++)
			System.out.print("*");
		
		System.out.println("\n");
	}

}
