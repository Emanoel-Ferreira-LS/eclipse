package aulaPoo2;

public class Caneta {
	
//ATRIBUTOS
	public String modelo;
	public String cor;
	public float ponta;
	public int carga;
	public boolean tampada;
    
    
	public void status() {
    	System.out.println("modelo: " + this.modelo);
    	System.out.println("cor: " + this.cor);
    	System.out.println("ponta: " + this.ponta);
    	System.out.println("carga: " + this.carga);
    }
    
    public void rabiscar() {
    	if (this.tampada == false) {
    		System.out.println("rabiscando...");
    	}else {
    		System.out.println("A caneta esta tampada!");
    	}
    }
    
    public void destampar() {
    	tampada = false;
    }
    
    public void tampar() {
    	tampada = true;
    }
    
    
}
