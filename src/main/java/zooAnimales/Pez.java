package zooAnimales;

import gestion.Zona;

public class Pez extends Animal {
	// ===========================================================
	// Atributos
	private Pez listado[];
	public int salmones;
	public int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	// ===========================================================
	// Constructor
	public Pez(int totalAnimales, String nombre, int edad, String habitad, String genero, Zona[] zona,
			Pez[] listado, int salmones, int bacalaos, String colorEscamas, int colorAletas) {
		super(totalAnimales, nombre, edad, habitad, genero, zona);
	}
	
	public Pez(String nombre, int edad, String habitad, String genero,
			String colorEscamas, int cantidadAletas) {
		super(nombre, edad, habitad, genero);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
	}
	
	public Pez() {
		// Vac�o
	}
	
	// ===========================================================
	// M�todos principales
	public void cantidadPeces() {
		// c�digo del m�todo
	}
	
	public void movimiento() {
		// c�digo del m�todo
	}
	
	public void crearSalmon() {
		// c�digo del m�todo
	}
	
	public void crearBacalao() {
		// c�digo del m�todo
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

	public int getCantidadAletas() {
		return cantidadAletas;
	}

	public void setCantidadAletas(int colorAletas) {
		this.cantidadAletas = colorAletas;
	}
	
	

}
