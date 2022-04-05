package dyds.solid.ejA;

import java.util.ArrayList;

public class ProcesadorDeContenidosNuevos {
	Poster poster;// = new Poster();
	Repositorio repo = new RepositorioDummy(); //Sacar el repo a una interfaz?

	public ProcesadorDeContenidosNuevos(ArrayList<RedSocial> redes){
		poster = new Poster(redes);
	}
	public void procesar(Contenido contenidoNuevo){
		if(contenidoNuevo.validar() && repo.grabar(contenidoNuevo)){
			poster.post(contenidoNuevo);
		}
	}
	public Repositorio getRepo() { return repo; }

	/*public void procesar(Contenido contenidoNuevo) {
		if (contenidoNuevo.validar() && repo.grabar(contenidoNuevo)) {
			ManejadorDeChulogram.getInstance().postearContenido(contenidoNuevo);
		}
	}

	public RepositorioDummy getRepo() { return repo; }

	 */
}
