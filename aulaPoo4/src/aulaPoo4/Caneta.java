package aulaPoo4;

public class Caneta {
   private String cor;
   private String modelo;
   private boolean tampada;
   
//METODO CONSTRUTOR
   //define uma ação executada assim que o objeto e criado
   //sempre é simplismente o nomeDaClasse()
   //recebe pelos parametros, em ordem, os atributos do objeto
   
   public Caneta(String m, String c, boolean t) {
	   this.cor = c;//o valor recebido é enviado para o atributo da classe, o de cima
	   this.modelo = m;
	   this.tampada = t;
	   status();
   }
   
//METODOS ACESSORES (GET) 
   //serve pra acessar indiretamente o atributo já que ele e privado
   //o GET precisa ser do mesmo tipo do atributo
   public String getCor() {
	   return this.cor;
   }
   
   public String getModelo() {
	   return this.modelo;
   }
   
//METODOS MODIFICADORES
 //serve pra introduzir indiretamente o valor do atributo
 //o SET é simplismente void
   public void setCor(String c) {
	   this.cor = c;
   }
   
   public void setModelo(String m) {
	   this.modelo = m;

   }
   
   public boolean getTampada(boolean t) {
	   return this.tampada;
   }
   
//METODOS NORMAIS
   public void tampar() {
	   this.tampada = true;
   }
   
   public void status() {
	   
   }
   
   
}
