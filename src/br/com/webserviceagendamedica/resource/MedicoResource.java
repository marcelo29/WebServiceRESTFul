package br.com.webserviceagendamedica.resource;

import javax.ws.rs.Path;

import br.com.webserviceagendamedica.abstractclass.AbstractResource;
import br.com.webserviceagendamedica.controller.MedicoController;

/**
 * Classe respons�vel por
 * 
 * @Autor Renan
 * @Cria��o 25 de nov de 2015
 */
@Path("/Medico")
public class MedicoResource extends AbstractResource {

	public MedicoResource() {
		super(new MedicoController());
	}
}
