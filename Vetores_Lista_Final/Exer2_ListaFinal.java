import java.util.Scanner;
public class Exer2_ListaFinal {
	public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int a[], i, j, valor;
			a = new int[5];
			
			for(i=0; i<5; i++) {
				System.out.println("Digite o "+(i+1)+"º número do vetor:");
				a[i] = in.nextInt();
			}
		
			for (i=0; i<5; i++) {
				System.out.println();
				System.out.println("\nTabuada do número "+a[i]+": ");		
				
				for (j=0; j<=10; j++) {
				valor = a[i]*j;
				System.out.print("\n"+a[i]+" x "+j+" = " +valor);
				in.close();
				}
			
			}
	}
}



