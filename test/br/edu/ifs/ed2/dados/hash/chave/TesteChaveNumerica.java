/**
 * 
 */
package br.edu.ifs.ed2.dados.hash.chave;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


/**
 * @author Marlos Tacio Silva
 *
 */
class TesteChaveNumerica {

	/*
	 * Instancia��o de uma estrat�gia de gera��o de chave.
	 */
	private EstrategiaChave<Integer> chave = new ChaveNumerica();

	/**
	 * Testar m�todo para
	 * {@link br.edu.ifs.ed2.dados.hash.chave.ChaveNumerica#gerarChave(java.lang.Integer)}.
	 */
	@Test
	void testGerarChave() {

		/*
		 * Aplica��o da fun��o de gera��o da chave em n�meros negativos.
		 */
		assertEquals(chave.gerarChave(-3), 3);
		assertEquals(chave.gerarChave(-2), 2);
		assertEquals(chave.gerarChave(-1), 1);
		
		/*
		 * Aplica��o da fun��o de gera��o da chave no n�mero zero.
		 */
		assertEquals(chave.gerarChave(0), 0);

		/*
		 * Aplica��o da fun��o de gera��o da chave em n�meros positivos.
		 */
		assertEquals(chave.gerarChave(1), 1);
		assertEquals(chave.gerarChave(2), 2);
		assertEquals(chave.gerarChave(3), 3);
	}
}
