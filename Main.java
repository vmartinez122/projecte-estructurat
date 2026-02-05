/*
 * Main.java		   1.0 15/01/2026
 * 
 * Calcula la suma dels nombres del 1 al 100 que siguin nombres primers.
 * 
 * Copyright 2026 Víctor Martínez González Román
 * 
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */
 public class Main {
	/**
	 * Calcula la suma dels nombres primers des del 1 fins a x. (Exclueix el número 1)
	 * @param x nombre en el que deixa de comptar.
	 * @return suma dels nombres primers.
	 */
	public int primeSum(int x){
		int sum = 0;
		boolean isPrime;
		for (int i = 2; i <= x; i++){
			isPrime = true;
			for(int f = 2; f < i; f++){
				if(i%f == 0){
					isPrime = false;
				}
			}
			if (isPrime){
				//System.out.println(i);
				sum += i;
			}
		}
		return sum;
	}

	/**
	 * 
	 * @param args not used.
	 */
    public static void main(String[] args) {
		Main p = new Main();		
		System.out.println("SUMA NOMBRES PRIMERS 1-100\n");
		
		System.out.println("TOTAL:"+p.primeSum(100));
		
		System.out.println("******************************\nSUMA NOMBRES PRIMERS 1-5\n");
		System.out.println("TOTAL:"+p.primeSum(5));
		
		
		
	}
}
