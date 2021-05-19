package com.algaworks.algalog.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.algawoks.algalog.domain.model.Cliente;
import com.algaworks.algalog.domain.repository.ClienteRepository;

@RestController
public class ClienteController {

	@Autowired
	private ClienteRepository clienteRepository; 
	
	@GetMapping("/clientes")
	@ResponseStatus(code = HttpStatus.CREATED)
	public List<Cliente> listar() {
		Cliente cliente1 = new Cliente();
		cliente1.setNome("João");
		cliente1.setTelefone("13 99999-8888");
		cliente1.setEmail("joaodascouves@alorks.com");
		
		Cliente cliente2 = new Cliente();
		cliente2.setNome("Maria");
		cliente2.setTelefone("13 88888-8888");
		cliente2.setEmail("mariadasilva@alorks.com");
		
		return Arrays.asList(cliente1, cliente2);
		
	}
}
