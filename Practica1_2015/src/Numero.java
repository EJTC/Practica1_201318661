import java.util.Scanner;

public class Numero {
public static void aleatorio() {
	
	Scanner x=new Scanner(System.in);
	int num1=0;
	int num2=0;
	int random=0;
	int div1=0;
	int div2=0;
	int div3=0;
	
	String unidades[]={"","uno ","dos ","tres ","cuatro ","cinco ","seis ","siete ",
			"ocho","nueve"};
	String decenas[]={"","diez ","veinte ","treinta ","cuarenta ","cincuenta ","sesenta ","setenta ",
			"ochenta ","noventa "};
	String centenas[]={"","cien "};
	
	do {
		System.out.println("Ingrese el limite inferior");
		num1=x.nextInt();
		
		System.out.println("Ingrese el limite superior");
		num2=x.nextInt();
		
		if (num1<1 || num1>100 || num2<1 || num2>100 || num2<num1) {
			System.err.println("Numero invalidos");
		}
	} while (num1<1 || num1>100 || num2<1 || num2>100 || num2<num1);
	
	do {
		random=(int) (num2*Math.random());
	} while (random<num1);
	
	System.out.println("Numero aleatorio: "+random);
	
	div1=random;
	
	div1/=100;
	System.out.print(centenas[div1]);
	
	div2 = random-div1;
	
	div2/=10;
	System.out.print(decenas[div2]);
	
	div3=random-10*div2;
	System.out.print(unidades[div3]+"\n \n");
}
}
