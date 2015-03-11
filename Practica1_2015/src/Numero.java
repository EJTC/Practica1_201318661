import java.util.Scanner;

public class Numero {
public static void aleatorio() {
	
	Scanner x=new Scanner(System.in);
	int num1=0;
	int num2=0;
	int random=0;
	
	do {
		System.out.println("Ingrese el limite inferior");
		num1=x.nextInt();
		
		System.out.println("Ingrese el limite superior");
		num2=x.nextInt();
		
		if (num1<1 || num1>100 || num2<1 || num2>100) {
			System.err.println("Numero invalidos");
		}
	} while (num1<1 || num1>100 || num2<1 || num2>100);
	
	do {
		random=(int) (num2*Math.random());
	} while (random<num1);
	
	System.out.println("Numero aleatorio: "+random);
}
}
