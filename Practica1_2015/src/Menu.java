import java.util.Scanner;

public class Menu {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int op=0;
		int op2=0;
	
		Scanner n = new Scanner(System.in);
		
		System.out.println("..::|Bienvenido a la Practica 1 de IPC-1|::..");
		
		do{ System.out.println("\n--> Menu principal <--");
			System.out.println("Seleccione el nivel:");
			System.out.println("[1] Problemas nivel 1");
			System.out.println("[2] Problemas nivel 2");
			System.out.println("[3] Salir");
			op=n.nextInt();
			
			switch(op){
			case 1:
				System.out.println("Seleccione el programa de su agrado:");
				System.out.println("[1] Diamante con asteriscos");
				System.out.println("[2] Notas de estudiante de IPC-1");
				System.out.println("[3] Conversion de 24 a 12 horas");
				System.out.println("[4] Areas, perimetros y alturas");
				System.out.println("[5] Dias y fechas");
				System.out.println("[6] <-- Regresar");
				op2=n.nextInt();
				Select.n1(op2); //Seleccion de opcion nivel 1
				break;
				
			case 2:
				System.out.println("Seleccione el programa de su agrado:");
				System.out.println("[6] Calculadora simple");
				System.out.println("[7] Tablas de multiplicar");
				System.out.println("[8] Numero aleatorio");
				System.out.println("[9] De arabigo a romano");
				System.out.println("[10] Piramide de numeros invertida");
				System.out.println("[11] Numeros romanos");
				System.out.println("[12] Contraseña");
				System.out.println("[13] Adivina la letra");
				System.out.println("[14] Cuadrado de asteriscos");
				System.out.println("[15] Numero primos");
				System.out.println("[16] <-- Regresar");
				op2=n.nextInt();
				Select.n2(op2); //Seleccion de opcion nivel 2
				break;
				
			case 3:
				System.out.println("Copyright - Edgar Terré - 2015");
				System.out.println("Prohibida su reproduccion parcial o total.");
				System.exit(0);
				
			default:System.err.println("Opcion invalida (1-2)"); break;
			}
			
		
		}while(op>0 || op==0);	
	}

}
