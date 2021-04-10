package zooAnimales;

import gestion.Zona;

public class Anfibio extends Animal {
	// ===========================================================
	// Atributos
	private Anfibio listado[];
	public int ranas;
	public int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	// ===========================================================
	// Constructor
	public Anfibio(int totalAnimales, String nombre, int edad, String habitad, String genero, Zona[] zona,
			Anfibio[] listado, int ranas, int salamandras, String colorPiel, boolean venenoso) {
		super(totalAnimales, nombre, edad, habitad, genero, zona);
	}
	
	// ===========================================================
	// M�todos principales
	
	public void cantidadAnfibios() {
		// c�digo del m�todo
	}
	
	public void movimiento() {
		// c�digo del m�todo
	}
	
	public void crearRana() {
		// c�digo del m�todo
	}
	
	public void crearSalamandra() {
		// c�digo del m�todo
	}
	
	// ===========================================================
	// Getters y setters
	public Anfibio[] getListado() {
		return listado;
	}

	public void setListado(Anfibio[] listado) {
		this.listado = listado;
	}

	public String getColorPiel() {
		return colorPiel;
	}

	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}

	public boolean isVenenoso() {
		return venenoso;
	}

	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
	
	
}
