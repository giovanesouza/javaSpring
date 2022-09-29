package br.com.aula01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	//(CTRL + SHIFT + O => IMPORTA A CLASSE)
	// GETMAPPING FAZ O MAPEAMENTO DA RODA E
	// O QUE ESTÁ ENTRE PARÊNTESES É O CAMINHO DA ROTA 
	
	@GetMapping("/")
	public String mensagem() {
		
		// "msg" É O NOME DO ARQUIVO QUE SERÁ BUSCADO
		return "msg";
		
	}

}
