package com.damas.entidades;

public class Peca {
	private String cor;
	private Integer posx;
	private Integer posY;
	public Peca() {
	
	}
	public Peca(Integer i, Integer j) {
		this.posx = i;
		this.posY = j;
	}
	public Peca(Integer i, Integer j,String cor) {
		this(i,j);
		this.cor = cor;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public Integer getPosx() {
		return posx;
	}
	public void setPosx(Integer posx) {
		this.posx = posx;
	}
	public Integer getPosY() {
		return posY;
	}
	public void setPosY(Integer posY) {
		this.posY = posY;
	}

	
	
}
