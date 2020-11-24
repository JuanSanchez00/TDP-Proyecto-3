package Juego;

import Fabrica.FabricaPortadorAlpha;
import Fabrica.FabricaPortadorBeta;

public class Nivel2 extends Nivel {

	public Nivel2(Juego juego) {
		super(juego);
		cantidad = new int[2];
		cantidad[0] = 20;
		cantidad[1] = 30;
		siguiente = null;
		listaFabricas.add(new FabricaPortadorAlpha(juego));
		listaFabricas.add(new FabricaPortadorBeta(juego));
		cantOleadas = 2;
	}

}
