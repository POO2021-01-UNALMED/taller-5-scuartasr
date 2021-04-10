package paquete2;

import paquete1.Auto;

final class Moto extends Auto {
	private String placa;
	private String modelo;
	public int velocidad = 30;

	public Moto(String placa, String modelo) {
		this.placa = placa;
		this.modelo = modelo;
		super.pitar = "Las motos no pitan"; // Agregado
		this.pitar();
		this.arrancar();
	}

	public void acelerar() {
		System.out.println("Avanzo muy rapido");
	}
	
	@Override
	public String toString() {
		return "La moto con placa " + this.placa + " es modelo " + this.modelo + ".";
	}
}