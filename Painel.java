package jantarDosSelvagens;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Painel extends JPanel{
	// Propriedades da classe
	private static final long serialVersionUID = 1L;

	
	// Método sobrescrito de desenho
	public void paintComponent(Graphics g) {
		int x = AreaDeMemoriaCompartilhada.getQtdPorcoesCaldeirao();
		
		super.paintComponent(g);	
		
		g.setColor(Color.black);
		g.fillRect(350,100 + ((10 - x) * 40),100, 400 - ((10 - x) * 40));
	}
}
