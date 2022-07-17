package com.github.lucasdevrj.fahsius.principal;

import java.util.Locale;

import com.github.lucasdevrj.fahsius.conversor.ConversorTemperatura;

public class Principal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		ConversorTemperatura ct = new ConversorTemperatura();
		ct.exibeMensagem();
	}
}
