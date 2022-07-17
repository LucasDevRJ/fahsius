package com.github.lucasdevrj.fahsius.conversor;

public class ConversorTemperatura {

	private double temperatura;
	
	public void exibeMensagem() {
		System.out.println("Seja bem-vindo ao conversor Fahsius");
		escolhaTemperatura();
	}
	
	private void escolhaTemperatura() {
		System.out.println("----------|Conversões|----------");
		System.out.println("1 - Fahrenheit para Celsius.");
		System.out.println("2 - Fahrenheit para Kelvin.");
		System.out.println("3 - Celsius para Fahrenheit.");
		System.out.println("4 - Celsius para Kelvin.");
		System.out.println("5 - Kelvin para Fahrenheit.");
		System.out.println("6 - Kelvin para Celsius.");
	}

	public double getTemperatura() {
		return temperatura;
	}
}
