package com.senati.figuras;

public class AppFiguras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radio = 4;
		double area = Figuras.area_circulo(radio);
		System.out.println("\n Radio : " + radio);
		System.out.println("\n El area es : " + area);
		
		radio = 3;
		Figuras Of = new Figuras();
		area = Of.area_circulo1(radio);
		System.out.println("\n Radio : " + radio);
		System.out.println("\n El area es : " + area);
		System.out.println("Contador de objetos :" + Figuras.contador);
		
		radio = 6;
		Figuras Of1 = new Figuras();
		area = Of1.area_circulo1(radio);
		System.out.println("\n Radio : " + radio);
		System.out.println("\n El area es : " + area);
		System.out.println("Contador de objetos :" + Figuras.contador);
	}

}
