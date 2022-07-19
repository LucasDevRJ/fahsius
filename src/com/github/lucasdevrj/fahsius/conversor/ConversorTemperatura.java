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
			
			case 2:
				converteFahrenheitParaKelvin();
			break;
		}
	}

	public void converteFahrenheitParaCelsius() {
		System.out.println("\n----------|Fahrenheit para Celsius|----------");
		System.out.print("Digite o valor em Fahrenheit: ");
		this.temperatura = entrada.nextDouble();
		
		double conversao = (this.temperatura - 32.0) * 5 / 9;
		System.out.println("O valor convertido de Fahrenheit para Celsius � " + String.format("%.2f", conversao) + "�C");
		System.out.println("---------------------------------------------");
		System.out.println("Deseja fazer uma nova convers�o?");
		System.out.println("Op��o 1 - Sim.");
		System.out.println("Op��o 2 - N�o.");
		System.out.print("Digite sua op��o: ");
		int opcao = entrada.nextInt();
		
		if (opcao == 1) {
			escolhaTemperatura();
		} else if (opcao == 2) {
			//chamar o m�todo de Sair.
		}
	}
	
	public void converteFahrenheitParaKelvin() {
		System.out.println("\n----------|Fahrenheit para Kelvin|----------");
		System.out.print("Digite o valor em Fahrenheit: ");
		this.temperatura = entrada.nextDouble();
		
		double conversao = (this.temperatura - 32.0) * 5 / 9 + 273.15;
		System.out.println("O valor convertido de Fahrenheit para Kelvin � " + String.format("%.2f", conversao) + "K");
		System.out.println("---------------------------------------------");
	}

	public double getTemperatura() {
		return temperatura;
	}
}
