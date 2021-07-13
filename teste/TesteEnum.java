package teste;

import util.Cursos;

/**
 * Classe respons�vel por demonstrar a utiliza��o de ENUM
 *
 * @author Diego Almeida da Silva
 * @since 7 de abr. de 2021
 * @version 1.0
 */
public class TesteEnum {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {

		System.out.println("Curso de " + Cursos.JAVA + " dura��o de " + Cursos.JAVA.getHoras()
		+ " no per�odo " + Cursos.JAVA.getPeriodo());
		System.out.println("Curso de " + Cursos.COBOL + " dura��o de " + Cursos.COBOL.getHoras()
		+ " no per�do" + Cursos.COBOL.getPeriodo());
		
		System.out.println("Todos os Cursos");
		for (Cursos c : Cursos.values()) {
			System.out.println(c + " com total de horas " + c.getHoras());
		}
		
		
	}

}
