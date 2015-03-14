import java.util.Scanner;

public class Adivina {
	public static void letra(){
		
		Scanner x=new Scanner(System.in);
		
	int n=0;
	int sel=0;
	int cont =0;
	String letraAdivinar="";
	String letraUsuario="";
	
	String abc[]={"a","b","c","d","e","f","g","h","i","j","l","m","n","ñ","o","p","q","r","s","t","u","v","w","x","y","z"};
	
	do {
		System.out.println("¿Como desea jugar?"
				+ "\n[1] Dejar que la computadora elija una letra"
				+ "\n[2] Dejar que el auxliar escoja");
		sel=x.nextInt();
		
		switch (sel) {
		case 1:
			n=(int) (27*Math.random());
			letraAdivinar=abc[n];
			System.out.println(letraAdivinar);//Debug
			break;
			
		case 2:
			System.out.println("Ingrese la letra a adivinar:");
			letraAdivinar=x.next();
			System.out.println(letraAdivinar);//Debug
			break;

		default:
			System.err.println("Opcion invalida");
			break;
		}
	} while (sel>2 || sel<0);
	
	System.out.println("\n¡Comencemos!");
	
	do {
		System.out.println("Letra:");
		letraUsuario=x.next();
			
		cont=(int) (20*Math.random());
		
		switch (cont) {
		case 2:
			System.err.println("Mmm... cerca pero no tanto XD''");
			break;
			
		case 4:
			System.err.println("Vamos!!! Casi adivinas ¬¬''");
			break;
			
		case 6:
			System.err.println("¿Que paso?!!! ya casi adivinas (-_-)");
			break;
			
		case 8:
			System.err.println("Te doy una pista: es un numero jejejeje");
			break;
		
		case 10:
			System.err.println("Segui intentando, tengo tiempo...");
			break;
		
		case 15:
			System.err.println("Apurate que la laptop se queda sin cargar!!!");
			break;
			
		case 20:
			System.err.println("Yo digo que de aqui a mañana adivinas la letra...");
			break;
			
		default:
			break;
		}
		
		if (letraUsuario.compareTo(letraAdivinar)>0){System.out.println("<--Antes");}
		else{System.out.println("Despues -->");}
		
	} while (letraUsuario.compareTo(letraAdivinar)!=0);
	
	System.out.println("Al fin!!! la letra era |"+letraAdivinar+"|\nintentaste "+cont+" veces hasta adivinar.");
	
	}

}
