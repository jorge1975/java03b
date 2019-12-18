package com.senati.figuras;

public class Figuras {
	public static int contador = 0;
	public static double PI=3.141582;
	
	public final double PI1 = 3.141582;
	
	public static double area_circulo(double radio) {
		contador = contador +1;
		return PI * radio * radio;
	}
	
	public double area_circulo1 (double radio) {
		contador++;
		return PI1 * radio * radio;
	}
}
