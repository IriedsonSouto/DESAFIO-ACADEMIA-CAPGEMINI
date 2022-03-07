package questao3;

import java.util.Scanner;

/**Classe Main responsavel por simular o uso do algoritimo.
* @author Iriedson Souto.
* @version 1
* @since 06/03/2022
*/
public class Main {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite uma mensagen: ");
		String mensagen = Encriptador.encriptar(leitor.nextLine()); //Pega mensagen do cliente e utiliza o metodo encriptador
		
		System.out.println(mensagen);
	}
}
