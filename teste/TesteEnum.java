package teste;

import util.Cursos;

/**
 * Classe responsável por demonstrar a utilização de ENUM
 *
 * @author Diego Almeida da Silva
 * @since 7 de abr. de 2021
 * @version 1.0
 */
public class TesteEnum {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		System.out.println("Curso de " + Cursos.JAVA + " duração de " + Cursos.JAVA.getHoras()
		+ " no período " + Cursos.JAVA.getPeriodo());
		System.out.println("Curso de " + Cursos.COBOL + " duração de " + Cursos.COBOL.getHoras()
		+ " no peródo" + Cursos.COBOL.getPeriodo());
		
		System.out.println("Todos os Cursos");
		for (Cursos c : Cursos.values()) {
			System.out.println(c + " com total de horas " + c.getHoras());
		}
		
		
	}

}
