package br.com.webserviceagendamedica.model;

import java.sql.Date;

import javax.xml.bind.annotation.XmlRootElement;

import br.com.webserviceagendamedica.enumerator.Situacao;

/**
 * Classe respons�vel por
 * 
 * @Autor Renan
 * @Cria��o 25 de nov de 2015
 */
@XmlRootElement
public class ConsultaMarcada {

	private long id;
	private AgendaMedica agendaMedica;
	private Usuario usuario;
	private Date dataMarcacaoConsulta, dataCancelamento;
	private Situacao situacao;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public AgendaMedica getAgendaMedica() {
		return agendaMedica;
	}

	public void setAgendaMedica(AgendaMedica agendaMedica) {
		this.agendaMedica = agendaMedica;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Date getDataMarcacaoConsulta() {
		return dataMarcacaoConsulta;
	}

	public void setDataMarcacaoConsulta(Date dataMarcacaoConsulta) {
		this.dataMarcacaoConsulta = dataMarcacaoConsulta;
	}

	public Situacao getSituacao() {
		return situacao;
	}

	public void setSituacao(Situacao situacao) {
		this.situacao = situacao;
	}

	public Date getDataCancelamento() {
		return dataCancelamento;
	}

	public void setDataCancelamento(Date dataCancelamento) {
		this.dataCancelamento = dataCancelamento;
	}

	@Override
	public String toString() {
		return "ConsultaMarcada [id=" + id + ", agendaMedica=" + agendaMedica + ", usuario=" + usuario
				+ ", data_marcacao_consulta=" + dataMarcacaoConsulta + ", situacao=" + situacao + ", data_cancelamento="
				+ dataCancelamento + "]";
	}

}