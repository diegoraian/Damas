package com.damas.threads;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import com.damas.entidades.Options;

public class Menu implements Runnable {
	Options options;
	private Boolean torunning;

	@Override
	public void run() {
		Integer Inicio = 0;
		options = new Options();
		while (Inicio != 3) {
		StringBuilder menu = new StringBuilder();
		menu.append("1 - New Game\n");
		menu.append("2 - Options\n");
		menu.append("3 - Exit\n");
		System.out.println(menu.toString());
		Scanner scan = new Scanner(System.in);
			Inicio = scan.nextInt();
			try {
				switch (Inicio) {
				case 1:
					new Game().prepareToRun(options);
					break;
				case 2:
					options();
					break;
				case 3:
					break;
				}

			} catch (Error | IOException e) {
				e.printStackTrace();
			}

		}
	}

	/**
	 * Retirar o switch B players fazer caso troque um trocar os 2
	 * 
	 */
	public void options() throws IOException {
		setTorunning(Boolean.TRUE);
		while (Boolean.TRUE.equals(getTorunning())) {
			StringBuilder Opcoes = new StringBuilder();
			Opcoes.append("\tOptions\n");
			Opcoes.append("1 - Two Players: " + options.getTwoPlayers().toString() + "\n");
			Opcoes.append("2- Sound: " + options.getSound().toString() + "\n");
			Opcoes.append("3- Color A: " + options.getColorPlayerA().toString() + " \n Color B: "
					+ options.getColorPlayerB().toString() + "\n");
			Opcoes.append("4- Level: " + options.getLevel()+"\n");
			Opcoes.append("5- Exit");
			System.out.println(Opcoes.toString());
			Scanner scan = new Scanner(System.in);
			switch (scan.nextInt()) {
			case 1:
				options.switchTwoPlayers();
				break;
			case 2:
				options.switchSound();
				break;
			case 3:
				options.switchPlayerA();
				break;
			case 4:
				options.switchLevel();
				break;
			case 5:
				setTorunning(Boolean.FALSE);
				break;
			}

		}
	}

	public Boolean getTorunning() {
		return torunning;
	}

	public Boolean setTorunning(Boolean torunning) {
		this.torunning = torunning;
		return torunning;
	}

}
