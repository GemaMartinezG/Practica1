package es.codeurjc.ais.tictactoe;

public class Jugador {
	int ganado;
	int perdido;
	int empatado;

	
	public Jugador() {
		ganado =0;
		perdido =0;
		empatado = 0;
		
	}
	public int getGanado() {
		return ganado;
	}
	public void setGanado(int ganado) {
		this.ganado = ganado;
	}
	public int getPerdido() {
		return perdido;
	}
	public void setPerdido(int perdido) {
		this.perdido = perdido;
	}
	public int getEmpatado() {
		return empatado;
	}
	public void setEmpatado(int empatado) {
		this.empatado = empatado;
	}

	
	
}
