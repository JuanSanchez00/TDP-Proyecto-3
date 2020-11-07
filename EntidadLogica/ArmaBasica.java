package EntidadLogica;

import EntidadGrafica.EntidadGrafica;
import Inteligencia.Inteligencia;
import Visitor.Visitor;

public class ArmaBasica extends ProyectilSanitario {

	@Override
	public void aceptarVisitor(Visitor v) {
		v.visitarArmaBasica(this);
	}


}
