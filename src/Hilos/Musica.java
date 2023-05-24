package Hilos;


import java.io.File;
import java.io.FileInputStream;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import javazoom.jl.player.Player;

public class Musica {

	public void musicafondo() {

		try {

			Player rep = new Player(new FileInputStream("src/Musica/fondo_musica.mp3"));
			rep.play();

		} catch (Exception e) {
			System.err.println(e);
		}
	}
	
	public void musicaatque() {

		try {

			Player rep = new Player(new FileInputStream("src/Musica/Ataque.mp3"));
			rep.play();

		} catch (Exception e) {
			System.err.println(e);
		}
	}
}