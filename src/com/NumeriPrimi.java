/* Stampare i primi n numeri primi
Esempio con n=10:
Stamp: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29  */

package com;

public class NumeriPrimi {

	public static void main(String[] args) {
		
		int n = 10; //i primi n numeri primi che verranno stampati
		
		int tmp = 0; //variabile temporanea che conta i numeri primi trovati
		
		for(int i = 2; tmp < n; i++) { //i sono i numeri che controlliamo (ipoteticamente all'infinito)
			
			boolean dividendo = false;
			
			for(int k = 2; k <= i/2; k++) { //ciclo per trovare i dividendi di i
				//k <= i/2  perché i divisori di un numero sono sempre minori della metà di un numero
				
				if(i % k == 0) {
					dividendo = true;
					System.out.print(k + "* ");
					break;  //esce dal ciclo appena trova un dividendo
				}
			} 
		    if(dividendo == false) {   //se non ci sono dividendi stampa il numero primo
				System.out.print(i + " ");
				tmp++;	
			}
		}
	}
}
