package dyds.solid.ejA;

import java.util.ArrayList;

public class ProcesadorDeContenidosNuevos {
	Poster poster;
	Repositorio repo = new RepositorioDummy();

	public ProcesadorDeContenidosNuevos(ArrayList<RedSocial> redes){
		poster = new Poster(redes);
	}

	public void procesar(Contenido contenidoNuevo){
		if(contenidoNuevo.validar() && repo.grabar(contenidoNuevo)){
			poster.post(contenidoNuevo);
		}
	}

	public Repositorio getRepo() { return repo; }

}
