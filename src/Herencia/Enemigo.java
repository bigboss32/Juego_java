package Herencia;

import Interface.Ataque;

public class Enemigo extends Personaje implements Ataque{
	private String habilidad;
	private int dano=50;
	
	

	public Enemigo() {
		super();
	}







	public Enemigo(int vida, String nombre, String habilidad, int dano) {
		super(vida, nombre);
		this.habilidad = habilidad;
		this.dano = dano;
	}







	public String getHabilidad() {
		return habilidad;
	}



	public void setHabilidad(String habilidad) {
		this.habilidad = habilidad;
	}



	public int getDano() {
		return dano;
	}



	public void setDano(int dano) {
		this.dano = dano;
	}



	@Override
	public String toString() {
		return "Enemigo [habilidad=" + habilidad + ", dano=" + dano + ", getVida()=" + getVida() + ", getNombre()="
				+ getNombre() + "]";
	}



	@Override
	public void Pelea_calculo_vida() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public int Pelea_calculo_vida(int vida, int ataquealiado) {
		int vida_total=vida;
		vida_total=vida_total-ataquealiado;
		return vida_total;
		
	}
	
	
	
	
}
