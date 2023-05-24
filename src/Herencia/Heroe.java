package Herencia;

import Interface.Ataque;

public class Heroe extends Personaje implements Ataque{
	private String habilidad;
	private int dano;
	public Heroe() {
		super();
	}
	public Heroe(int vida, String nombre, String habilidad, int dano) {
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
		return "Heroe [habilidad=" + habilidad + ", dano=" + dano + ", toString()=" + super.toString() + "]";
	}
	@Override
	public int Pelea_calculo_vida(int ataque_enemigo,int vida) {
		int vida_total=vida;
		vida_total=vida_total-ataque_enemigo;
		return vida_total;
		
	}
	@Override
	public void Pelea_calculo_vida() {
		// TODO Auto-generated method stub
		
	}
	

	
	

}
