package br.com.webserviceagendamedica.testes;

import br.com.webserviceagendamedica.dao.ConsultaMarcadaDAO;
import br.com.webserviceagendamedica.enumerator.Situacao;
import br.com.webserviceagendamedica.model.AgendaMedica;
import br.com.webserviceagendamedica.model.ConsultaMarcada;
import br.com.webserviceagendamedica.model.Especialidade;
import br.com.webserviceagendamedica.model.LocalAtendimento;
import br.com.webserviceagendamedica.model.Medico;
import br.com.webserviceagendamedica.model.Usuario;

public class TestaConsultaMarcadaDAO {

	public static void main(String[] args) {
		Usuario usuario = new Usuario();
		usuario.setId(1);

		ConsultaMarcada consulta = new ConsultaMarcada();

		AgendaMedica agenda = new AgendaMedica();

		agenda.setId(3);

		LocalAtendimento local = new LocalAtendimento();
		local.setNome("Hospital Sao Matheus");
		local.setEndereco("Rua rio grande do norte, 1270");

		Medico medico = new Medico();

		Especialidade especialidade = new Especialidade();
		especialidade.setNome("Odonto");

		medico.setId(5);
		medico.setCrm(72637);
		medico.setNome("Marcelo Aguiar");
		medico.setEspecialidade(especialidade);

		agenda.setLocalAtendimento(local);
		agenda.setMedico(medico);

		consulta.setAgendaMedica(agenda);
		consulta.setUsuario(usuario);
		consulta.setSituacao(Situacao.Marcada);
		consulta.setDataMarcacaoConsulta(new java.sql.Date(new java.util.Date().getTime()));

		ConsultaMarcadaDAO instance = new ConsultaMarcadaDAO().getInstance();

		System.out.println(instance.inserir(consulta));
		System.out.println(instance.listarTodos().get(0).getAgendaMedica().getMedico().getNome());
		System.out.println(instance.buscarPorId(1).getAgendaMedica().getMedico().getEspecialidade().getNome());
	}

}