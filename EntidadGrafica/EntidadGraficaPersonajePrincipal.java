package EntidadGrafica;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import EntidadLogica.Entidad;
import Juego.Juego;

public class EntidadGraficaPersonajePrincipal extends EntidadGrafica{
	
	public EntidadGraficaPersonajePrincipal(Entidad entidad){
		super(entidad);
		this.imagenes = new String[]{"/Grafica/Personaje Principal/PersonajePrincipalDefault.gif","/Grafica/Personaje Principal/PersonajePrincipalMoverIzquierda.gif","/Grafica/Personaje Principal/PersonajePrincipalMoverDerecha.gif","/Grafica/Personaje Principal/PersonajePrincipalMuerte.gif"};
		this.altura = 500;
		this.ancho = 200;
	}
	
	public ImageIcon getImagenMovientoIzquierda() {
		return new ImageIcon(this.getClass().getResource(this.imagenes[1]));
	}
	
	public ImageIcon getImagenMovientoDerecha() {
		return new ImageIcon(this.getClass().getResource(this.imagenes[2]));
	}
	
	public ImageIcon getImagenMuerte() {
		return new ImageIcon(this.getClass().getResource(this.imagenes[3]));
	}
}
