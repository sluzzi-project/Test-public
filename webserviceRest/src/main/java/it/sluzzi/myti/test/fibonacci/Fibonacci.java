package it.sluzzi.myti.test.fibonacci;

import java.math.BigDecimal;

public class Fibonacci {

	public static final int NUMERO_CIFRE = 1000;
	
	public static void main(String[] args) {
		
		BigDecimal numeroFibonacci = new BigDecimal("0");
		BigDecimal x = new BigDecimal("0");
		BigDecimal y = new BigDecimal("1");
		boolean trovato=false;
		int contatore = 2;//parto da 2 perch� considero già contati x=0 e y=1
		System.out.println("Ricerca dalla serie di Fibonacci il primo numero che ha 1000 cifre : ");
		while(!trovato) {
			
			numeroFibonacci = x.add(y);//calcolo numero fibonacci
			String numeroFibinacciFormat = String.valueOf(numeroFibonacci);//trasformo il numero in stringa
			
			//Test
//			if(contatore == 4781) {
//				System.out.println("Valore del numero precedente : " + numeroFibonacci);
//			}
			
			if(numeroFibinacciFormat.length() == NUMERO_CIFRE) {//Controllo che la stringa arrivi a lunghezza 1000, se si � il numero ricercato
				System.out.println("Trovato:  è il " + contatore + "° numero.");
				System.out.println("Il suo valore è " + numeroFibonacci);
					trovato =true;
			}
			else {
				x = y; //rimposto la x
				y = numeroFibonacci; //rimposto la y
				contatore++;
			}
		}
		System.out.println("Ricerca terminata.");
	}

}
