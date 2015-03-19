
public class Diamante {
	public static void print(){
		
	//Torre ascendente
	for(int n=0;n<=4;n++){
		System.out.println("");
		for(int k=4;k>=n;k--) //Espacios horizontales
		System.out.print(" ");
		
		for(int m=1;m<=2*n+1;m++){
			System.out.print("*"); //Impresion impar de asteriscos
		}
	}
	
	//Torre descendente
	for(int n=4;n>=0;n--){
		System.out.println("");
		for(int k=5;k>=n;k--)
		System.out.print(" ");//Espacion horizontales
		
		for(int m=2*n-1;m>=1;m--){
			System.out.print("*");//Impresion impar de asteriscos
		}
	}
}
}