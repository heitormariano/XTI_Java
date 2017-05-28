package br.com.xti.aula038;

public class RaizPell {

	public int raiz(int numero){
		//meu codigo
		int ciclos = 0;
		int impar = 1;
		int resultado = numero;
		
		while (resultado >= impar){
			resultado = resultado - impar;
			
			impar +=2;
			ciclos +=1;
		}
		
		return ciclos;
	}
	
	//acrescentei o metodo
	//raiz mais preciso com o uso da classe Math
	public double raizPrecisa (double numero){
		return Math.sqrt(numero);
	}
}
