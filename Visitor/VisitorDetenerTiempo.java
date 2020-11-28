package Visitor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

import EntidadLogica.ProyectilPersonajePrincipal;
import EntidadLogica.DetenerTiempo;
import EntidadLogica.EfectoTemporal;
import EntidadLogica.Entidad;
import EntidadLogica.MejorarArma;
import EntidadLogica.ProyectilBeta;
import EntidadLogica.PersonajePrincipal;
import EntidadLogica.Pocion;
import EntidadLogica.PortadorAlpha;
import EntidadLogica.PortadorBeta;
import Inteligencia.Inteligencia;
import Inteligencia.InteligenciaTiempoDetenido;

public class VisitorDetenerTiempo extends Visitor {
	
	public VisitorDetenerTiempo(Entidad entidad) {
		super(entidad);
		// TODO Auto-generated constructor stub
	}

	public void visitarPersonajePrincipal(PersonajePrincipal pp) {
		pp.getJuego().detenerTiempo();
		ActionListener accion = new ActionListener() {
    		public void actionPerformed(ActionEvent ae) {
    			
    		}
    	};
    	Timer timer = new Timer(((EfectoTemporal) entidadActual).getTiempo(), accion);
    	timer.start();
		pp.getJuego().reanudarTiempo();
		entidadActual.desaparecer();
		entidadActual.eliminar();
	}
}
