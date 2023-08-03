package br.com.compexos.numeros;

public class ComplexExecute {

	public static void main(String[] args) {
		
			Complex complex = new Complex(8,4,6,2); //OBJETO COM VALORES DEFINIDOS
			Complex complex1 = new Complex(); //OBJETO COM VALORES PARÃO

			complex.imprimir();
			complex.adicao();
			complex.subtracao();
		
			complex1.imprimir();
			complex1.adicao();
			complex1.subtracao();

	}    

}
