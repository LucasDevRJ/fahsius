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
		System.out.println("\n----------|Conversões|----------");
		System.out.println("1 - Fahrenheit para Celsius.");
		System.out.println("2 - Fahrenheit para Kelvin.");
		System.out.println("3 - Celsius para Fahrenheit.");
		System.out.println("4 - Celsius para Kelvin.");
		System.out.println("5 - Kelvin para Fahrenheit.");
		System.out.println("6 - Kelvin para Celsius.");
		System.out.println("7 - Sair.");
		System.out.println("-------------------------------");
		
		System.out.print("Digite sua opção desejada: ");
		int opcao = entrada.nextInt();
		
		switch (opcao) {
			case 1:
				converteFahrenheitParaCelsius();
			break;
			
			case 2:
				converteFahrenheitParaKelvin();
			break;
			
			case 3:
				converteCelsiusParaFahrenheit();
			break;
			
			case 4:
				converteCelsiusParaKelvin();
			break;
			
			case 5:
				converteKelvinParaFahreinheit();
			break;
			
			case 7:
				finalizarPrograma();
			break;
		}
	}

	public void converteFahrenheitParaCelsius() {
		System.out.println("\n----------|Fahrenheit para Celsius|----------");
		System.out.print("Digite o valor em Fahrenheit: ");
		this.temperatura = entrada.nextDouble();
		
		double conversao = (this.temperatura - 32.0) * 5 / 9;
		System.out.println("O valor convertido de Fahrenheit para Celsius é " + String.format("%.2f", conversao) + "°C");
		System.out.println("---------------------------------------------");
		
		System.out.println("\nDeseja fazer uma nova conversão?");
		System.out.println("Opção 1 - Sim.");
		System.out.println("Opção 2 - Não.");
		System.out.print("Digite sua opção: ");
		int opcao = entrada.nextInt();
		
		if (opcao == 1) {
			escolhaTemperatura();
		} else if (opcao == 2) {
			finalizarPrograma();
		} else {
			System.out.println("Opção inválida!");
			converteFahrenheitParaCelsius();
		}
	}
	
	public void converteFahrenheitParaKelvin() {
		System.out.println("\n----------|Fahrenheit para Kelvin|----------");
		System.out.print("Digite o valor em Fahrenheit: ");
		this.temperatura = entrada.nextDouble();
		
		double conversao = (this.temperatura - 32.0) * 5 / 9 + 273.15;
		System.out.println("O valor convertido de Fahrenheit para Kelvin é " + String.format("%.2f", conversao) + "K");
		System.out.println("---------------------------------------------");
		
		System.out.println("\nDeseja fazer uma nova conversão?");
		System.out.println("Opção 1 - Sim.");
		System.out.println("Opção 2 - Não.");
		System.out.print("Digite sua opção: ");
		int opcao = entrada.nextInt();
		
		if (opcao == 1) {
			escolhaTemperatura();
		} else if (opcao == 2) {
			finalizarPrograma();
		} else {
			System.out.println("Opção inválida!");
			converteFahrenheitParaCelsius();
		}
	}
	
	public void converteCelsiusParaFahrenheit() {
		System.out.println("\n----------|Celsius para Fahrenheit|----------");
		System.out.print("Digite o valor em Celsius: ");
		this.temperatura = entrada.nextDouble();
		
		double conversao = (this.temperatura * 9 / 5) + 32.0;
		System.out.println("O valor convertido de Celsius para Fahrenheit é " + String.format("%.2f", conversao) + "°F");
		System.out.println("---------------------------------------------");
		
		System.out.println("\nDeseja fazer uma nova conversão?");
		System.out.println("Opção 1 - Sim.");
		System.out.println("Opção 2 - Não.");
		System.out.print("Digite sua opção: ");
		int opcao = entrada.nextInt();
		
		if (opcao == 1) {
			escolhaTemperatura();
		} else if (opcao == 2) {
			finalizarPrograma();
		} else {
			System.out.println("Opção inválida!");
			converteFahrenheitParaCelsius();
		}
	}
	
	public void converteCelsiusParaKelvin() {
		System.out.println("\n----------|Celsius para Kelvin|----------");
		System.out.print("Digite o valor em Celsius: ");
		this.temperatura = entrada.nextDouble();
		
		double conversao = this.temperatura + 273.15;
		System.out.println("O valor convertido de Celsius para Kelvin é " + String.format("%.2f", conversao) + "K");
		System.out.println("---------------------------------------------");
		
		System.out.println("\nDeseja fazer uma nova conversão?");
		System.out.println("Opção 1 - Sim.");
		System.out.println("Opção 2 - Não.");
		System.out.print("Digite sua opção: ");
		int opcao = entrada.nextInt();
		
		if (opcao == 1) {
			escolhaTemperatura();
		} else if (opcao == 2) {
			finalizarPrograma();
		} else {
			System.out.println("Opção inválida!");
			converteFahrenheitParaCelsius();
		}
	}
	
	public void converteKelvinParaFahreinheit() {
		System.out.println("\n----------|Kelvin para Fahrenheit|----------");
		System.out.print("Digite o valor em Kelvin: ");
		this.temperatura = entrada.nextDouble();
		
		double conversao = (this.temperatura - 273.15) * 9 / 5 + 32.0;
		System.out.println("O valor convertido de Kelvin para Fahrenheit é " + String.format("%.2f", conversao) + "K");
		System.out.println("---------------------------------------------");
		
		System.out.println("\nDeseja fazer uma nova conversão?");
		System.out.println("Opção 1 - Sim.");
		System.out.println("Opção 2 - Não.");
		System.out.print("Digite sua opção: ");
		int opcao = entrada.nextInt();
		
		if (opcao == 1) {
			escolhaTemperatura();
		} else if (opcao == 2) {
			finalizarPrograma();
		} else {
			System.out.println("Opção inválida!");
			converteFahrenheitParaCelsius();
		}
	}
	
	public void finalizarPrograma() {
		System.out.println("Programa finalizado!");
	}

	public double getTemperatura() {
		return temperatura;
	}
}
