/**
 * 
 */
package br.edu.ifs.ed2.dados.hash.chave;

/**
 * Classe que implementa uma opera��o de constru��o de chaves textuais a partir
 * do exemplo a seguir:
 * 
 * Conte�do: Uva
 * 
 * 1� passo: transforma��o da palavra em letras min�scula e obten��o do c�digo
 * ASCII de cada caractere
 * 
 * u: 117 v: 118 a: 97
 * 
 * 2� passo: produto entre o c�digo de cada caractere e um n�mero primo elevado
 * � posi��o inversa desse caractere
 * 
 * u: 117 * 31 ^ 2 = 112 437 
 * v: 118 * 31 ^ 1 = 3 658 
 * a: 97 * 31 ^ 0 = 97
 * 
 * 3� passo: somat�rio dos valores calculados
 * 
 * chave = 116 192
 * 
 * @author Marlos Tacio Silva
 *
 */
public class ChaveTextual implements EstrategiaChave<String> {

	/**
	 *
	 */
	@Override
	public int gerarChave(String conteudo) {

		/*
		 * Inicializa��o da chave.
		 */
		int chave = 0;

		/*
		 * C�lculo da chave.
		 */

		conteudo = conteudo.toLowerCase();

		for (int i=0;i<conteudo.length();i++){

			chave += conteudo.charAt(i)*(int) Math.pow(31,conteudo.length()-1-i);

		}

		/*
		 * Retorno da chave.
		 */
		return chave;
	}
}
