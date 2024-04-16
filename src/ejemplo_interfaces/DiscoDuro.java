package ejemplo_interfaces;

public class DiscoDuro implements IEjemploDeInterface {

	@Override
	public void guardarDatos(String datos) {
		System.out.println("Guardando datos en el disco duro: " + datos);
	}

	@Override
	public String cargarDatos() {
		String datos = "Datos desde el disco duro";
		System.out.println("cargando..." + datos);
		return datos;
	}

}
