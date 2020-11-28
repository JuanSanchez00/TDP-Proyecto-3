package Visitor;

import EntidadLogica.*;

public abstract class Visitor {
	protected Entidad entidadActual;
	
	public Visitor (Entidad entidad) {
		this.entidadActual = entidad;
	}
	
	public void visitarPersonajePrincipal(PersonajePrincipal pp) {
		
	}
	
	public void visitarPortadorAlpha(PortadorAlpha pa) {
		
	}
	
	public void visitarPortadorBeta(PortadorBeta pb) {
		
	}
	
	public void visitarPocion(Pocion p) {
		
	}
	
	public void visitarMejorarArma(MejorarArma ma) {
		
	}
	
	public void visitarDetenerTiempo(DetenerTiempo dt) {
		
	}
	
	public void visitarProyectilPersonajePrincipal(ProyectilPersonajePrincipal ab) {
		
	}
	
	public void visitarProyectilBeta(ProyectilBeta pb) {
		
	}
	
	public void visitarProyectilAlpha(ProyectilAlpha pa) {
		
	}
}
