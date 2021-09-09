package jogo;

import java.util.Random;
import java.util.Scanner;

public class JogoJokenpo {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		int jogada;
		int numeroDePartidas;
		int contador = 0;
		int jogadasGanhasDoUser;
		int jogadasGanhasDoBot;

		System.out.println("--------------------------------------------------");
		System.out.println("                 J O K E N P O");
		System.out.println("--------------------------------------------------");
		System.out.print("Quantas partidas deseja desafiar RandomBot? ");
		numeroDePartidas = leitor.nextInt();

		if (numeroDePartidas % 2 == 0 || numeroDePartidas < 3) {
			System.out.println();
			System.out.println("Não podemos jogar com essa quantia :(");
			System.out.println("Escolha um número impar e maior ou igual a três!!");

		} else {

			System.out.println("Melhor de " + numeroDePartidas + "!! >:)");
			System.out.println();
			System.out.print("Escolha entre:" + "\n" + "\n1 = Pedra" + "\n2 = Papel" + "\n3 = Tesoura");
			System.out.println();
			
			while (contador < numeroDePartidas) {

				System.out.println();
				System.out.print("Qual será sua jogada? ");
				jogada = leitor.nextInt();

				Random sorteio = new Random();
				int numeroSorteado = sorteio.nextInt(3) + 1;

				// Decidir quem ganhou

				if (jogada >= 4) {
					System.out.println(
							"J O G A D A  I N V Á L I D A,  E S C O L H A  A P E N A S  A S  O P Ç Õ E S  E X I S T E N T E S!!");
				} else if (jogada <= 0) {
					System.out.println(
							"J O G A D A  I N V Á L I D A,  E S C O L H A  A P E N A S  A S  O P Ç Õ E S  E X I S T E N T E S!!");
				}

				else if (numeroSorteado == 1 && jogada == 1) {
					System.out.println();
					System.out.println("Você escolheu: Pedra");
					System.out.println("RandomBot escolheu: Pedra");
					System.out.println();
					System.out.println("E M P A T E !!");
					System.out.println("--------------------------------------------------");

				} else if (numeroSorteado == 1 && jogada == 2) {
					System.out.println();
					System.out.println("Você escolheu: Papel");
					System.out.println("RandomBot escolheu: Pedra");
					System.out.println();
					System.out.println("VOCÊ  VENCEU  ESTA  PARTIDA !!");
					jogadasGanhasDoUser = 1;
					System.out.println("--------------------------------------------------");

				} else if (numeroSorteado == 1 && jogada == 3) {
					System.out.println();
					System.out.println("Você escolheu: Tesoura");
					System.out.println("RandomBot escolheu: Pedra");
					System.out.println();
					System.out.println("RANDOMBOT  VENCEU  ESTA  PARTIDA !!");
					System.out.println("--------------------------------------------------");
				}

				else if (numeroSorteado == 2 && jogada == 1) {
					System.out.println();
					System.out.println("Você escolheu: Pedra");
					System.out.println("RandomBot escolheu: Papel");
					System.out.println();
					System.out.println("RANDOMBOT  VENCEU  ESTA  PARTIDA !!");
					System.out.println("--------------------------------------------------");

				} else if (numeroSorteado == 2 && jogada == 2) {
					System.out.println();
					System.out.println("Você escolheu: Papel");
					System.out.println("RandomBot escolheu: Papel");
					System.out.println();
					System.out.println("E M P A T E!!");
					System.out.println("--------------------------------------------------");

				} else if (numeroSorteado == 2 && jogada == 3) {
					System.out.println();
					System.out.println("Você escolheu: Tesoura");
					System.out.println("RandomBot escolheu: Papel");
					System.out.println();
					System.out.println("VOCÊ   VENCEU  ESTA  PARTIDA !!");
					System.out.println("--------------------------------------------------");

				} else if (numeroSorteado == 3 && jogada == 1) {
					System.out.println();
					System.out.println("Você escolheu: Pedra");
					System.out.println("RandomBot escolheu: Tesoura");
					System.out.println();
					System.out.println("VOCÊ   VENCEU  ESTA  PARTIDA !!");
					System.out.println("--------------------------------------------------");

				} else if (numeroSorteado == 3 && jogada == 2) {
					System.out.println();
					System.out.println("Você escolheu: Papel");
					System.out.println("RandomBot escolheu: Tesoura");
					System.out.println();
					System.out.println("RANDOMBOT  VENCEU  ESTA  PARTIDA !!");
					System.out.println("--------------------------------------------------");

				} else {
					System.out.println();
					System.out.println("Você escolheu: Tesoura");
					System.out.println("RandomBot escolheu: Tesoura");
					System.out.println();
					System.out.println("E M P A T E");
					System.out.println("--------------------------------------------------");
				}
				contador++;
			}
			leitor.close();
		}
	}
}
