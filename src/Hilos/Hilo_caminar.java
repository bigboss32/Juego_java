package Hilos;
import java.util.Iterator;

import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class Hilo_caminar extends Thread{
	JLabel jPanel1= new JLabel();
	JLabel jPanel1e= new JLabel();
	
	
public Hilo_caminar(JLabel mover_h,JLabel mover_e) {
		
		this.jPanel1 = mover_h;
		this.jPanel1e= mover_e;
		
	}


@Override
	public void run() {

	jPanel1.setIcon(new ImageIcon("src/Sprite/camina_virgil.gif"));
	jPanel1e.setIcon(new ImageIcon("src/Sprite/caminar_nero.gif"));
	for (int i = 0; i < 85; i++) {
		jPanel1.setLocation(300-i+20, 174);
		jPanel1e.setLocation(90+i, 174);
		
		try {
			sleep(10);
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	jPanel1e.setIcon(new ImageIcon("src/Sprite/quieto_nero.gif"));
	jPanel1.setIcon(new ImageIcon("src/Sprite/quieto_virgil.gif"));
    }

}
