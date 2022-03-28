package dyds.solid.ejA;

public class ProcesadorDeContenidosNuevos {
	Poster poster = new Poster();
	RepositorioDummy repo = new RepositorioDummy(); //Sacar el repo a una interfaz?

	public void procesar(Contenido contenidoNuevo){
		if(contenidoNuevo.validar() && repo.grabar(contenidoNuevo)){
			poster.post(contenidoNuevo);
		}
	}
	public RepositorioDummy getRepo() { return repo; }

	/*public void procesar(Contenido contenidoNuevo) {
		if (contenidoNuevo.validar() && repo.grabar(contenidoNuevo)) {
			ManejadorDeChulogram.getInstance().postearContenido(contenidoNuevo);
		}
	}

	public RepositorioDummy getRepo() { return repo; }

	 */
}
