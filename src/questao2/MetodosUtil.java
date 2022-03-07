package questao2;

/**Classe responsavel por conter o metodo que contabiliza os pares numericos.
* @author Iriedson Souto.
* @version 1
* @since 06/03/2022
*/
public class MetodosUtil {

	/**M�todo para retornar quantidade de pares de numeros que tem a diferen�a determinada
	* @param Recebe vetor de inteiros e um inteiro para determinar a diferen�a entre os numeros
	* @return String com os caracteres embaralhados.
	*/
	public static int parDeDiferenca(int[] vetor, int diferenca){
		int contador = 0; // Contador de pares
		
		for(int i = 0; i < vetor.length; i++){
			for(int j = i; j < vetor.length; j++){
				if(vetor[i] - vetor[j] == diferenca || vetor[i] - vetor[j] == -diferenca){ //Verifica se dois numeros tem a diferen�a e contabiliza
					contador++;
				}
			}
		}	
		return contador;	
	}
}
