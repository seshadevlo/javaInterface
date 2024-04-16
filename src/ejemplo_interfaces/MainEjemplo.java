package ejemplo_interfaces;

public class MainEjemplo {

	public static void main(String[] args) {
		
		//se crean instancias de clases
		
		AlmacenamientoNube nube = new AlmacenamientoNube();
		DiscoDuro disco = new DiscoDuro();

		//se utilizan los metodos segun la necesidad de la clase.
		
		nube.guardarDatos("datos para la nube");
		nube.cargarDatos();
		
		disco.guardarDatos("datos para el disco duro");
		disco.cargarDatos();	
	}
}
