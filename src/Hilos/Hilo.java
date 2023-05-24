package Hilos;



public class Hilo  extends Thread{
	 
	    
	    public void run() {
	    	Musica muc= new Musica();
			muc.musicafondo();
	    }
	    
	}

