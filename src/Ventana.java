import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Label;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JSlider;
import java.awt.event.ActionListener;
import java.awt.geom.AffineTransform;
import java.awt.event.ActionEvent;
import Hilos.Hilo;
import Hilos.Hilo_ataque;
import Hilos.Hilo_caminar;
import Hilos.Hilo_musica_ataque;
import Generar_personaje.Generar_personaje;
import Herencia.Enemigo;
import Herencia.Heroe;
import Herencia.Personaje;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;

public class Ventana extends JFrame {

	private JPanel contentPane;
	static JLabel Heore = new JLabel("");
	static JLabel Enemigo = new JLabel("");
	static Hilo hi = new Hilo();
	Hilo_ataque h2;
	static Hilo_caminar h3 = new Hilo_caminar(Heore,Enemigo);

	static Hilo_musica_ataque h4= new Hilo_musica_ataque();
	static Generar_personaje personaje = new Generar_personaje();
	Personaje personajes[] = new Personaje[2];
	JProgressBar Barra_vida_enemigo = new JProgressBar();
	JProgressBar Barra_jugador = new JProgressBar();

	public Ventana() {
		Heroe personaje_h = personaje.Generar_heroe("miguel");
		Enemigo personaje_E = personaje.Generar_enemigo();
		JButton btnNewButton_1 = new JButton("Caminar");
		
		personajes[0] = personaje_h;
		personajes[1] = personaje_E;
		JOptionPane.showMessageDialog(null, personaje_E + "\n" + personaje_h);
		

		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 515, 325);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		Enemigo.setHorizontalAlignment(SwingConstants.LEFT);
		
		
		Enemigo.setForeground(Color.WHITE);
		Enemigo.setBounds(10, 158, 191, 128);
		Enemigo.setTransferHandler(getTransferHandler());
		contentPane.add(Enemigo);
		JButton btnNewButton = new JButton("Atacar");
		btnNewButton.setBounds(419, 180, 89, 23);
		contentPane.add(btnNewButton);
		
		

		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (btnNewButton == e.getSource())
					h2 = new Hilo_ataque(Heore,Enemigo,h4,hi,Barra_vida_enemigo,Barra_jugador,personaje_h,personaje_E);
				 System.out.println(personaje_h.toString());
			
					h4.resume();
					hi.suspend();
					h3.resume();
					h2.start();
					
					

			}
		});
		Barra_vida_enemigo.setOrientation(SwingConstants.VERTICAL);
		
		Barra_vida_enemigo.setForeground(new Color(255, 0, 0));
		Barra_vida_enemigo.setValue(personajes[1].getVida());
		Barra_vida_enemigo.setToolTipText("Vida");
		Barra_vida_enemigo.setBounds(10, 11, 17, 128);
		contentPane.add(Barra_vida_enemigo);
		Barra_jugador.setOrientation(SwingConstants.VERTICAL);
		
		
		Barra_jugador.setValue(100);
		Barra_jugador.setBounds(463, 11, 17, 128);
		contentPane.add(Barra_jugador);
		
		btnNewButton_1.setBounds(419, 214, 89, 23);
		contentPane.add(btnNewButton_1);

		Heore.setIcon(new ImageIcon(Ventana.class.getResource("/Sprite/camina_virgil.gif")));
		Heore.setForeground(Color.WHITE);
		Heore.setBounds(289, 158, 191, 128);
		contentPane.add(Heore);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Ventana.class.getResource("/Sprite/fondo - copia.gif")));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(0, 0, 508, 286);
		contentPane.add(lblNewLabel_1);
		
		

		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btnNewButton_1 == e.getSource())
					h2.suspend();
					hi.resume();
					h4.suspend();
					
	
					Heore.setForeground(Color.WHITE);
					Barra_vida_enemigo.setValue(25);

			}
		});
	

	}
}
