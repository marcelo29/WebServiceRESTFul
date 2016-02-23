package br.com.webserviceagendamedica.enumerator;

public enum Situacao {
	Marcada, /* M */
	Disponivel, /* D */
	Cancelada; /* C */

	private static String tipoSituacao = "";

	public static Situacao getSituacao(String situacao) {

		Situacao retorno = null;

		switch (situacao) {
		case "M":
			tipoSituacao = "M";
			retorno = Marcada;
		case "D":
			tipoSituacao = "D";
			retorno = Disponivel;
		case "C":
			tipoSituacao = "C";
			retorno = Cancelada;
		default:
			break;
		}
		return retorno;
	}

	public String getTipoSituacao() {
		return tipoSituacao;
	}
}