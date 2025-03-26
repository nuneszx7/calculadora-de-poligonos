package br.com.eng.senai.calculadora.dao;

import java.util.Scanner;

import br.com.eng.senai.calculadora.model.Quadrado;
import br.com.eng.senai.calculadora.model.ui.Menu;

public class QuadradoDao {
	
	public static void criarQuadrado() {
		Quadrado quadrado = new Quadrado ();
		
		System.out.println();
		System.out.println("Criando um objeto quadrado...");
		System.out.print("Qual o lado do quadrado? ");
		
		//Criar um objeto scanner
		Scanner leitor = new Scanner(System.in);
		
		quadrado.setLado(leitor.nextDouble());
		
		quadrado.resultado();
		
		//Fechar um objeto scanner (remover da memória)
		
		Menu.continuar(leitor, "Pedro");
		
	}
	
}
