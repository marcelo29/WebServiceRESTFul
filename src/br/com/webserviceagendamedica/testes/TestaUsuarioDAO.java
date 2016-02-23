package br.com.webserviceagendamedica.testes;

import br.com.webserviceagendamedica.dao.UsuarioDAO;

public class TestaUsuarioDAO {

	public static void main(String[] args) {
		System.out.println(new UsuarioDAO().getInstance().listarTodos()); // ok
		System.out.println(new UsuarioDAO().getInstance().buscarPorId(1)); // ok
	}

}