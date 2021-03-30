/**
 * 
 */
package br.edu.ifs.ed2.dados.hash.colisao;

import br.edu.ifs.ed2.dados.hash.Hash;
import br.edu.ifs.ed2.dados.hash.HashEncadeado;

/**
 * Classe que implementa a opera��o de tratamento de colis�es na tabela.
 * 
 * @author Marlos Tacio Silva
 *
 */
public class ColisaoEncadeada<G> implements EstrategiaColisao<G> {

	/**
	 * 
	 */
	@Override
	public int obterIndice(int indiceInicial, Hash<G> tabela) {

		/*
		 * Inicializa��o do novo �ndice.
		 */
		int novoIndice = 0;

		/*
		 * Resolu��o da colis�o e, consequentemente, c�lculo do novo valor do �ndice.
		 */


		/*
		 * Retorno do novo �ndice.
		 */
		return indiceInicial;
	}

	@Override
	public int obterIndice(int indiceInicial, Hash<G> tabela, G conteudo) {

		/*
		 * Coer��o da tabela para um hash encadeado.
		 */
		HashEncadeado<G> hash = (HashEncadeado<G>) tabela;

		int novoIndice = 0;

		/*
		 * Se a c�lula do �ndice em quest�o estiver vazia ent�o a obten��o de �ndice
		 * ser� mal sucedida.
		 */

		if (hash.getTabela()[indiceInicial] == null){
			return -1;
		}

		/*
		 * Se o conte�do a ser buscado n�o estiver na lista referente ao �ndice em
		 * quest�o ent�o a obten��o de �ndice ser� mal sucedida.
		 */

		if (hash.getTabela()[indiceInicial].buscar(conteudo) == null){
			return -1;
		}

		/*
		 * Retorno do �ndice em que o conte�do est� alocado.
		 */
		return indiceInicial;
	}

}
