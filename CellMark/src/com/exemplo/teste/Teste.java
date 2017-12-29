package com.exemplo.teste;

import java.util.List;
import com.exemplo.entidade.Cliente;
import com.exemplo.repositorio.RepositorioCliente;

@SuppressWarnings("unused")
public class Teste {

	public static void main(String[] args) {
		RepositorioCliente repositorioCliente = new RepositorioCliente();
		Cliente cliente = new Cliente();
		cliente.setNome("Luiza");
		cliente.setIdade(19);
		
		repositorioCliente.salvar(cliente);
	}

}
