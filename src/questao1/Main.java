package questao1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**Classe Main responsavel por simular o uso do algoritimo.
* @author Iriedson Souto.
* @version 1
* @since 06/03/2022
*/
public class Main {

	public static void main(String[] args) {

		List<Integer> lista = new ArrayList(); //Lista criada e abastecida
		lista.add(7);
		lista.add(2);
		lista.add(9);
		lista.add(5);
		lista.add(6);
		
		System.out.println(OperacaoLista.medianaLista(lista)); // Demonstra mediana com impar elementos
		lista.add(10);
		
		System.out.println(OperacaoLista.medianaLista(lista)); // Demonstra mediana com par elementos

	}
}
