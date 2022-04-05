package dyds.solid.ejA;

public class ProcesadorDeContenidosNuevos {
	Poster poster = new Poster();
	Repositorio repo = new RepositorioDummy();

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
