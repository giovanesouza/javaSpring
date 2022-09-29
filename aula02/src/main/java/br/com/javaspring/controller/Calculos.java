package br.com.javaspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.javaspring.model.Calculadora;

@Controller
public class Calculos {

	@GetMapping("/")
	public String home(Model model) {
		

		// PRIMEIRAS "" = VARIÁVEL, ASPAS POSTERIORES = MENSAGEM QUE SERÁ EXIBIDA.
		model.addAttribute("mensagem", "Mensagem vinda do Servidor!");
		

		// NOME DO ARQUIVO QUE SERÁ RENDERIZADO
		return "home";
	}

	// CHAMADA DA PÁG SOMA
	@GetMapping("/soma")
	// O "FINAL" É UMA CONSTANTE
	public String adicao(final Model model) {
		model.addAttribute("calculadora", new Calculadora());
		return "soma";
	}

	// RECEBE OS DADOS DO FORM E REALIZA O CÁLCULO
	@PostMapping("/somar")
	public String resultAdic(@ModelAttribute Calculadora calculadora) {
		calculadora.somar();
		return "result";
	}

	
	// CHAMADA DA PÁG PARA SUBTRAÇÃO
	@GetMapping("/sub")
	// O "FINAL" É UMA CONSTANTE
	public String subtracao(final Model model) {
		model.addAttribute("calculadora", new Calculadora());
		return "sub";
	}

	// RECEBE OS DADOS DO FORM E REALIZA O CÁLCULO
	@PostMapping("/subtrair")
	public String resultSub(@ModelAttribute Calculadora calculadora) {
		calculadora.subtrair();
		return "result";
	}
	
	
	// CHAMADA DA PÁG PARA DIVISÃO
	@GetMapping("/div")
	// O "FINAL" É UMA CONSTANTE
	public String divisao(final Model model) {
		model.addAttribute("calculadora", new Calculadora());
		return "div";
	}

	// RECEBE OS DADOS DO FORM E REALIZA O CÁLCULO
	@PostMapping("/dividir")
	public String resultDiv(@ModelAttribute Calculadora calculadora) {
		calculadora.dividir();
		return "result";
	}
	
	
	// CHAMADA DA PÁG PARA DIVISÃO
	@GetMapping("/mult")
	// O "FINAL" É UMA CONSTANTE
	public String multiplicacao(final Model model) {
		model.addAttribute("calculadora", new Calculadora());
		return "mult";
	}

	// RECEBE OS DADOS DO FORM E REALIZA O CÁLCULO
	@PostMapping("/multiplicar")
	public String resultMult(@ModelAttribute Calculadora calculadora) {
		calculadora.multiplicar();
		return "result";
	}
	
	
	
}
