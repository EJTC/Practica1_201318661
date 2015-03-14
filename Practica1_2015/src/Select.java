public class Select {

	public static void n1(int n){
		
		//Casos de opciones del nivel 1 con sus respectivas llamadas a cada metodo correspondiente
		
	switch(n){
	case 1:
		System.out.println("..::|Diamante con asteriscos|::..");
		Diamante.print();
		break;
		
	case 2:
		System.out.println("..::|Notas de estudiante de IPC-1|::..");
		NotaEstudiante.promedio();
		break;
		
	case 3:
		System.out.println("..::|Conversion de 24 a 12 horas|::..");
		Hora.convertir();
		break;
		
	case 4:
		System.out.println("..::|Areas, perimetros y alturas|::..");
		Figura.calcular();
		break;
		
	case 5:
		System.out.println("..::|Dias y fechas|::..");
		break;	
	
	case 6:
		
		break;
		
		default:
			System.err.println("¡¡Opcion no valida!!");
			break;
	}
		
	}
	
	//Casos de opciones del nivel 1 con sus respectivas llamadas a cada metodo correspondiente
	
	public static void n2(int n){
		
		switch(n){
		case 6:
			System.out.println("..::|Calculadora simple|::..");
			Calculadora.operacion();
			break;
			
		case 7:
			System.out.println("..::|Tablas de multiplicar|::..");
			Tabla.multiplicar();
			break;
			
		case 8:
			System.out.println("..::|Numero aleatorio|::..");
			Numero.aleatorio();
			break;
			
		case 9:
			System.out.println("..::|De arabigo a romano|::..");
			break;
			
		case 10:
			System.out.println("..::|Piramide de numeros invertida|::..");
			PiramideNumeros.imprimir();
			break;
			
		case 11:
			System.out.println("..::|Numeros romanos|::..");
			break;
			
		case 12:
			System.out.println("..::|Contraseña|::..");
			Contraseña.ocultar();
			break;
			
		case 13:
			System.out.println("..::|Adivina la letra|::..");
			Adivina.letra();
			break;
			
		case 14:
			System.out.println("..::|Cuadrado de asteriscos|::..");
			Cuadrado.imprimir();
			break;
			
		case 15:
			System.out.println("..::|Numero primos|::..");
			Primos.conteo();
			break;
		
		case 16:
		
			break;
			
		default:
			System.err.println("¡¡Opcion no valida!!");
			break;
		}
		
	}
}