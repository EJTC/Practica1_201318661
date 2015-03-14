import java.util.Scanner;

public class Primos {
	
	public static void conteo(){
		
		Scanner max=new Scanner(System.in);
		
		int res=1;
		int cont=0;
		int n=0;
		
		
		System.out.println("Ingrese el numero maximo para el conteo;");
		n=max.nextInt();
		
		for (int j=n;j>1;j--) {
			boolean decision=true;
			for (int i=j-1;i>1;i--){
				
				res=j%i;
				
				if(res==0){decision=false; break;}
				
				}
			if (decision) {
				cont++;
			}
		}
	System.out.println("Existe "+cont+" numero(s) primo(s) entre 1 y "+n);
	}
}
