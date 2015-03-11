public class Select {

	public static void n1(int n){
		
		//Casos de opciones del nivel 1 con sus respectivas llamadas a cada metodo correspondiente
		
	switch(n){
	case 1:
		System.out.println("Diamante con asteriscos");
		Diamante.print();
		break;
		
	case 2:
		System.out.println("Notas de estudiante de IPC-1");
		NotaEstudiante.promedio();
		break;
		
	case 3:
		System.out.println("Conversion de 24 a 12 horas");
		Hora.convertir();
		break;
		
	case 4:
		System.out.println("Areas, perimetros y alturas");
		Figura.calcular();
		break;
		
	case 5:
		System.out.println("Dias y fechas");
		break;	
	
	case 6:
		
		break;
		
		default:
			System.err.println("Opcion no valida");
			break;
	}
		
	}
	
	//Casos de opciones del nivel 1 con sus respectivas llamadas a cada metodo correspondiente
	
	public static void n2(int n){
		
		switch(n){
		case 6:
			System.out.println("Calculadora simple");
			break;
			
		case 7:
			System.out.println("[7] Tablas de multiplicar");
			break;
			
		case 8:
			System.out.println("[8] Numero aleatorio");
			break;
			
		case 9:
			System.out.println("[9] De arabigo a romano");
			break;
			
		case 10:
			System.out.println("[10] Piramide de numeros invertida");
			break;
			
		case 11:
			System.out.println("[11] Numeros romanos");
			break;
			
		case 12:
			System.out.println("[12] Contraseña");
			break;
			
		case 13:
			System.out.println("[13] Adivina la letra");
			break;
			
		case 14:
			System.out.println("[14] Cuadrado de asteriscos");
			break;
			
		case 15:
			System.out.println("[15] Numero primos");
			break;
		
		case 16:
			
			break;
			
		default:
			System.err.println("Opcion no valida");
			break;
		}
		
	}
}