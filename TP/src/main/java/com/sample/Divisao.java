package com.sample;

public class Divisao {
		String nome;
		boolean fecho;

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		
		public Divisao(String nome, boolean fecho) {
			super();
			this.nome = nome;
			this.fecho = fecho;
		}

		public boolean isFecho() {
			return fecho;
		}

		public void setFecho(boolean fecho) {
			this.fecho = fecho;
		}
		
}
