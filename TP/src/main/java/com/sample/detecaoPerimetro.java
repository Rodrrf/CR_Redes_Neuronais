package com.sample;

public class detecaoPerimetro {
	Divisao divisao;
	boolean ligado;
	public detecaoPerimetro(Divisao divisao, boolean ligado) {
		super();
		this.divisao = divisao;
		this.ligado = ligado;
	}
	public boolean isLigado() {
		return ligado;
	}
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	public Divisao getDivisao() {
		return divisao;
	}
	public void setDivisao(Divisao divisao) {
		this.divisao = divisao;
	}
	
	
}
