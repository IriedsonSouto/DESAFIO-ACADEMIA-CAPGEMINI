package questao3;

/**Classe responsavel por conter o metodo que encripta a mensagen.
* @author Iriedson Souto.
* @version 1
* @since 06/03/2022
*/
public class Encriptador {

	/**Método para retornar mensagen encriptada
	* @param Recebe strinig mensagen
	* @return String com os caracteres embaralhados.
	*/
	public static String encriptar(String mensagen){
		String mensagen2 = mensagen.replaceAll(" ", ""); //Remove espaços em branco da mensagen original
		int raizCaractere = 1 + (int) Math.sqrt(mensagen2.length()); //Contabiliza a raiz da quantidade de caracteres da mensagen
		
		String mensagenEncriptada = "";
		
		for(int i = 0; i < raizCaractere; i++){
			for(int j = i; j < mensagen2.length(); j+=raizCaractere){
				mensagenEncriptada += mensagen2.charAt(j); //Pega caractere a caractere e concatena com a mensagen a ser retornada
			}
			mensagenEncriptada += " ";
		}
		return mensagenEncriptada;	
	}
}
