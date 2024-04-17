package ejemplo_interfaces;

public class EjemploInterfazTipo2 {
	
	//variable de tipo interface con a sus metodos creados previamente.
	private IEjemploDeInterface interfazTipo2;
	
	//metodo cosntructor de la clase.
	public EjemploInterfazTipo2(IEjemploDeInterface interfazTipo2) {
		this.interfazTipo2 = interfazTipo2;
	}
	
	//metodo que almacena datos y los despliega en consola.
	public void almacenarDatos() {
		interfazTipo2.guardarDatos("mis datos");
		interfazTipo2.cargarDatos();
	}
	
	//metodo main para ejecutar el codigo.
	
	public static void main(String[] args) {
		
		//implementacion de los metodos de la interfaz 
		EjemploInterfazTipo2 appAlmacenarDiscoDuro = new EjemploInterfazTipo2(new DiscoDuro());
		appAlmacenarDiscoDuro.almacenarDatos();
		
		//implementacion de los metodos de la interfaz  
		EjemploInterfazTipo2 appAlmacenamientoEnNube = new EjemploInterfazTipo2(new AlmacenamientoNube());
		appAlmacenamientoEnNube.almacenarDatos();
	}

}
