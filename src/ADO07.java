import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class ADO07 {

	public static void main(String[] args) {

		Scanner jogo = new Scanner(System.in);
        ArrayList<String> aleatorio = new ArrayList<String>();
        
		int tentativas = 0;

		String resposta;

		do {

			aleatorio.add("\nGottfried Leibnitz");
			aleatorio.add("\nBlaise Pascal");
			aleatorio.add("\nBasile Bouchon");
			aleatorio.add("\nJacquard");
			aleatorio.add("\nAllan Turing"); 
			
			System.out.println("Quem foi o criador da primeira máquina de somar?: ");
			System.out.println( aleatorio);
            Collections.shuffle(aleatorio);
			resposta = jogo.next();
		    
			
			switch (resposta) {
			case "A":
			case "a":
			case "C":
			case "c":
			case "D":
			case "d":
			case "E":
			case "e":

				tentativas++;

				System.out.println("Resposta incorreta!");
				System.out.println("Você ainda tem " + (3 - tentativas) + " tentativas restantes");

				if (tentativas > 3) {

					System.out.println("Você atingiu o máximo de tentativas");
					System.out.println("A resposta correta é Blaise Pasca,");

				}

				break;

			case "B":
			case "b":

				tentativas++;

				System.out.println("Resposta correta!");
				System.out.println("Você acertou na " + tentativas + " tentativa.");

				break;

			default:

				System.out.println("Escolha uma opção de 'A' a 'E'");

			}

		} while (!resposta.equalsIgnoreCase("B") && tentativas < 3);

		jogo.close();
	
		//Utilizando Collections, switch e do-while implemente uma questão de
		//múltipla escolha referente a alguma das outras disciplinas que você está
		//cursando neste semestre. Primeiro deverá ser apresentado o enunciado da
		//questão com as 5 opções/alternativas de resposta, que são (a), (b), (c), (d) e (e).
		//Depois que o usuário escolher uma opção, se for a resposta correta deverá ser
		//impresso “Resposta correta”, caso contrário “Resposta incorreta”. No caso de
		//“Resposta incorreta” a questão deve ser apresentada novamente para outra
		//tentativa, porém com as alternativas em outra ordem. Desta forma a cada nova
		//tentativa de resposta as opções/alternativas são “embaralhadas”. A questão
		//deixará de ser mostrada apenas quando a resposta correta for escolhida.//
	}

}
