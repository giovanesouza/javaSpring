package br.com.javaspring.model;

public class Calculadora {

	private double resultado;
	private double valor1;
	private double valor2;

	public double getValor1() {
		return valor1;
	}

	public void setValor1(double valor1) {
		this.valor1 = valor1;
	}

	public double getValor2() {
		return valor2;
	}

	public void setValor2(double valor2) {
		this.valor2 = valor2;
	}

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

	
	// OPERAÇÕES
	public double somar() {
		resultado = valor1 + valor2;
		return resultado;
	}

	public double subtrair() {
		this.resultado = valor1 - valor2;
		return this.resultado;
	}

	public double dividir() {
		this.resultado = valor1 / valor2;
		return this.resultado;
	}

	public double multiplicar() {
		this.resultado = valor1 * valor2;
		return this.resultado;
	}

}