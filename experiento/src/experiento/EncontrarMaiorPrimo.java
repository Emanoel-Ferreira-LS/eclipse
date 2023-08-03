package experiento;

public class EncontrarMaiorPrimo {

	public static void main(String[] args) {

		
         int numero = 1;
         int i = 1;
         int pontos = 1;
         
         System.out.println("ENCONTRAR NUMEROS PRIMOS DE 1 À 1000");
         System.out.println(".............................................");
          while(numero<1000) {
        	  while(i<numero) {
        		  if (numero%i==0) {
        			  pontos++;
        		  }
        		  i++;
        	  }
        	  
        	  if (pontos == 0 && numero>0) {
        		 System.out.println(numero); 
        	  }
        	  numero++;
        	  i = 2;
        	  pontos = 0;
 
          }
          
          
          
	}

}
