package gestion;

public class Zoologico {
	// ===========================================================
	// Atributos
	private String nombre;
	private String ubicacion;
	private Zona zonas[]; // Chequear que s� sea est�tica
	
	// ===========================================================
	// Constructor
	public Zoologico(String nombre, String ubicacion, Zona[] zonas) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.zonas = zonas;
	}
	
	public Zoologico(String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}
	
	public Zoologico() {
		// Vac�o
	}
	

	// ===========================================================
	// M�todos
	public void agregarZonas() {
		// c�digo del m�todo
	}

	public void cantidadTotalAnimales() {
		// c�digo del m�todo
	}
	
	// ===========================================================
	// Getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public Zona[] getZonas() {
		return zonas;
	}

	public void setZonas(Zona[] zonas) {
		this.zonas = zonas;
	}

}
