public class Exer4_ListaFinal {
	public static void main(String[] args) {	
		final int TAM=11;
		int a[], i, POT=1, I=11;
		a = new int[TAM];

		for (i=0; i<I; i++) {
    		a[i] = POT;
	        System.out.println("2 elevado à "+i+" = "+POT);
	        POT = POT * 2;
	    }
	}
}

