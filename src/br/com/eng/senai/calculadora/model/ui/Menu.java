package br.com.eng.senai.calculadora.model.ui;
import java.util.Scanner;

import br.com.eng.senai.calculadora.dao.QuadradoDao;
import br.com.eng.senai.calculadora.dao.TrapezioDao;

public class Menu {

	public static void mostrarMenu() {
		
		System.out.println("--------------------");
		System.out.println("CALCULADORA DE POLÍGONOS");
		System.out.println("--------------------");
		System.out.println("1 - Quadrado");
		System.out.println("2 - Retângulo");
		System.out.println("3 - Trapézio");
		System.out.println("4 - Circunferência");
		System.out.println("5 - Triângulo");
		System.out.println("6 - Sair");
		System.out.println("--------------------");
		System.out.print("Escolha uma opção (1 - 5): ");
		
		Scanner leitor = new Scanner(System.in);
		
		int opcao = leitor.nextInt();
		
		if (opcao == 1) {
			QuadradoDao.criarQuadrado();
		} else if(opcao == 3) {
			TrapezioDao.criarTrapezio();
		} else {
			System.out.println("Esta opção ainda não foi implementada");
		}
		
		
	}
	
	
}
