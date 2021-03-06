package br.com.webserviceagendamedica.controller;

import java.util.Date;
import java.util.List;

import br.com.webserviceagendamedica.abstractclass.AbstractController;
import br.com.webserviceagendamedica.dao.AgendaMedicaDAO;
import br.com.webserviceagendamedica.model.AgendaMedica;

/**
 * Classe respons�vel por
 * 
 * @Autor Renan
 * @Cria��o 25 de nov de 2015
 */
public class AgendaMedicaController extends AbstractController<AgendaMedica> {

	public AgendaMedicaController() {
		super(new AgendaMedicaDAO().getInstance());
	}

	public List<AgendaMedica> listarPorLocalAtendimento(int id) {
		return new AgendaMedicaDAO().getInstance().listarPorLocalAtendimento(id);
	}

	public List<AgendaMedica> listarPorData(Date data) {
		return new AgendaMedicaDAO().getInstance().listarPorData(data);
	}

	public List<AgendaMedica> listarPorMedico(int id) {
		return new AgendaMedicaDAO().getInstance().listarPorMedico(id);
	}

	public List<AgendaMedica> listarPorEspecialidade(int id) {
		return new AgendaMedicaDAO().getInstance().listarPorEspecialidade(id);
	}

}