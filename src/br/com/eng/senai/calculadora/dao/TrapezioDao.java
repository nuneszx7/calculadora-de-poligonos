package br.com.eng.senai.calculadora.dao;

import java.util.Scanner;

import br.com.eng.senai.calculadora.model.Trapezio;

public class TrapezioDao {
	
	public static void criarTrapezio() {
		Trapezio trapezio  = new Trapezio();
		
		//Cria um objeto scanner
		Scanner leitor = new Scanner(System.in);
		
		System.out.println();
		System.out.println("Criando um objeto trapézio...");
		
		System.out.print("Informe a base MAIOR ");
		trapezio.setBaseMaior(leitor.nextDouble());
		
		System.out.print("Informe a base MENOR ");
		trapezio.setBaseMenor(leitor.nextDouble());
		
		System.out.print("Informe ALTURA ");
		trapezio.setAltura(leitor.nextDouble());
		
		trapezio.resultado();
		
		//fecha um objeto scanner
		leitor.close();
	}
	
}
