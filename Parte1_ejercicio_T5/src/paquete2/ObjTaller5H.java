package paquete2;

import paquete1.Auto;

public class ObjTaller5H {
	public static void main(String[] args) {
		Moto moto = new Moto("XYZ123", "2019");
		Bus bus = new Bus("ABC345", 20);
		Auto auto = new Auto();
		moto.adelantar();
		bus.arrancar();
		bus.pitar();
		System.out.println("La velocidad de la moto es: " + moto.getVelocidad() + " [unds. de velocidad]");
		System.out.println("______\n==== ENSAYOS ====");
		System.out.println("\n== Punto uno ==");
		System.out.println("Para la moto:");
		moto.pitar(); // Arreglar para agregar
		System.out.println("Para un auto:");
		auto.pitar();
		System.out.println("\n== Parte dos ==\nLa subclase 'Motoneta' no "
				+ "puede ser creada ya que esta es final.");
		
		System.out.println("\n== Parte tres ==");
		moto.arrancar();
		
		System.out.println("\n== Parte cinco == ");
		System.out.println(Auto.getNum_Autor());
		
		System.out.println("\n== Parte diez ==");
		System.out.println("Para la moto:");
		System.out.println(moto);
		System.out.println("Para el bus:");
		System.out.println(bus);
	}
}
