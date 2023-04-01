package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assertions.*;

public class Test {

	@org.junit.jupiter.api.Test
	public void test_al_crear_un_coche_su_velocidad_es_cero_FMA(){
		Coche nuevoCoche = new Coche();
		Assertions.assertEquals(0, nuevoCoche.velocidad);
	}
	@org.junit.jupiter.api.Test
	public void test_al_acelerar_un_coche_su_velocidad_aumenta_FMA(){
		Coche nuevoCoche = new Coche();
		nuevoCoche.acelerarFMA(30);
		Assertions.assertEquals(30, nuevoCoche.velocidad);
	}
	@org.junit.jupiter.api.Test
	public void test_al_decelerar_un_coche_su_velocidad_disminuye_FMA(){
		Coche nuevoCoche = new Coche();
		nuevoCoche.velocidad=50;
		nuevoCoche.decelerarFMA(20);
		Assertions.assertEquals(30, nuevoCoche.velocidad);
	}
	@org.junit.jupiter.api.Test
	public void test_al_decelerar_un_coche_su_velocidad_no_puede_ser_menor_que_cero_FMA(){
		Coche nuevoCoche = new Coche();
		nuevoCoche.velocidad=50;
		nuevoCoche.decelerarFMA(80);
		Assertions.assertEquals(0, nuevoCoche.velocidad);
	}

}
