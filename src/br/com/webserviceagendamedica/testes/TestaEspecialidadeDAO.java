package br.com.webserviceagendamedica.testes;

import br.com.webserviceagendamedica.dao.EspecialidadeDAO;

public class TestaEspecialidadeDAO {

	public static void main(String[] args) {
		System.out.println(new EspecialidadeDAO().getInstance().listarTodos()); // ok
		System.out.println(new EspecialidadeDAO().getInstance().buscarPorId(1)); // ok
	}
}