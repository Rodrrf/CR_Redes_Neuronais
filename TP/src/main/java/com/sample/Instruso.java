package com.sample;

public class Instruso {
	Divisao divisao;
	String tipo;
	
	public Instruso(Divisao divisao, String tipo) {
		super();
		this.divisao = divisao;
		this.tipo = tipo;
	}

	public Divisao getDivisao() {
		return divisao;
	}

	public void setDivisao(Divisao divisao) {
		this.divisao = divisao;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
	
}