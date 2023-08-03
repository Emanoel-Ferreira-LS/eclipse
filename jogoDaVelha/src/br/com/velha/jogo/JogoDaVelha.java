package br.com.velha.jogo;

import java.util.Scanner;

public class JogoDaVelha {

	private char jogo[][] = new char [4][4];
	private int valor;
	public int c = 1;
	
	public JogoDaVelha() {
		for (int i = 0; i<4 ; i++) {
			for (int j = 0; j<4; j++) {
				jogo[i][j] = '-';
				
			}
		}
		
		jogo[0][0] = ' ';
		jogo[0][1] = '1';
		jogo[0][2] = '2';
		jogo[0][3] = '3';
		jogo[1][0] = '1';
		jogo[2][0] = '2';
		jogo[3][0] = '3';
		
		
	}
	
	public void mostrar() {
		for (int i = 0; i<4; i++) {
			for (int j = 0; j<4; j++) {
				System.out.print(jogo[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
	public void jogar() {
		Scanner input = new Scanner(System.in);
		valor = 0;
		
			
     for (int a = 1; a<5; a++) {
    	int linha = ' ';
		int coluna = ' ';
		System.out.println("Jogador1:Efetue sua jogada! Escolha a linha e coluna:");
		System.out.print("linha:");
		linha = input.nextInt();
		System.out.printf("\ncoluna:");
		coluna = input.nextInt();
			if (linha>0 && linha<4 ) {
			    if (coluna>=0 && coluna<4) {
			    	if (jogo[linha][coluna] == '-') {
			    		jogo[linha][coluna] = 'x';
			     }
			}
		} 
	    
		    mostrar();
		    
		    if (a==9)break;
       
		    linha = 0;
			coluna = 0;
			System.out.println("Jogador1:Efetue sua jogada! Escolha a linha e coluna:");
			System.out.print("linha:");
			linha = input.nextInt();
			System.out.printf("\ncoluna:");
			coluna = input.nextInt();
				if (linha>0 && linha<4 ) {
				    if (coluna>=0 && coluna<4) {
				    	if (jogo[linha][coluna] == '-') {
				    		jogo[linha][coluna] = 'o';
				     }
				}
			}
				
		mostrar();
     }
   	
}
	
           public void definirVencedor() {
              boolean jogador1Ganhou;
              boolean jogador2Ganhou;
        
    	    if ((jogo[1][1] == 'x' && jogo[1][2] == 'x' && jogo[1][3] == 'x') ||
    	        (jogo[2][1] == 'x' && jogo[2][2] == 'x' && jogo[2][3] == 'x') ||
    	        (jogo[3][1] == 'x' && jogo[3][2] == 'x' && jogo[3][3] == 'x') ||
    	        (jogo[1][1] == 'x' && jogo[2][1] == 'x' && jogo[3][1] == 'x') ||
    	        (jogo[1][2] == 'x' && jogo[2][2] == 'x' && jogo[3][2] == 'x') ||
    	        (jogo[1][3] == 'x' && jogo[2][3] == 'x' && jogo[3][3] == 'x') ||
    	        (jogo[1][1] == 'x' && jogo[2][2] == 'x' && jogo[3][3] == 'x') ||
    	        (jogo[1][3] == 'x' && jogo[2][2] == 'x' && jogo[3][1] == 'x')) {
    	    	  
    	    	System.out.println("Jogador1 Ganhou!! Parabens!!!");
    	      }
 
    	    if (    (jogo[1][1] == 'o' && jogo[1][2] == 'o' && jogo[1][3] == 'o') ||
        	        (jogo[2][1] == 'o' && jogo[2][2] == 'o' && jogo[2][3] == 'o') ||
        	        (jogo[3][1] == 'o' && jogo[3][2] == 'o' && jogo[3][3] == 'o') ||
        	        (jogo[1][1] == 'o' && jogo[2][1] == 'o' && jogo[3][1] == 'o') ||
        	        (jogo[1][2] == 'o' && jogo[2][2] == 'o' && jogo[3][2] == 'o') ||
        	        (jogo[1][3] == 'o' && jogo[2][3] == 'o' && jogo[3][3] == 'o') ||
        	        (jogo[1][1] == 'o' && jogo[2][2] == 'o' && jogo[3][3] == 'o') ||
        	        (jogo[1][3] == 'o' && jogo[2][2] == 'o' && jogo[3][1] == 'o')) {
        	    	  
        	    	System.out.println("Jogador2 Ganhou!! Parabens!!!");
        	      }
    	      
            }
           
           
   }