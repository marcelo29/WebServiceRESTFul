package br.com.webserviceagendamedica.controller;

import br.com.webserviceagendamedica.abstractclass.AbstractController;
import br.com.webserviceagendamedica.dao.LocalAtendimentoDAO;
import br.com.webserviceagendamedica.model.LocalAtendimento;

/**
 * Classe respons�vel por
 * 
 * @Autor Renan
 * @Cria��o 25 de nov de 2015
 */
public class LocalAtendimentoController extends AbstractController<LocalAtendimento> {

	public LocalAtendimentoController() {
		super(new LocalAtendimentoDAO());
	}

}