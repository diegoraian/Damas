package com.damas.entidades;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.damas.util.Simbolo;

public class Tabuleiro {
	private Integer tamanho;
	private Peca matriz[][];

	private Map<Integer,Peca> PecasDeA;
	private Map<Integer,Peca> PecasDeB;


	public Tabuleiro() {
		PecasDeA = new HashMap<Integer,Peca>();
		PecasDeB = new HashMap<Integer,Peca>();
	}



	public Tabuleiro(Options opcoes) {
		this();
		tamanho = opcoes.getTamanhoTabuleiro();
		matriz = new Peca[tamanho][tamanho];
		criaTabuleiro();
		preencheTabuleiro(opcoes.getColorPlayerA(),opcoes.getColorPlayerB());
	}

	public void preencheTabuleiro(String colorA, String colorB) {
		
		/*
		 * Preenche peças embaixo
		 */
		
		//String A = Simbolo.BLACK.toString().equalsIgnoreCase(colorA) ? "B": "W" ;
		//String B = Simbolo.BLACK.toString().equalsIgnoreCase(colorB) ? "B": "W" ;
		Integer pontos = 0;
		String A = "W";
		String B = "B";
		for (int i = 0; i < getTamanho()/2; i++) {
			Integer f = 1;
			for (int j = 0; j < getTamanho(); j++) {
				if (i == tamanho/2-1) {
					break;
				}
				if( f == 0){
					matriz[i][j] = new Peca(i,j,A);
					PecasDeB.put(pontos, matriz[i][j]);
					pontos++;
					f = 1;
				}else{
					f = 0;
				}
			}
		}
		/*
		 * Preenche peças em cima
		 */
		pontos = 0;
		for (int i = tamanho/2+1; i < getTamanho(); i++) {
			for (int j = 0; j < getTamanho(); j++) {
				matriz[i][j] = new Peca(i,j,B);
				PecasDeA.put(pontos, matriz[i][j]);
			}
		}
	}
	public Boolean par(Integer i){
		return i%2 ==0 ?  true : false;
	}
	public Boolean impar(Integer i){
		return i%2 !=0 ?  true : false;
	}
	public void criaTabuleiro() {
		for (int linha = 0; linha < getTamanho(); linha++) {
			for (int coluna = 0; coluna < getTamanho(); coluna++) {
				if (par(linha) && impar(coluna) && tamanho/2 -1 < linha ) {
					matriz[linha][coluna] = new Peca(linha,coluna,"_" );
				}
				if (par(linha) && par(coluna) && tamanho/2 -1 < linha ) {
					matriz[linha][coluna] = new Peca(linha,coluna," " );
				}				
				if (impar(linha) && par(coluna) && tamanho/2 -1 < linha) {
					matriz[linha][coluna] = new Peca(linha,coluna,"_");
				}
				if (impar(linha) && impar(coluna) && tamanho/2 -1 < linha) {
					matriz[linha][coluna] = new Peca(linha,coluna," ");
				}
				if (par(linha) && impar(coluna) && tamanho/2  > linha) {
					matriz[linha][coluna] = new Peca(linha,coluna,"_" );
				}
				if (par(linha) && par(coluna) && tamanho/2  > linha) {
					matriz[linha][coluna] = new Peca(linha,coluna," " );
				}
				if (impar(linha) && par(coluna) && tamanho/2 > linha) {
					matriz[linha][coluna] = new Peca(linha,coluna,"_");
				}
				if (impar(linha) && impar(coluna) && tamanho/2 > linha) {
					matriz[linha][coluna] = new Peca(linha,coluna," ");
				}
		
			}
		}
	}
	public void exibirMatriz(){
		for (int i = 0; i < getTamanho(); i++) {
			for (int j = 0; j < getTamanho(); j++) {
				System.out.printf(matriz[i][j].getCor());
			}
			System.out.println();
		}
		
	}
	public Integer getTamanho() {
		return tamanho;
	}

	public void setTamanho(Integer tamanho) {
		this.tamanho = tamanho;
	}

	public Peca[][] getMatriz() {
		return matriz;
	}

	public void setMatriz(Peca[][] matriz) {
		this.matriz = matriz;
	}

	public Map<Integer, Peca> getPecasDeA() {
		return PecasDeA;
	}



	public void setPecasDeA(Map<Integer, Peca> pecasDeA) {
		PecasDeA = pecasDeA;
	}



	public Map<Integer, Peca> getPecasDeB() {
		return PecasDeB;
	}



	public void setPecasDeB(Map<Integer, Peca> pecasDeB) {
		PecasDeB = pecasDeB;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((PecasDeA == null) ? 0 : PecasDeA.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tabuleiro other = (Tabuleiro) obj;
		if (PecasDeA == null) {
			if (other.PecasDeA != null)
				return false;
		} else if (!PecasDeA.equals(other.PecasDeA))
			return false;
		return true;
	}
	@Override
	public String toString(){
		
		for (int i = 0; i < getTamanho(); i++) {
			for (int j = 0; j < getTamanho(); j++) {
				System.out.printf(matriz[i][j].getCor());
			}
			System.out.println();
		}
		return null;
	}
}
