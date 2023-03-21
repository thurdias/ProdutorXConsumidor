package jantarDosSelvagens;

import javax.swing.JFrame;

public class Principal extends JFrame{
	// Propriedades da classe
	private static final long serialVersionUID = 1L;
	private Painel objPainel = new Painel();
	
	// Método principal de execução da classe
	public static void main(String[] args) {
		new Principal().setVisible(true);
	}

	// Método construtor da classe
	public Principal() {
		// Configuração da janela
		setTitle("Jantar dos Selvagens");
		setSize(800,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		// Configuração do painel
		setContentPane(objPainel);
		
		// Configuração das Threads
		ControleTela objControleTela = new ControleTela(objPainel);
		objControleTela.start();
		
		new Selvagem(1000).start();
		new Selvagem(2000).start();
		new Selvagem(3000).start();
		
		new Cozinheiro().start();
	}
}
