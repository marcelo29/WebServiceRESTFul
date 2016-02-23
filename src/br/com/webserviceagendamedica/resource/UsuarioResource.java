package br.com.webserviceagendamedica.resource;

import javax.ws.rs.Path;

import br.com.webserviceagendamedica.abstractclass.AbstractResource;
import br.com.webserviceagendamedica.controller.UsuarioController;

/**
 * Classe respons�vel por
 * @Autor Renan
 * @Cria��o 25 de nov de 2015
 */
@Path("/Usuario")
public class UsuarioResource extends AbstractResource {

	public UsuarioResource() {
		super(new UsuarioController());
	}
	
}
