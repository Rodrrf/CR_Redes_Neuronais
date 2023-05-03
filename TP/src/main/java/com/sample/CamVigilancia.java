package com.sample;

public class CamVigilancia {
	Divisao divisao;
	Intruso intruso;
	boolean ligado; //  0 - camara desligada 1 - camara ligada
	boolean detecao; //  0 - horario de detecao desativado 1 - horario de detecao ativado
	

	public CamVigilancia(Divisao divisao, Intruso intruso, boolean ligado, boolean detecao) {
		super();
		this.divisao = divisao;
		this.intruso = intruso;
		this.ligado = ligado;
		this.detecao = detecao;
	}

	public boolean isDetecao() {
		return detecao;
	}

	public void setDetecao(boolean detecao) {
		this.detecao = detecao;
	}

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
	
	public Intruso getIntruso() {
		return intruso;
	}

	public void setIntruso(Intruso intruso) {
		this.intruso = intruso;
	}
	
	
}
