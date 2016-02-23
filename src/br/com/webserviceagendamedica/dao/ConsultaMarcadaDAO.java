package br.com.webserviceagendamedica.dao;

import java.util.List;

import br.com.webserviceagendamedica.abstractclass.AbstractDAO;
import br.com.webserviceagendamedica.enumerator.Situacao;
import br.com.webserviceagendamedica.model.ConsultaMarcada;

/**
 * Classe respons�vel por
 * 
 * @Autor Renan
 * @Cria��o 25 de nov de 2015
 */

public class ConsultaMarcadaDAO extends AbstractDAO<ConsultaMarcada> {

	private static ConsultaMarcadaDAO instance;

	public ConsultaMarcadaDAO getInstance() {
		if (instance == null) {
			instance = new ConsultaMarcadaDAO();
		}
		return instance;
	}

	@Override
	public List<ConsultaMarcada> listarTodos() {
		getConnection();
		lista.clear();
		try {
			ps = conn.prepareStatement("select * from tb_consulta_marcada");
			rs = ps.executeQuery();

			while (rs.next()) {
				ConsultaMarcada consulta = new ConsultaMarcada();
				consulta.setId(rs.getLong("id_consulta_marcada"));
				consulta.setAgendaMedica(
						new AgendaMedicaDAO().getInstance().buscarPorId(rs.getInt("id_agenda_medico")));
				consulta.setDataCancelamento(rs.getDate("data_cancelamento"));
				consulta.setDataMarcacaoConsulta(rs.getDate("data_marcacao_consulta"));
				consulta.setSituacao(Situacao.getSituacao(rs.getString("situacao")));
				// consulta.setUsuario(rs.getInt(""));
				lista.add(consulta);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			fechaConexao();
		}
		return lista;
	}

	@Override
	public ConsultaMarcada buscarPorId(int id) {
		getConnection();
		ConsultaMarcada consulta = null;
		try {
			ps = conn.prepareStatement(
					"select * from tb_consulta_marcada where id_consulta_marcada = " + String.valueOf(id));
			rs = ps.executeQuery();
			while (rs.next()) {
				consulta = new ConsultaMarcada();
				consulta.setId(rs.getLong("id_consulta_marcada"));
				consulta.setAgendaMedica(
						new AgendaMedicaDAO().getInstance().buscarPorId(rs.getInt("id_agenda_medico")));
				consulta.setDataCancelamento(rs.getDate("data_cancelamento"));
				consulta.setDataMarcacaoConsulta(rs.getDate("data_marcacao_consulta"));
				consulta.setSituacao(Situacao.getSituacao(rs.getString("situacao")));
				// consulta.setUsuario(rs.getInt(""));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			fechaConexao();
		}
		return consulta;
	}

	public boolean inserir(ConsultaMarcada consultaMarcada) {
		getConnection();
		try {
			ps = conn.prepareStatement(
					"insert into tb_consulta_marcada(id_agenda_medico,id_usuario,data_marcacao_consulta,situacao)"
							+ " values (?, ?, ?, ?)");

			ps.setLong(1, consultaMarcada.getAgendaMedica().getId());
			ps.setLong(2, consultaMarcada.getUsuario().getId());
			ps.setDate(3, consultaMarcada.getDataMarcacaoConsulta());
			ps.setString(4, consultaMarcada.getSituacao().getTipoSituacao());

			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			fechaConexao();
		}
		return true;
	}

}