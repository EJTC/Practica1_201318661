import java.util.Scanner;

public class Hora {
	
public static void convertir(){
	
	int hora=0;
	int minutos=0;
	int div=0;
	int cont=0;
	
	String g="AM"; 
	
	Scanner n = new Scanner(System.in);

	do {
		
		do 
		{cont=0;
			System.out.println("Ingrese las horas");
			hora = n.nextInt();
			
			div=hora;
			
			//Conteo de los caracteres
			while (div!=0) {
				div = div/10; 
				cont++;
			} 
			
			//Mensaje de error en caso de no cumplirse las condiciones estipuladas
		if ((hora<0 || hora>23) && (cont>2 || cont==1))
			System.err.println("Hora no valida debe estar entre las 00 y 23 horas.\n"
					+ "Escribir la hora con el siguiente formato: 09:05");
		
		}while ((hora<0 || hora>23) && (cont>2 || cont==1));
		
		cont=0;
		
		do 
		{cont=0;
			System.out.println("Ingrese los minutos");
			minutos = n.nextInt();
			
			div=minutos;
			
			//Conteo de los caracteres
			while (div!=0){
				div = div/10; 
				cont++;
			}
			
			//Mensaje de error en caso de no cumplirse las condiciones estipuladas
			if ((minutos<0 || minutos>59) && (cont>2 || cont==1))
				System.err.println("Minuto no valido debe estar entre las 00 y 59 \n"
						+ "Escribir la hora con el siguiente formato: 09:05");
			
			}while ((minutos<0 || minutos>59) && (cont>2 || cont==1));
		
		cont=0;
		
		System.out.println("Hora: "+hora+":"+minutos);
		
		//Comparacion de las diferentes horas cuando la hora sea mayor o igual a 13
		if(hora>=13){
			g="PM";
			switch(hora){
		
		case 13:
			hora=1;
		 	break;
		
		case 14:
			 hora=2;
			break;
			
		case 15:
			 hora=3;
			break;
			
		case 16:
			 hora=4;
			break;
			
		case 17:
			 hora=5;
			break;
			
		case 18:
			 hora=6;
			break;
			
		case 19:
			 hora=7;
			break;
			
		case 20:
			 hora=8;
			break;
			
		case 21:
			 hora=9;
			break;
			
		case 22:
			 hora=10;
			break;
			
		case 23:
			 hora=11;
			break;
			
		case 00:
			 hora=12;
			break;
			
		default:
			System.err.println("Hora no valida");
			break;}
		}
	} while (hora<00 || hora>23);
	
	//Agregando ceros cuando se ingresa un valor menor a 10, por ejemplo 01
	if ((hora<10 || hora>0)&&(minutos>0||minutos<10)) {
		
		System.out.println("La hora en formato 12 horas es: 0"+hora+":0"+minutos+" "+g+"\n \n");
		
	}else {System.out.println("La hora en formato 12 horas es: "+hora+":"+minutos+" "+g+"\n \n");}
}

}
