package gestion;
import zooAnimales.*;

public class Zona {
	// ===========================================================
	// Atributos
	private String nombre;
	private Zoologico zoo;
	private Animal animales[]; // Chequear que sí sea estática
	
	// ===========================================================
	// Constructor
	public Zona(String nombre, Zoologico zoo, Animal[] animales) {
		this.nombre = nombre;
		this.zoo = zoo;
		this.animales = animales;
	}
	
	public Zona(String nombre, Zoologico zoo) {
		this.nombre = nombre;
		this.zoo = zoo;
	}
	
	public Zona() {
		// Vacío
	}
	
	// ===========================================================
	// Métodos
	public void agregarAnimales() {
		// código del método
	}
	
	public void cantidadAnimales() {
		// código del método
	}

	// ===========================================================
	// Getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Zoologico getZoo() {
		return zoo;
	}

	public void setZoo(Zoologico zoo) {
		this.zoo = zoo;
	}

	public Animal[] getAnimales() {
		return animales;
	}

	public void setAnimales(Animal[] animales) {
		this.animales = animales;
	}
	
	
}
