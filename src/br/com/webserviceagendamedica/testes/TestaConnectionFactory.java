package br.com.webserviceagendamedica.testes;

import java.sql.Connection;

import br.com.webserviceagendamedica.factory.ConnectionFactory;

public class TestaConnectionFactory {

	public static boolean testaCriaConexao() {

		Connection conn = ConnectionFactory.criaConexao();
		// assertNull("conexao falhou", conn);
		// assertNotNull(conn);

		try {
			if ((conn == null) || (conn.isClosed())) {
				return false;
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(testaCriaConexao());
	}
}