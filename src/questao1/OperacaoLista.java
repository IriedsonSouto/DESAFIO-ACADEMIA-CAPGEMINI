package questao1;

/**Classe responsavel por conter o metodo que retorna a mediana de uma lista.
* @author Iriedson Souto.
* @version 1
* @since 06/03/2022
*/
import java.util.Collections;
import java.util.List;

public class OperacaoLista {

	/**Método para retornar mediana de lista
	* @param Recebe uma lista de inteiros
	* @return numero equivalente a mediana da lista.
	*/
	public static float medianaLista(List<Integer> vetor){
		Collections.sort(vetor); // Ordena vetor
		float mediana;
		if(vetor.size()%2 != 0){ // Caso numero de elementos da lista seja impar retorna mediana
			mediana = (float) vetor.get(vetor.size()/2);
			return mediana;
		}
		mediana = (((float) vetor.get(vetor.size()/2)-1) + ((float) vetor.get(vetor.size()/2)))/2; // Caso numero de elementos da lista seja par soma dois elementos e retorna a media equivalente a mediana		
		return mediana;
	}
}
