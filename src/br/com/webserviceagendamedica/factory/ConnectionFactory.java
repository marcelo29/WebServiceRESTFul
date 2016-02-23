package br.com.webserviceagendamedica.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Classe respons�vel por criar a conex�o com banco de dados.
 * 
 * @author Renan
 *
 */
public class ConnectionFactory {

	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost/agenda_medica";
	private static final String USER = "root";
	private static final String PASSWORD = "123";

	@SuppressWarnings("finally")
	public static Connection criaConexao() {
		Connection conn = null;
		try {
			Class.forName(DRIVER);
			conn = DriverManager.getConnection(URL, USER, PASSWORD);

		} catch (Exception e) {
			// System.out.println("Erro na conex�o com o banco de dados" + e);
			e.printStackTrace();
		} finally {
			return conn;
		}
	}

	public static void fechaConexao(Connection conn, PreparedStatement pstmt, ResultSet rs) {
		try {
			if (conn != null) {
				conn.close();
			}
			if (pstmt != null) {
				pstmt.close();
			}
			if (rs != null) {
				rs.close();
			}
		} catch (Exception e) {
			// System.out.println("Erro no encerramento da conex�o " + e);
			e.printStackTrace();
		}
	}
}