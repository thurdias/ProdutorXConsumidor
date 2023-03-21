package jantarDosSelvagens;

public class Selvagem extends Thread{
	// Propriedades da classe
	private int tempoDeComer = 0;
	
	// Método construtor cheio da classe
	public Selvagem(int tempoDeComer) {
		this.tempoDeComer = tempoDeComer;
	}
	
	// Método de execução paralela da classe
	public void run() {
		while(true) {
			if(AreaDeMemoriaCompartilhada.getQtdPorcoesCaldeirao() > 0) {
				AreaDeMemoriaCompartilhada.jantar();
			}
			
			try {sleep(tempoDeComer);} catch (Exception erro){}
		}
	}

}
