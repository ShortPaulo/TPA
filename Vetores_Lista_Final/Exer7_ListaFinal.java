import java.util.Scanner;
public class Exer7_ListaFinal {
	public static void main(String[] args) {
			Scanner in = new Scanner (System.in);
			
			int a[], b[], c[], i, j, k = 0, n = 10;
			a = new int[n];
			b = new int[n];
			c = new int[n];
			
			for(i=0; i<n; i++) {
				System.out.println("Digite o "+(i+1)+"º valor do vetor A");
				a[i] = in.nextInt();
			}
			
			for(i=0; i<n; i++) {
				System.out.println("Digite o "+(i+1)+"º valor do vetor B");
				b[i] = in.nextInt();
				}
			
			boolean encontrado;
			for (i=0; i<n; i++) {
				encontrado = false;
			
				for(j=0;j<n;j++) {
					if (a[i] == b[j]) {
						encontrado = true;
					}
				}
				
				if(encontrado == false) {
					c[k] = a[i];
					k++;
				}
			}	
			
			System.out.print("\nA = ");
			for(k=0; k<n; k++) {
				System.out.print(a[k]+" ");
			}
			
			System.out.println();
			System.out.print("\nB = ");
			for(k=0; k<n; k++) {
				System.out.print(b[k]+" ");
			}
				
			System.out.print("\n\n(A diferença entre A e B é: )");
			System.out.print("\nC = ");
			for(k=0; k<n; k++) {
				System.out.print(c[k]+"| ");
			}	
			in.close();		
	}
}