package test;

public class Coche {

	public int velocidad;

	public void acelerarFMA(int aceleracion) {
		velocidad+=aceleracion;	
	}

	public void decelerarFMA(int deceleracion) {
		velocidad-=deceleracion;
		if(velocidad<0) velocidad=0;
	}

}
