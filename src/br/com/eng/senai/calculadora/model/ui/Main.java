package br.com.eng.senai.calculadora.model.ui;

//import br.com.engsenai.calculadora_poligonos.ui.Menu;

public class Main {
	
	public static void main (String[] args) {
	
		double contador = 2;
		while(contador <= 100) {
			System.out.println("Senai - " + contador);
			contador = Math.pow(contador, 3);
		}
		
//		Menu.mostrarMenu();
//		
//		System.out.println("Encerrando o programa.	 Au revoir Shosanna!");
	}
	
	public static void escrever(String nome) {
		System.out.println(nome);
	}
}
