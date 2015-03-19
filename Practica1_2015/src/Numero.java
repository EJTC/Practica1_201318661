import java.util.Scanner;

public class Numero {
public static void aleatorio() {
	
	Scanner x=new Scanner(System.in);
	int num1=0;
	int num2=0;
	int random=0;
	
	String unidades[]={"","uno","dos","tres","cuatro","cinco","seis","siete ",
			"ocho","nueve"};
	String decenas[]={"","Diez ","Veinte ","Treinta ","Cuarenta ","Cincuenta ","Sesenta ","Setenta ",
			"Ochenta ","Ooventa "};
	String centenas[]={"","Cien "};
	
	String decimal[]=new String[20];
	decimal[11]="Once";decimal[12]="Doce";decimal[13]="Trece";decimal[14]="Catorce";
	decimal[15]="Quince";decimal[16]="Dieciseis";decimal[17]="Diecisiete";decimal[18]="Dieciocho";
	decimal[19]="Diecinueve";
	

	do {
		System.out.println("Ingrese el limite inferior");
		num1=x.nextInt();
		
		System.out.println("Ingrese el limite superior");
		num2=x.nextInt();
		
		if (num1<1 || num1>100 || num2<1 || num2>100 || num2<num1 || num1==num2) {
			System.err.println("Numero invalidos");
		}
	} while (num1<1 || num1>100 || num2<1 || num2>100 || num2<num1 || num1==num2);
	
	do {
		random=(int) (num2*Math.random());
	} while (random<num1);
	
	System.out.println("Numero aleatorio: "+random);
	
	if(random>10 && random<20)
		System.out.println("|"+decimal[random]+"|");
	else
	{System.out.print("|"+centenas[(random/100)%10]);
	System.out.print(decenas[(random/10)%10]);
	System.out.print(unidades[(random)%10]+"|\n");}
	
	


}
}
