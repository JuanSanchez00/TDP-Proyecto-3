package EntidadLogica;

import Juego.*;

public abstract class EntidadPersonaje extends Entidad {
	protected int cargaViral;
	protected EntidadProyectil proyectil;
	
	public EntidadPersonaje(Juego juego) {
		super(juego);
		proyectil = new ArmaBasica(juego);
	}
	
	public int getCargaViral() {
		return this.cargaViral;
	}
	
	public void setCargaViral(int cv) {
		this.cargaViral = cv;
	}
	
	public EntidadProyectil getProyectil() {
		return this.proyectil;
	}
	
	public void setProyectil(EntidadProyectil ps) {
		this.proyectil = ps;
	}
	public boolean estaVivo() {
		return cargaViral != 0;
	}
	
	public void disparar(){
		
	}
	
	public void morir(){
		
	}
	
}
