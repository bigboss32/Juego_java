package Generar_personaje;

import Herencia.Enemigo;
import Herencia.Heroe;

public class Generar_personaje {
public Heroe Generar_heroe(String nombre) {
	int vida= 100;
	int dano=(int) (Math.random() * 30) + 1;
	Heroe heroe = new Heroe(vida, nombre,"dame tu fuerza pegasus", dano);
	return heroe;
}
public Enemigo Generar_enemigo() {
	int vida= 100;
	int dano=(int) (Math.random() * 30) + 1;
	Enemigo Enemigo = new Enemigo(vida,"oscar patiño","toma uno",dano);
	return Enemigo;
}
}
