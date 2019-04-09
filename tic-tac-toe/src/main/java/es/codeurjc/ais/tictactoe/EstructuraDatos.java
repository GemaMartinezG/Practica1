package es.codeurjc.ais.tictactoe;

import java.util.ArrayList;

public class EstructuraDatos {
	
	ArrayList<Player> estructuraDatosJugadores = new ArrayList<>();
	ArrayList<Jugador> estructuraDatosPartidas = new ArrayList<>();
	
	public ArrayList<Player> getEstructuraDatosJugadores() {
		return estructuraDatosJugadores;
	}
	public void setEstructuraDatosJugadores(ArrayList<Player> estructuraDatosJugadores) {
		this.estructuraDatosJugadores = estructuraDatosJugadores;
	}
	public ArrayList<Jugador> getEstructuraDatosPartidas() {
		return estructuraDatosPartidas;
	}
	public void setEstructuraDatosPartidas(ArrayList<Jugador> estructuraDatosPartidas) {
		this.estructuraDatosPartidas = estructuraDatosPartidas;
	}
	
	public int devolverIndice(Player p) {
		int indice=0;
		for(Player j : estructuraDatosJugadores) {
			if(j.equals(p)) {
				return indice;
			}
			indice++;
		}
		return indice;
	}

	
	 
	
	
	
}
