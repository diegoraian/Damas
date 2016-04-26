package com.damas.threads;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JMenu;
import com.damas.entidades.Options;
import com.damas.entidades.Tabuleiro;
import com.damas.screen.Painel;

public class Game implements Runnable {
	private Options options;
	@Override
	public void run() {

		JPanel painel = new JPanel();
		//painel.setVisible(true);
	}
	
	public void prepareToRun(Options opcao) {
		options = opcao;
		JFrame frame = new JFrame("Damas");
		Painel painel = new Painel();

	//	painel.add(menu);
		
		frame.add(painel);
		frame.setSize(300, 600);
		frame.setVisible(true);
		//preencherTabuleiro();
		run();
	}

	private void preencherTabuleiro() {
			Tabuleiro tabuleiro = new Tabuleiro(this.options);
			tabuleiro.exibirMatriz();
	}

}
