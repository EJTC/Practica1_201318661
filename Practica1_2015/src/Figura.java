import java.util.Scanner;

public class Figura {
	
public static void calcular() {
	
	String op="";
	float x=0;
	
	Scanner n=new Scanner(System.in);
	
	do {
		//Menu de opciones
		System.out.println("Seleccione la figura:");
		System.out.println("[c] Circulo");
		System.out.println("[u] Cuadrado");
		System.out.println("[t] Triangulo equilatero");
		
		op=n.next();
		
		switch (op) {
		//Calculos del circulo
		case "c":
			System.out.println("¿Cual es el radio del circulo?");
			x=n.nextFloat();
			
			System.out.println("Area: "+((Math.PI)*(Math.pow(x, 2))));
			System.out.println("Perimetro: "+(2*Math.PI*x));
			System.out.println("Radio: "+x+"\n \n");
			break;
		//Calculos del cuadrado	
		case "u":
			System.out.println("¿Cuando mide un lado del cuadrado?");
			x=n.nextFloat();
			
			System.out.println("Area: "+Math.pow(x, 2));
			System.out.println("Perimetro: "+4*x+"\n \n");
			break;
		//Calculos del triangulo	
		case "t":
			System.out.println("¿Cuanto mide un lado del trinagulo equilatero?");
			x=n.nextFloat();
			
			System.out.println("Area: "+((Math.sqrt(0.75))*(Math.pow(x, 2))));
			System.out.println("Perimetro: "+(3*x));
			System.out.println("Altura: "+(x*Math.sqrt(0.75))+"\n \n");
			break;
			
		default:
			System.err.println("Opcion invalida");//Mensaje de error
			break;
		}
	} while (op=="c" || op=="u" || op=="t");

	
}

}
