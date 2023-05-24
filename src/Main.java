import java.awt.EventQueue;

public class Main {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();

				
				
					frame.h3.start();
					frame.hi.start();
					frame.h4.start();
					frame.h4.suspend();
					

					frame.setVisible(true);
					frame. setLocationRelativeTo(null);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
