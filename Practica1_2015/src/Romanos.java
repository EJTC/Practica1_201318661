import java.util.Scanner;

public class Romanos {
public static void lista(){

	String cadena, num;
	int n;
	
	
	Scanner letras=new Scanner(System.in);

	System.out.println("Ingrese la cantidad de numeros de la lista:");
	
	n=letras.nextInt();
	
	String numeros[]=new String[n];
	
	for (int i=0;i<n;i++){
		System.out.println("Ingrese el numero "+(i+1)+""
				+ "\n(Escribir los numeros en mayuscula)");
		num=letras.next();
		numeros[i]=num;
	}
	System.out.println("\nLista:");
	
	System.out.println("1-> "+numeros[0]+" ==> "+traducir(numeros[0]));
	
	for (int i=1;i<n-1;i++)
		System.out.println((i+1)+"-> "+numeros[i]);
	
	System.out.println((n+1)+"-> "+numeros[(n-1)]+" ==> "+traducir(numeros[(n-1)]));
	//frac1=cadena.substring(0, 2);
	//frac2=cadena.substring(3, 5);
	//frac3=cadena.substring(6, 10);
}

public static String traducir(String romano){
	String letra="";
	
	switch (romano) {
	case "I": letra="Uno"; break;
	case "II": letra="Dos"; break;
	case "III":	letra="Tres"; break;
	case "IV": letra="Cuatro"; break;
	case "V": letra="Cinco"; break;
	case "VI": letra="Seis"; break;
	case "VII": letra="Siete"; break;
	case "VIII": letra="Ocho"; break;
	case "IX": letra="Nueve"; break;
	case "X": letra="Diez"; break;
	
	default:
		break;
	}

	return letra;
	
}
}
