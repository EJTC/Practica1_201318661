import java.util.Scanner;

public class Arabigo {
	public static void romano(){
		Scanner n=new Scanner(System.in);
		int num=0;
		//Vectores de caracteres de unidades, decenas, centenas y millares
		String unidades[]={"","I","II","III","IV","V","VI","VII","VIII","IX"};
		String decenas[]={"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
		String centenas[]={"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
		String millares[]={"","M","MM","MMM"};
		
		do {//Repite hasta que se ingrese un numero valido
			System.out.println("Ingrese en numero arabigo a convertir (1-3999)");
			num=n.nextInt();
			
			if(num==0)//Mensaje en caso de colocar 0
				System.out.println("No existe un caracter para representar el numero 0");
			
			if(num>3999 || num<1)//Restriccion de numeros entre 1 y 3999
				System.err.println("Solo se puede ingresar numeros entre 1 y 3999");
		} while (num>3999 || num==0);
		//Impresion de cada uno de los digitos del numero usando los vectores
			System.out.print(millares[(num/1000)]);
			System.out.print(centenas[(num/100)%10]);
			System.out.print(decenas[(num/10)%10]);
			System.out.print(unidades[num%10]+"\n");
		}
	}