package util;

/**
 * Classe responsável por demosntrar o conceito de ENUM
 *
 * @author Diego Almeida da Silva
 * @since 7 de abr. de 2021
 * @version 1.0
 */
public enum Cursos {

	JAVA(180, "Noturno"),
	COBOL(160, "Vespertino"),
	PHP(40, "Noturno/Vespertino"),
	UNITY(100, "Diurno");

	public int horas;
	public String periodo;
	
	Cursos(int horas, String periodo) {

		this.horas = horas;
		this.periodo = periodo;
		
	}
	public int getHoras() {
		return horas;
	}
	
	public String getPeriodo() {
		return periodo;
	}
	
}
