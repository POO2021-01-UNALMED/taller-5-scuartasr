package gestion;
import zooAnimales.*;
import java.util.Vector; // Se importa por el carácter dinámico del arreglo de animales

public class Zona {
	// ===========================================================
	// Atributos
	private String nombre;
	private Zoologico[] zoo = new Zoologico[1];
	private Vector<Animal> animales = new Vector<>();
		
	// ===========================================================
	// Constructor
		// Se muestran varios constructuores sobrecargados para uso según necesidad :]
	public Zona(String nombre, Zoologico zoo, Vector<Animal> animales) {
		this.nombre = nombre;
		this.zoo[0] = zoo;
		this.animales = animales;
	}
	
	public Zona(String nombre, Zoologico zoo) {
		this.nombre = nombre;
		this.zoo[0] = zoo;
	}
	
	public Zona() {
		// Vacío
	}
	
	// ===========================================================
	// Métodos
	public void agregarAnimales(Animal animal) {
		animales.add(animal);
	}
	
	public int cantidadAnimales() {
		return animales.size();
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
		return zoo[0];
	}

	public void setZoo(Zoologico zoo) {
		this.zoo[0] = zoo;
	}

	public Vector<Animal> getAnimales() {
		return animales;
	}

	public void setAnimales(Vector<Animal> animales) {
		this.animales = animales;
	}
	
	
}
