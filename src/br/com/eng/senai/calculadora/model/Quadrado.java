package br.com.eng.senai.calculadora.model;

public class Quadrado {
	private double lado;
	private double area;
	private double perimetro;
	
	public void setLado(double lado) {
		if(lado > 0) {
			this.lado = lado;
		} else {
			System.out.println("O lado precisa ser um valor maior do que zero.");
		}
	}
	
	private double calcularArea() {
		area = Math.pow(lado, 2);
		return area;
	}
	
	private double calcularPerimetro() {
		perimetro = 4 * lado;
		return perimetro;
	}
	
	public void resultado() {
		System.out.println("==================");
		System.out.println("DADOS DO QUADRADO");
		System.out.println("==================");
		System.out.println("BASE/ALTURA: " + lado);
		System.out.println("ÁREA: " + String.format("%.2f", calcularArea()));
		System.out.println("PERÍMETRO: " + String.format("%.2f", calcularPerimetro()));
		System.out.println("==================");
	}

		// TODO Auto-generated method stub
		
	}


