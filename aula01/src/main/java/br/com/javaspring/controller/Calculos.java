package br.com.javaspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Calculos {
	
	@GetMapping("/")
	public String home(Model model) {
		
		// PRIMEIRAS "" = VARIÁVEL, ASPAS POSTERIORES = MENSAGEM QUE SERÁ EXIBIDA.
		model.addAttribute("mensagem", "Mensagem vinda do Servidor!");
		
		// NOME DO ARQUIVO QUE SERÁ RENDERIZADO
		return "home";
	}
	
	@GetMapping("/soma")
	public String soma(ModelMap modelMap) {
		
		int v1 = 500;
		int v2 = 200;
		int soma = v1 + v2;
		
		// PRIMEIRAS "" = NOME DA VARIÁVEL PARA VIEW, DEPOIS A VARIÁVEL DO RESULTADO DA OPERAÇÃO.
		modelMap.addAttribute("soma", soma);	
		
		return "soma";
	}
	
	@GetMapping("/sub")
	public String sub(ModelMap modelMap) {
		
		int v1 = 500;
		int v2 = 200;
		int subtracao = v1 - v2;
		
		// PRIMEIRAS "" = NOME DA VARIÁVEL PARA VIEW, DEPOIS A VARIÁVEL DO RESULTADO DA OPERAÇÃO.
		modelMap.addAttribute("sub", subtracao);	
		
		return "sub";
	}
	
	@GetMapping("/div")
	public String div(ModelMap modelMap) {
		
		int v1 = 500;
		int v2 = 200;
		int divisao = v1 / v2;
		
		// PRIMEIRAS "" = NOME DA VARIÁVEL PARA VIEW, DEPOIS A VARIÁVEL DO RESULTADO DA OPERAÇÃO.
		modelMap.addAttribute("div", divisao);
		
		return "div";
	}
	
	@GetMapping("/mult")
	public String mult(ModelMap modelMap) {
		
		int v1 = 500;
		int v2 = 200;
		int multiplicacao = v1 * v2;
		
		// PRIMEIRAS "" = NOME DA VARIÁVEL PARA VIEW, DEPOIS A VARIÁVEL DO RESULTADO DA OPERAÇÃO.
		modelMap.addAttribute("mult", multiplicacao);
		
		return "mult";
	}
	

}
