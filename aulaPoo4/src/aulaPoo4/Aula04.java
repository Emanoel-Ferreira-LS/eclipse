package aulaPoo4;

public class Aula04 {

	public static void main(String[] args) {
       Caneta c1 = new Caneta("bic","azul",true);//valores passados em parametros para o costrutor
       
       
          c1.setModelo("bic");//o set INTRODUZ ao modelo(q é privado) o valor 
          System.out.println("o modelo é "+c1.getModelo());//o GET consulta o modelo
          
          c1.setCor("azul");
          System.out.println("a cor é "+c1.getCor());
          
          
          if (c1.getTampada(true)) {
          System.out.println("A caneta está tampada");
          }/*apesar de não ter um set, o valor e exibido pois o construtor 
          já recebeu um valor "padrao" (caso não seja introduzido outro) atraves dos parametros
          do objeto
          */

	}

}
