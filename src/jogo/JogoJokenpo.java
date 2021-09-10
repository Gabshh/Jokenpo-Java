package jogo;

import java.util.Random;
import java.util.Scanner;

public class JogoJokenpo {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		String resposta;
		int jogada, numeroDePartidas;
		int contador = 0;
		int jogadasGanhasDoUser = 0;
		int jogadasGanhasDoBot = 0;
		int empates = 0;

		System.out.println("--------------------------------------------------");
		System.out.println("                 J O K E N P O");
		System.out.println("--------------------------------------------------");
		System.out.println();
		System.out.print("Deseja desafiar RandomBot? (S/N): ");
		resposta = leitor.next();
		System.out.println();

		while (resposta.equals("S") || resposta.equals("s")) {

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

				while (contador < numeroDePartidas && !(jogadasGanhasDoUser > (numeroDePartidas - empates) / 2
						|| jogadasGanhasDoBot > (numeroDePartidas - empates) / 2)) {

					System.out.println();
					System.out.print("Qual será sua jogada? ");
					jogada = leitor.nextInt();

					// o bloco de codigo abaixo define o resultado do jogo

					Random sorteio = new Random();
					int numeroSorteado = sorteio.nextInt(3) + 1;

					if (numeroSorteado == 1 && jogada == 1) {
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
						jogadasGanhasDoUser++;
						System.out.println("--------------------------------------------------");

					} else if (numeroSorteado == 1 && jogada == 3) {
						System.out.println();
						System.out.println("Você escolheu: Tesoura");
						System.out.println("RandomBot escolheu: Pedra");
						System.out.println();
						System.out.println("RANDOMBOT  VENCEU  ESTA  PARTIDA !!");
						jogadasGanhasDoBot++;
						System.out.println("--------------------------------------------------");
					}

					else if (numeroSorteado == 2 && jogada == 1) {
						System.out.println();
						System.out.println("Você escolheu: Pedra");
						System.out.println("RandomBot escolheu: Papel");
						System.out.println();
						System.out.println("RANDOMBOT  VENCEU  ESTA  PARTIDA !!");
						jogadasGanhasDoBot++;
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
						jogadasGanhasDoUser++;
						System.out.println("--------------------------------------------------");

					} else if (numeroSorteado == 3 && jogada == 1) {
						System.out.println();
						System.out.println("Você escolheu: Pedra");
						System.out.println("RandomBot escolheu: Tesoura");
						System.out.println();
						System.out.println("VOCÊ   VENCEU  ESTA  PARTIDA !!");
						jogadasGanhasDoUser++;
						System.out.println("--------------------------------------------------");

					} else if (numeroSorteado == 3 && jogada == 2) {
						System.out.println();
						System.out.println("Você escolheu: Papel");
						System.out.println("RandomBot escolheu: Tesoura");
						System.out.println();
						System.out.println("RANDOMBOT  VENCEU  ESTA  PARTIDA !!");
						jogadasGanhasDoBot++;
						System.out.println("--------------------------------------------------");

					} else if (numeroSorteado == 3 && jogada == 3) {
						System.out.println();
						System.out.println("Você escolheu: Tesoura");
						System.out.println("RandomBot escolheu: Tesoura");
						System.out.println();
						System.out.println("E M P A T E");
						System.out.println("--------------------------------------------------");

					} else if (jogada >= 4 || jogada <= 0) {
						System.out.println(
								"J O G A D A  I N V Á L I D A,  E S C O L H A  A P E N A S  A S  O P Ç Õ E S  E X I S T E N T E S!!");
					}

//				ESTABELECER QUE NÃO É MAIS POSSÍVEL O RIVAL SUPERA-LO

					if (jogadasGanhasDoUser > (numeroDePartidas - empates) / 2) {
						System.out.printf("NÃO É NECESSÁRIO PROSSEGUIR AS PARTIDAS!!", jogadasGanhasDoUser,
								jogadasGanhasDoBot);
					} else if (jogadasGanhasDoBot > (numeroDePartidas - empates) / 2) {
						System.out.printf("NÃO É NECESSÁRIO PROSSEGUIR AS PARTIDAS!!", jogadasGanhasDoBot,
								jogadasGanhasDoUser);
					}
					contador++;

				}
				if (jogadasGanhasDoUser == 0 && jogadasGanhasDoBot == 0) {
					System.out.println();
					System.out.println("CONSEGUIRAM EMPATAR " + contador + " VEZES :O" + "\nHORA DA PARTIDA DE OURO!!"
							+ "\n Escolha cuidadosamente para o desempate...");
					System.out.println();

//					PARTIDAS DE OURO

					while (jogadasGanhasDoUser == 0 && jogadasGanhasDoBot == 0) {
						System.out.println();
						System.out.print("Qual será sua jogada? ");
						jogada = leitor.nextInt();

						if (jogada >= 4 || jogada <= 0) {
							System.out.println(
									"J O G A D A  I N V Á L I D A,  E S C O L H A  A P E N A S  A S  O P Ç Õ E S  E X I S T E N T E S!!");
						}

						Random sorteio = new Random();
						int numeroSorteado = sorteio.nextInt(3) + 1;

						// o bloco de codigo abaixo define o resultado do jogo

						if (numeroSorteado == 1 && jogada == 1) {
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
							jogadasGanhasDoUser++;
							System.out.println("--------------------------------------------------");

						} else if (numeroSorteado == 1 && jogada == 3) {
							System.out.println();
							System.out.println("Você escolheu: Tesoura");
							System.out.println("RandomBot escolheu: Pedra");
							System.out.println();
							System.out.println("RANDOMBOT  VENCEU  ESTA  PARTIDA !!");
							jogadasGanhasDoBot++;
							System.out.println("--------------------------------------------------");
						}

						else if (numeroSorteado == 2 && jogada == 1) {
							System.out.println();
							System.out.println("Você escolheu: Pedra");
							System.out.println("RandomBot escolheu: Papel");
							System.out.println();
							System.out.println("RANDOMBOT  VENCEU  ESTA  PARTIDA !!");
							jogadasGanhasDoBot++;
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
							jogadasGanhasDoUser++;
							System.out.println("--------------------------------------------------");

						} else if (numeroSorteado == 3 && jogada == 1) {
							System.out.println();
							System.out.println("Você escolheu: Pedra");
							System.out.println("RandomBot escolheu: Tesoura");
							System.out.println();
							System.out.println("VOCÊ   VENCEU  ESTA  PARTIDA !!");
							jogadasGanhasDoUser++;
							System.out.println("--------------------------------------------------");

						} else if (numeroSorteado == 3 && jogada == 2) {
							System.out.println();
							System.out.println("Você escolheu: Papel");
							System.out.println("RandomBot escolheu: Tesoura");
							System.out.println();
							System.out.println("RANDOMBOT  VENCEU  ESTA  PARTIDA !!");
							jogadasGanhasDoBot++;
							System.out.println("--------------------------------------------------");

						} else {
							System.out.println();
							System.out.println("Você escolheu: Tesoura");
							System.out.println("RandomBot escolheu: Tesoura");
							System.out.println();
							System.out.println("E M P A T E");
							System.out.println("--------------------------------------------------");
						}

						if (jogadasGanhasDoUser > jogadasGanhasDoBot) {
							System.out.println();
							System.out.printf("VOCÊ VENCEU O DESAFIO POR %d x %d", jogadasGanhasDoUser,
									jogadasGanhasDoBot);
						} else if (jogadasGanhasDoBot > jogadasGanhasDoUser) {
							System.out.println();
							System.out.printf("RANDOMBOT VENCEU O DESAFIO POR %d x %d", jogadasGanhasDoBot,
									jogadasGanhasDoUser);
						}
					}
				}
			}
			if (jogadasGanhasDoUser > jogadasGanhasDoBot) {
				System.out.println();
				System.out.printf("VOCÊ VENCEU O DESAFIO POR %d x %d", jogadasGanhasDoUser, jogadasGanhasDoBot);
			} else if (jogadasGanhasDoBot > jogadasGanhasDoUser) {
				System.out.println();
				System.out.printf("RANDOMBOT VENCEU O DESAFIO POR %d x %d", jogadasGanhasDoBot, jogadasGanhasDoUser);
			}
			System.out.println();
			System.out.print("Jogar novamente? (S/N): ");
			resposta = leitor.next();
		}
		if (resposta.equals("N") || resposta.equals("n")) {
			System.out.println();
			System.out.println("Ok, você pode jogar com RandomBot quando quiser! :)");
		} else {
			System.out.println();
			System.out.println("Por favor, responda corretamente!!");
		}leitor.close();
	}
}
