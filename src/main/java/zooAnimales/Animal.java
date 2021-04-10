package zooAnimales;
import gestion.Zona;

public class Animal {
	// ===========================================================
	// Atributos
	private static int totalAnimales; // Chequear que sí sea estática
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona[];
	
	// ===========================================================
	// Constructor
	public Animal(int totalAnimales, String nombre, int edad, String habitat, String genero, Zona[] zona) {
		this.totalAnimales = totalAnimales;
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.zona = zona;
	}
	
	public Animal(String nombre, int edad, String habitad, String genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitad;
		this.genero = genero;
	}
	
	public Animal() {
		// Vacío
	}
	
	// ===========================================================
	// Métodos	
	public void movimiento() {
		// código del método
	}
	
	public void totalPorTipo() {
		// código del método 
	}
	
	public String toString() {
		return "ESCRIBIR EL CÓDIGO";
	}
	
	// ===========================================================
	// Getters y setters

	public static int getTotalAnimales() {
		return totalAnimales;
	}
	

	public static void setTotalAnimales(int totalAnimales) {
		Animal.totalAnimales = totalAnimales;
	}
	

	public String getNombre() {
		return nombre;
	}
	

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

	public int getEdad() {
		return edad;
	}
	

	public void setEdad(int edad) {
		this.edad = edad;
	}
	

	public String getHabitat() {
		return habitat;
	}
	

	public void setHabitad(String habitad) {
		this.habitat = habitad;
	}
	

	public String getGenero() {
		return genero;
	}
	

	public void setGenero(String genero) {
		this.genero = genero;
	}
	

	public Zona[] getZona() {
		return zona;
	}
	

	public void setZona(Zona[] zona) {
		this.zona = zona;
	}
	
}
