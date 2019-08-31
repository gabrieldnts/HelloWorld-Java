/* Disciplina: Programação Orientada a Objetos
 * Prof.: Orlewilson B. Maia 
 * Autor: Gabriel Mar Dantas
 * Data: 30/08/2019
 * Descrição: Primeiro programa em Java
 * 
 * 
 * 
 * */

// Classe principal para executar o projeto
public class Main {	
	// método principal para rodar código
	public static void main(String[]args){
		//criar objetos
		Cachorro toto = new Cachorro();
		//alterando conteúdo dos atributos
		toto.apelido = "toto";
		toto.comprimento = 1.2f;
		toto.cor = "amarelo";
		toto.peso = 20f;
		toto.raca = "spitz alemão";
		
		//mostrar conteúdos dos atributos
		System.out.println("Apelido:" + toto.apelido);
		System.out.println("Raça:" + toto.raca);
		System.out.println("Cor:" + toto.cor);
		System.out.println("Peso:" + toto.peso);
		System.out.println("Comprimento:" + toto.comprimento);
		
		//chamando os métodos
		toto.correr();
		toto.morder();
		toto.latir();
	}
	}
