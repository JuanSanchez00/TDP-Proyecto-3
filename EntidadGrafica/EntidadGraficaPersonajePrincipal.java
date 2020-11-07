package EntidadGrafica;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class EntidadGraficaPersonajePrincipal extends EntidadGrafica{
	private String[] imagenes;
	
	public EntidadGraficaPersonajePrincipal(){
		this.imagenes = new String[]{"/Grafica/Personaje Principal/PersonajePrincipalDefault.gif","/Grafica/Personaje Principal/PersonajePrincipalMoverIzquierda.gif","/Grafica/Personaje Principal/PersonajePrincipalMoverDerecha.gif","/Grafica/Personaje Principal/PersonajePrincipalMuerte.gif"};
		this.label = new JLabel();
		this.altura = 1;
		this.ancho = 1;
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
