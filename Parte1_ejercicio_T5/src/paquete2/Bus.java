package paquete2;

import paquete1.Auto;

public class Bus extends Auto {

	private String placa;
	private int capacidad;
	public int velocidad = 20;

	public Bus(String placa, int capacidad) {
		this.placa = placa;
		this.capacidad = capacidad;
	}

	public void acelerar() {
		System.out.println("Avanzo lento");
	}
	
	@Override
	public String toString() {
		return "El bus con placa " + this.placa + " posee una capacidad de " + this.capacidad + ".";
	}
}