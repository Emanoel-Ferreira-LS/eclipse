package aulaPoo2;

import java.util.Scanner;

public class AulaPoo2 {

	public static void main(String[] args) {
		
	Scanner leia = new Scanner(System.in);
	
		Caneta c1 = new Caneta();
		  c1.modelo = "bic";
		  c1.cor = "vermelha";
		  c1.ponta = (float) 0.5;
		  c1.carga = 50;
		  c1.destampar();
          c1.status();
		  c1.rabiscar();
		  
		  System.out.printf("%n%n%n");
		  
	  Caneta c2 = new Caneta();
	      c1.modelo = "compactor07"
	      		+ "";
	      c1.cor = "azul";
	      c1.ponta = (float) 0.8;
	      c1.carga = 4;
	      c1.tampar();
          c1.status();
	      c1.rabiscar();
	      
	}
}
