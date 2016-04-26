package com.damas.util;

public enum Simbolo {
	BLACK ("B"),
	WHITE ("W");
	
	private String simbol;
	Simbolo(String simbolo){
		setSimbol(simbolo);
	}
	
	public String getSimbol() {
		return simbol;
	}
	public void setSimbol(String simbol) {
		this.simbol = simbol;
	}
}
