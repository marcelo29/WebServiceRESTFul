package br.com.webserviceagendamedica.testes;

import br.com.webserviceagendamedica.dao.LocalAtendimentoDAO;

public class TestaLocalAtendimentoDAO {

	public static void main(String[] args) {
		int size = new LocalAtendimentoDAO().getInstance().listarTodos().size();
		for (int i = 0; i < size; i++) {
			System.out.println(new LocalAtendimentoDAO().getInstance().listarTodos().get(i).getNome()); // ok
		}
		System.out.println(new LocalAtendimentoDAO().getInstance().buscarPorId(1).getNome()); // ok
	}

}