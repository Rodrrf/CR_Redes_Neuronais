package com.sample;

public class TeamSecurity {
		private String nomeTeam;
		private int numero;
		boolean deteve;//0 se ainda nao deteve, 1 se ja deteve
		boolean local; //0 se ainda nao chegou, 1 se ja chegou
		

		

		public TeamSecurity(String nomeTeam, int numero, boolean deteve, boolean local) {
			super();
			this.nomeTeam = nomeTeam;
			this.numero = numero;
			this.deteve = deteve;
			this.local = local;
		}

		public String getNomeTeam() {
			return nomeTeam;
		}

		public int getNumero() {
			return numero;
		}

		public void setLocal(boolean local) {
			this.local = local;
		}

		public boolean isDeteve() {
			return deteve;
		}

		public void setDeteve(boolean deteve) {
			this.deteve = deteve;
		}

		public boolean isLocal() {
			return local;
		}
		
		
		
}
