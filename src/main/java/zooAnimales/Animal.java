package zooAnimales;
import gestion.Zona;

public class Animal {
	// ===========================================================
	// Atributos
	private static int totalAnimales; // Chequear que s� sea est�tica
	private String nombre;
	private int edad;
	private String habitad;
	private String genero;
	private Zona zona[];
	
	// ===========================================================
	// Constructor
	public Animal(int totalAnimales, String nombre, int edad, String habitad, String genero, Zona[] zona) {
		this.totalAnimales = totalAnimales;
		this.nombre = nombre;
		this.edad = edad;
		this.habitad = habitad;
		this.genero = genero;
		this.zona = zona;
	}
	
	// ===========================================================
	// M�todos	
	public void movimiento() {
		// c�digo del m�todo
	}
	
	public void totalPorTipo() {
		// c�digo del m�todo 
	}
	
	public String toString() {
		return "ESCRIBIR EL C�DIGO";
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
	

	public String getHabitad() {
		return habitad;
	}
	

	public void setHabitad(String habitad) {
		this.habitad = habitad;
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
