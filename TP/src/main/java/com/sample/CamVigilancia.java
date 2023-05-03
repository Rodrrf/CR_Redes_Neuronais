package com.sample;

public class CamVigilancia {
	Divisao divisao;
	boolean ligado; //  0 - camara desligada 1 - camara ligada
	public CamVigilancia(Divisao divisao, boolean ligado, boolean detecao) {
		super();
		this.divisao = divisao;
		this.ligado = ligado;
		this.detecao = detecao;
	}

	public boolean isDetecao() {
		return detecao;
	}

	public void setDetecao(boolean detecao) {
		this.detecao = detecao;
	}

	boolean detecao; //  0 - horario de detecao desativado 1 - horario de detecao ativado

	public Divisao getDivisao() {
		return divisao;
	}

	public void setDivisao(Divisao divisao) {
		this.divisao = divisao;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	
	
}
