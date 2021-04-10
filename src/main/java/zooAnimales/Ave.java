package zooAnimales;

import gestion.Zona;

public class Ave extends Animal {
	// ===========================================================
	// Atributos
	private Ave listado[];
	public int halcones;
	public int aguilas;
	private String colorPlumas;
	
	// ===========================================================
	// Constructor
	public Ave(int totalAnimales, String nombre, int edad, String habitad, String genero, Zona[] zona,
					Ave[] listado, int halcones, int aguilas, String colorPlumas) {
		super(totalAnimales, nombre, edad, habitad, genero, zona);
	}
	
	public Ave(String nombre, int edad, String habitad, String genero,String colorPlumas) {
		super(nombre, edad, habitad, genero);
		this.colorPlumas = colorPlumas;
	}
	
	public Ave() {
		// Vac�o
	}
	
	// ===========================================================
	// M�todos principales
	
	public void cantidadAves() {
		// c�digo del m�todo
	}
	
	public void movimiento() {
		// c�digo del m�todo
	}

	public void crearHalcon() {
		// c�digo del m�todo
	}
	
	public void crearAguila() {
		// c�digo del m�todo
	}
	
	// ===========================================================
	// Getters y setters
		
	public Ave[] getListado() {
		return listado;
	}

	public void setListado(Ave[] listado) {
		this.listado = listado;
	}

	public String getColorPlumas() {
		return colorPlumas;
	}

	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
	
}
