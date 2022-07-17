package com.github.lucasdevrj.fahsius.conversor;

import java.util.Scanner;

public class ConversorTemperatura {

	private double temperatura;
	
	Scanner entrada = new Scanner(System.in);
	
	public void exibeMensagem() {
		System.out.println("Seja bem-vindo ao conversor Fahsius");
		escolhaTemperatura();
	}
	
	public void escolhaTemperatura() {
		System.out.println("----------|Convers�es|----------");
		System.out.println("1 - Fahrenheit para Celsius.");
		System.out.println("2 - Fahrenheit para Kelvin.");
		System.out.println("3 - Celsius para Fahrenheit.");
		System.out.println("4 - Celsius para Kelvin.");
		System.out.println("5 - Kelvin para Fahrenheit.");
		System.out.println("6 - Kelvin para Celsius.");
		System.out.println("-------------------------------");
		
		System.out.print("Digite sua op��o desejada: ");
		int opcao = entrada.nextInt();
		
		switch (opcao) {
			case 1:
				converteFahrenheitParaCelsius();
			break;
		}
	}

	public void converteFahrenheitParaCelsius() {
		System.out.print("\nDigite o valor em Fahrenheit: ");
		this.temperatura = entrada.nextDouble();
		
		double conversao = (this.temperatura - 32.0) * 5 / 9;
		System.out.println("O valor convertido de Fahrenheit para Celsius � " + String.format("%.2f", conversao) + "�C");
	}

	public double getTemperatura() {
		return temperatura;
	}
}
