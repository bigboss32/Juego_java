package Herencia;

public class Personaje {
	private int vida;

	private String nombre;

	public Personaje() {
		super();
	}

	public Personaje(int vida, String nombre) {
		super();
		this.vida = vida;

		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Personaje [vida=" + vida + ","+ ", nombre=" + nombre + "]";
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	

}
