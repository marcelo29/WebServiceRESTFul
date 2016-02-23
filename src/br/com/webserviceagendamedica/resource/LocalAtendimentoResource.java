package br.com.webserviceagendamedica.resource;

import javax.ws.rs.Path;

import br.com.webserviceagendamedica.abstractclass.AbstractResource;
import br.com.webserviceagendamedica.controller.LocalAtendimentoController;

/**
 * Classe respons�vel por
 * @Autor Renan
 * @Cria��o 25 de nov de 2015
 */
@Path("/LocalAtendimento")
public class LocalAtendimentoResource extends AbstractResource {

	public LocalAtendimentoResource() {
		super(new LocalAtendimentoController());
	}
}
