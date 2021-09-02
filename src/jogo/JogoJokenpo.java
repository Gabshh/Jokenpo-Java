package jogo;

import java.util.Random;
import java.util.Scanner;

public class JogoJokenpo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leitor = new Scanner(System.in);
		
		int jogada;
		
		System.out.println("* * * *J O K E N P O* * * *");
		System.out.println();
		System.out.print("Escolha entre:" + "\n" + "\n1 = Pedra" + "\n2 = Papel" + "\n3 = Tesoura" + "\n" + "\nQual será sua jogada? ");
		jogada = leitor.nextInt(); 
		
		leitor.close();
		
		Random sorteio = new Random();
		int numeroSorteado = sorteio.nextInt(3) + 1;
		
		//Decidir quem ganhou
		
		if (numeroSorteado == 1 && jogada == 1) {
			System.out.println();
			System.out.println("Você escolheu: Pedra");
			System.out.println("RandomBot escolheu: Pedra");
			System.out.println();
			System.out.println("Empate!!");
			
		}else if(numeroSorteado == 1 && jogada == 2) {
			System.out.println();
			System.out.println("Você escolheu: Papel");
			System.out.println("RandomBot escolheu: Pedra");
			System.out.println();
			System.out.println("Você venceu RandomBot!!");
			
		}else if (numeroSorteado == 1 && jogada == 3) {
			System.out.println();
			System.out.println("Você escolheu: Tesoura");
			System.out.println("RandomBot escolheu: Pedra");
			System.out.println();
			System.out.println("RandomBot venceu!!");
		}
		
		else if (numeroSorteado == 2 && jogada == 1) {
			System.out.println();
			System.out.println("Você escolheu: Pedra");
			System.out.println("RandomBot escolheu: Papel");
			System.out.println();
			System.out.print("RandomBot venceu!!");
			
		}else if (numeroSorteado == 2 && jogada == 2) {
			System.out.println();
			System.out.println("Você escolheu: Papel");
			System.out.println("RandomBot escolheu: Papel");
			System.out.println();
			System.out.println("Empate!!");
			
		}else if (numeroSorteado == 2 && jogada == 3) {
			System.out.println();
			System.out.println("Você escolheu: Tesoura");
			System.out.println("RandomBot escolheu: Papel");
			System.out.println();
			System.out.println("Você venceu RandomBot!!");
			
		}else if (numeroSorteado == 3 && jogada == 1) {
			System.out.println();
			System.out.println("Você escolheu: Pedra");
			System.out.println("RandomBot escolheu: Tesoura");
			System.out.println();
			System.out.println("Você venceu RandomBot!!");
			
		}else if (numeroSorteado == 3 && jogada == 2) {
			System.out.println();
			System.out.println("Você escolheu: Papel");
			System.out.println("RandomBot escolheu: Tesoura");
			System.out.println();
			System.out.println("RandomBot venceu!!");
			
		}else {
			System.out.println();
			System.out.println("Você escolheu: Tesoura");
			System.out.println("RandomBot escolheu: Tesoura");
			System.out.println();
			System.out.println("Empate!!");
		}
		
	}

}
