package Hilos;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

import Herencia.Enemigo;
import Herencia.Heroe;



public class Hilo_ataque extends Thread{
	
	
	JLabel jPanel1= new JLabel();
	JLabel jPanel1dos= new JLabel();
	Hilo_musica_ataque hilo= new Hilo_musica_ataque();
	Hilo hilodos= new Hilo();
	JProgressBar Vida_enemigo = new JProgressBar();
	JProgressBar Vida_heore = new JProgressBar();
	Heroe personaje_h;
	Enemigo personaje_e;
	
	
	

public Hilo_ataque(JLabel jPanel1,JLabel jPanel1dos, Hilo_musica_ataque hilo, Hilo hilodos, JProgressBar Vida_enemigo,JProgressBar Vida_heore,
			Heroe personaje_h, Enemigo personaje_e) {
		super();
		this.jPanel1 = jPanel1;
		this.hilo = hilo;
		this.hilodos = hilodos;
		this.Vida_enemigo = Vida_enemigo;
		this.Vida_heore=Vida_heore;
		this.personaje_h = personaje_h;
		this.personaje_e = personaje_e;
		this.jPanel1dos=jPanel1dos;
	}




@Override
	  public void run() {
			if (personaje_h.getVida()<0) {
				JOptionPane.showMessageDialog(null, "gana el enemigo");
				 System.exit(0);
				
			}else {
				if (personaje_e.getVida()<=0) {
					JOptionPane.showMessageDialog(null, "gana el jugador");
					 System.exit(0);
			
				}else {
					
					jPanel1.setIcon(new ImageIcon("src/Sprite/ataque_virgil.gif"));
					jPanel1dos.setIcon(new ImageIcon("src/Sprite/Dano_nero.gif"));
					
					
					try {
						sleep(1000);
						
						System.out.println(personaje_e.getVida());
						personaje_e.setVida(
								personaje_e.Pelea_calculo_vida(personaje_e.getVida(), personaje_h.getDano() ));
						System.out.println(personaje_e.getVida());
						
						
						
						Vida_enemigo.setValue(personaje_e.getVida());
						sleep(1000);
						jPanel1dos.setIcon(new ImageIcon("src/Sprite/ataque_nero.gif"));
						jPanel1.setIcon(new ImageIcon("src/Sprite/dano_virgil.gif"));
						System.out.println(personaje_h.getVida());
						personaje_h.setVida(
								personaje_h.Pelea_calculo_vida(personaje_e.getDano(), personaje_h.getVida() ));
						System.out.println(personaje_h.getVida());
						
						
						
						
						
						
						
						sleep(1000);
						jPanel1dos.setIcon(new ImageIcon("src/Sprite/quieto_nero.gif"));
						jPanel1.setIcon(new ImageIcon("src/Sprite/quieto_virgil.gif"));
						Vida_heore.setValue(personaje_h.getVida());
						
						hilo.suspend();
						hilodos.resume();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
			}
			
	    	
		
	    }
}
