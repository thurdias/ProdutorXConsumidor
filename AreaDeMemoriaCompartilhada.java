package jantarDosSelvagens;

public class AreaDeMemoriaCompartilhada {
	// Propriedades da classe
	private static int caldeirao = 0;
	
	// Métodos da classe
	public synchronized static void cozinhar() {
		caldeirao = (1+(int) (Math.random()*10));
	}
	
	public synchronized static void jantar() {
		caldeirao--;
	}
	
	public synchronized static int getQtdPorcoesCaldeirao() {
		return caldeirao;
	}
}
