/* Disciplina: Programa��o Orientada a Objetos
 * Prof.: Orlewilson B. Maia 
 * Autor: Gabriel Mar Dantas
 * Data: 30/08/2019
 * Descri��o: Primeiro programa em Java
 * 
 * 
 * 
 * */

// Classe principal para executar o projeto
public class Main {	
	// m�todo principal para rodar c�digo
	public static void main(String[]args){
		//criar objetos
		Cachorro toto = new Cachorro();
		//alterando conte�do dos atributos
		toto.apelido = "toto";
		toto.comprimento = 1.2f;
		toto.cor = "amarelo";
		toto.peso = 20f;
		toto.raca = "spitz alem�o";
		
		//mostrar conte�dos dos atributos
		System.out.println("Apelido:" + toto.apelido);
		System.out.println("Ra�a:" + toto.raca);
		System.out.println("Cor:" + toto.cor);
		System.out.println("Peso:" + toto.peso);
		System.out.println("Comprimento:" + toto.comprimento);
		
		//chamando os m�todos
		toto.correr();
		toto.morder();
		toto.latir();
	}
	}
