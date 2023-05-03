package com.sample;

public class Intruso {
	Divisao divisao;
	boolean pessoa;
	
	

	public Intruso(Divisao divisao, boolean pessoa) {
		super();
		this.divisao = divisao;
		this.pessoa = pessoa;
	}

	public Divisao getDivisao() {
		return divisao;
	}

	public void setDivisao(Divisao divisao) {
		this.divisao = divisao;
	}

	public boolean isPessoa() {
		return pessoa;
	}

	public void setPessoa(boolean pessoa) {
		this.pessoa = pessoa;
	}

	
	
	
	
}
