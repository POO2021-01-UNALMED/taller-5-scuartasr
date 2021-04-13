package zooAnimales;
import java.util.Vector;
import gestion.Zona;

public class Reptil extends Animal {
	// ===========================================================
	// Atributos
	private static Vector<Reptil> listado = new Vector<>();
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	// ===========================================================
	// Constructor
	public Reptil(int totalAnimales, String nombre, int edad, String habitad, String genero, Zona[] zona,
			Vector<Reptil> listado, int iguanas, int serpientes, String colorEscamas, int largoCola) {
		super(totalAnimales, nombre, edad, habitad, genero, zona);
	}
	
	public Reptil(String nombre, int edad, String habitad, String genero,
			String colorEscamas, int largoCola) {
		super.setTotalAnimales(super.getTotalAnimales()+1);
		super.setNombre(nombre);
		super.setEdad(edad);
		super.setHabitat(habitad);
		super.setGenero(genero);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		listado.add(this);
	}
	
	public Reptil() {
		// Vacío
	}
	
	// ===========================================================
	// Métodos principales
	
	public int cantidadReptiles() {
		return listado.size();
	}
	
	public String movimiento() {
		return "reptar";
	}
	
	public static Reptil crearIguana(String nombre, int edad, String genero) {
		iguanas++;
		return new Reptil(nombre, edad, "humedal", genero, "verde", 3);
	}
	
	public static Reptil crearSerpiente(String nombre, int edad, String genero) {
		serpientes++;
		return new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
	}

	// ===========================================================
	// Getters y setters
	public static Vector<Reptil> getListado() {
		return listado;
	}

	public void setListado(Vector<Reptil> listado) {
		Reptil.listado = listado;
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
