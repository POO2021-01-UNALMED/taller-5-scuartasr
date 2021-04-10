package zooAnimales;

import gestion.Zona;

public class Reptil extends Animal {
	// ===========================================================
	// Atributos
	private Reptil listado[];
	public int iguanas;
	public int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	// ===========================================================
	// Constructor
	public Reptil(int totalAnimales, String nombre, int edad, String habitad, String genero, Zona[] zona,
			Reptil[] listado, int iguanas, int serpientes, String colorEscamas, int largoCola) {
		super(totalAnimales, nombre, edad, habitad, genero, zona);
	}
	
	public Reptil(String nombre, int edad, String habitad, String genero,
			String colorEscamas, int largoCola) {
		super(nombre, edad, habitad, genero);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
	}
	
	public Reptil() {
		// Vacío
	}
	
	// ===========================================================
	// Métodos principales
	
	public void cantidadReptiles() {
		// código del método
	}
	
	public void movimiento() {
		// código del método
	}
	
	public void crearIguana() {
		// código del método
	}
	
	public void crearSerpiente() {
		// código del método
	}

	// ===========================================================
	// Getters y setters
	public Reptil[] getListado() {
		return listado;
	}

	public void setListado(Reptil[] listado) {
		this.listado = listado;
	}

	public String getColorEscamas() {
		return colorEscamas;
	}

	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}

	public int getLargoCola() {
		return largoCola;
	}

	public void setLargoCola(int largCola) {
		this.largoCola = largCola;
	}
	

}
