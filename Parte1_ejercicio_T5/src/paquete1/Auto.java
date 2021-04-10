package paquete1;

public class Auto {

	protected static int num_autos = 0;
	public int velocidad = 10;
	public String pitar = "Piiiiii";

	public Auto() {
		num_autos++;
	}
	
	public static int getNum_Autor() {
		return num_autos;
	}

	public void adelantar() {
		System.out.println("Puedo adelantar autos");
	}

	public final void pitar() {
		System.out.println(this.pitar);
	}

	final public void arrancar() {
		System.out.println("Encendido");
	}

	public void acelerar() {
		System.out.println("Avanzo constantemente");
	}

	public void frenar() {
		System.out.println("Me detengo");
	}

	public int getVelocidad() {
		return (this.velocidad);
	}
}