package ejemplo_interfaces;

public class AlmacenamientoNube implements IEjemploDeInterface {

	@Override
	public void guardarDatos(String datos) {
		System.out.println("Guardando datos en la nube: " + datos);
	}
	
	@Override
	public String cargarDatos() {		
		String datos = "datos desde la nube";
		System.out.println("cargando..." + datos);
		return datos;
	}

}
