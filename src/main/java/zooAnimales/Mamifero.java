package zooAnimales;

import gestion.Zona;

public class Mamifero extends Animal {
	// ===========================================================
	// Atributos
	private Mamifero listado[];
	public int caballos;
	public int leones;
	private boolean pelaje;
	private int patas;
	
	// ===========================================================
	// Constructor
	public Mamifero(int totalAnimales, String nombre, int edad, String habitad, String genero, Zona[] zona,
			Mamifero[] listado, int caballos, int leones, boolean pelaje, int patas) {
		super(totalAnimales, nombre, edad, habitad, genero, zona);
	}
	
	public Mamifero(String nombre, int edad, String habitad, String genero,
			boolean pelaje, int patas) {
		super(nombre, edad, habitad, genero);
		this.pelaje = pelaje;
		this.patas = patas;
	}
	
	public Mamifero() {
		// Vacío 
	}
	
	// ===========================================================
	// Métodos principales
	public void cantidadMamifero() {
		// código del método
	}
	
	public void crearCaballo() {
		// código del métodos
	}
	
	public void crearLeon() {
		// código del métodos
	}

	public Mamifero[] getListado() {
		return listado;
	}

	public void setListado(Mamifero[] listado) {
		this.listado = listado;
	}

	public boolean isPelaje() {
		return pelaje;
	}

	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}
	
	// ===========================================================
	// Getters y setters
	
	
}
