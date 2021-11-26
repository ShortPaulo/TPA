import java.util.Scanner;
public class Exer8_ListaFinal {
	public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			
			int a[], i, j, b = 0, n = 10;
			a = new int[n];

			for (i = 0; i < n; i++) {
				System.out.println("Entre " + (i + 1) + " valor do vetor A:");
				a[i] = in.nextInt();
			}

			for (j = 0; j < 1; j++) {
				System.out.println("Digite o número que você quer buscar:");
				b = in.nextInt();
			}

			boolean encontrado=false;
			for (i = 0, j = 0; i < n; i++, j++) {
				if (a[i] == b) {
					encontrado = true;
				} 

			}

			if (encontrado == true) {
				System.out.println("\nO número " + (b) + " está armazenado no vetor A!");
			} else if (encontrado == false) {
				System.out.println("\nO número " + (b) + " não está armazenado no vetor A!");
			}
			in.close();
	}
}


