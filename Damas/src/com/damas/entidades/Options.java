package com.damas.entidades;

public class Options {
	private Boolean sound = true;
	private Boolean twoPlayers = false;
	private String colorPlayerA = "Black";
	private String colorPlayerB = "White";
	private String Level = "Easy";

	private Integer tamanhoTabuleiro = 8;
	

	public void switchTwoPlayers(){
		if (this.getTwoPlayers()){
				this.setTwoPlayers(Boolean.FALSE); 
			}else{ 
				this.setTwoPlayers(Boolean.TRUE);
		}
	}
	public void switchSound(){
		if (this.getSound()){
				this.setSound(Boolean.FALSE); 
			}else{ 
				this.setSound(Boolean.TRUE);
		}
	}
	public void switchPlayerA(){
		if ("Black".equalsIgnoreCase(this.getColorPlayerA())){
			 this.setColorPlayerA("White"); 
			 this.setColorPlayerB("Black"); 
			}else{ 
				this.setColorPlayerA("Black");
				this.setColorPlayerB("White");
			}
		}
	public void switchLevel(){
		if("Easy".equalsIgnoreCase(getLevel())){
			this.setLevel("Hard");
		} else{
			this.setLevel("Easy");
		}
	}

	public Boolean getTwoPlayers() {
		return twoPlayers;
	}
	public void setTwoPlayers(Boolean twoPlayers) {
		this.twoPlayers = twoPlayers;
	}

	public Boolean getSound() {
		return sound;
	}
	public Integer getTamanhoTabuleiro() {
		return tamanhoTabuleiro;
	}
	public void setTamanhoTabuleiro(Integer tamanhoTabuleiro) {
		this.tamanhoTabuleiro = tamanhoTabuleiro;
	}
	public void setSound(Boolean sound) {
		this.sound = sound;
	}
	public String getColorPlayerA() {
		return colorPlayerA;
	}
	public void setColorPlayerA(String colorPlayerA) {
		this.colorPlayerA = colorPlayerA;
	}
	public String getColorPlayerB() {
		return colorPlayerB;
	}
	public void setColorPlayerB(String colorPlayerB) {
		this.colorPlayerB = colorPlayerB;
	}
	public String getLevel() {
		return Level;
	}
	public void setLevel(String level) {
		Level = level;
	}
	
}
