package EntidadLogica;

import Visitor.Visitor;

public class SuperArma extends ProyectilSanitario {

	@Override
	public void aceptarVisitor(Visitor v) {
		v.visitarSuperArma(this);
	}

	@Override
	public void daniar(EntidadPersonaje ep) {
		// TODO Auto-generated method stub
		
	}
}
