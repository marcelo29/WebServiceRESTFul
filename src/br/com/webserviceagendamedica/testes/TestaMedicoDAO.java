package br.com.webserviceagendamedica.testes;

import br.com.webserviceagendamedica.dao.MedicoDAO;

public class TestaMedicoDAO {

	public static void main(String[] args) {
		System.out.println(new MedicoDAO().listarTodos()); // ok
		System.out.println(new MedicoDAO().getInstance().buscarPorId(1)); // ok
	}

}