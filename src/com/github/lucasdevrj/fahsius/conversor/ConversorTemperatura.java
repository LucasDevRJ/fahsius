package com.github.lucasdevrj.fahsius.conversor;

import java.util.Scanner;

public class ConversorTemperatura {

	private double temperatura;
	
	Scanner entrada = new Scanner(System.in);
	
	public void exibeMensagem() {
		System.out.println("Seja bem-vindo ao conversor Fahsius");
		escolhaTemperatura();
	}
	
	private void escolhaTemperatura() {
		System.out.println("----------|Conversões|----------");
		System.out.println("1 - Fahrenheit para Celsius");
		System.out.println("2 - Celsius para Fahrenheit");
	}

	public double getTemperatura() {
		return temperatura;
	}
}
