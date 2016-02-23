package br.com.webserviceagendamedica.testes;

import br.com.webserviceagendamedica.dao.AgendaMedicaDAO;

public class TestaAgendaMedicaDAO {

	public static void main(String[] args) {
		AgendaMedicaDAO agenda = new AgendaMedicaDAO().getInstance();

		System.out.println(agenda.listarTodos().get(0).getDataAgenda());
		System.out.println(agenda.buscarPorId(1).getLocalAtendimento().getNome());
		System.out.println(agenda.listarPorLocalAtendimento(1).get(0).getLocalAtendimento().getEndereco());
		// System.out.println(agenda.listarPorData());
		System.out.println(agenda.listarPorMedico(1).get(0).getMedico().getNome());
		System.out.println(agenda.listarPorEspecialidade(1).get(0).getMedico().getEspecialidade().getNome());
	}

}