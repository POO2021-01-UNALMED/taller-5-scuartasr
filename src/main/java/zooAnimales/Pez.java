package zooAnimales;

import gestion.Zona;

public class Pez extends Animal {
	// ===========================================================
	// Atributos
	private Pez listado[];
	public int salmones;
	public int bacalaos;
	private String colorEscamas;
	private int colorAletas;
	
	// ===========================================================
	// Constructor
	public Pez(int totalAnimales, String nombre, int edad, String habitad, String genero, Zona[] zona,
			Pez[] listado, int salmones, int bacalaos, String colorEscamas, int colorAletas) {
		super(totalAnimales, nombre, edad, habitad, genero, zona);
	}
	
	// ===========================================================
	// Métodos principales
	public void cantidadPeces() {
		// código del método
	}
	
	public void movimiento() {
		// código del método
	}
	
	public void crearSalmon() {
		// código del método
	}
	
	public void crearBacalao() {
		// código del método
	}
	
	// ===========================================================
	// Getters y setters
	public Pez[] getListado() {
		return listado;
	}

	public void setListado(Pez[] listado) {
		this.listado = listado;
	}

	public String getColorEscamas() {
		return colorEscamas;
	}

	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}

	public int getColorAletas() {
		return colorAletas;
	}

	public void setColorAletas(int colorAletas) {
		this.colorAletas = colorAletas;
	}
	
	

}
