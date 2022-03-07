package questao2;

import java.util.Scanner;

/**Classe Main responsavel por simular o uso do algoritimo.
* @author Iriedson Souto.
* @version 1
* @since 06/03/2022
*/
public class Main {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int[] vetor = {1, 5, 3, 4, 2};
		
		System.out.print("Digite um numeral inteiro para o intervalo: ");
		int n = Integer.parseInt(leitor.nextLine()); //Pega do cliente a diferença desejada para verificar os numeros
		
		System.out.println(MetodosUtil.parDeDiferenca(vetor, n)); //Utiliza o metodo para retornar a quantidade de pares

		

	}
}
