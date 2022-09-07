package ar.edu.unlam.pb1.trabajoPractico01;

public class Circulo {
	final static double PI=3.14;

	public static void main(String[] args) {
		
		double radio =0.0, perimetro= 0.0,area= 0.0;
		//Calcular el area de un circulo con radio 2
		
		radio= 2.0;
		area= calcularElArea(radio);
		
		//Calcular el perimetro de un circulo con radio 2
		
		perimetro = calcularElPerimetro(radio);
		
		//Mostrar los resultados
		
		System.out.println("Area: "+area);
		System.out.println("Perimetro: "+ perimetro);
		
		//Calcular el area de un circulo con radio 10
		
		radio = 10.0;
		area = calcularElArea(radio);
		//Mostrar los resultados
		
		System.out.println("Area: "+area);
		
	}
	
	public static double calcularElArea(double radio){
		double area = 0.0;
		area = radio*PI;
		return area;
		
	}
	public static double calcularElPerimetro(double radio){
		double perimetro = 0.0;
		perimetro = (2*PI)*radio;
		return perimetro;
	}
	

}
