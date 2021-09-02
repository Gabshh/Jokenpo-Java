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
		
		if (jogada >=4) {
			System.out.println("J O G A D A  I N V Á L I D A,  E S C O L H A  A P E N A S  A S  O P Ç Õ E S  E X I S T E N T E S!!");
		} else if (jogada <=0) {
			System.out.println("J O G A D A  I N V Á L I D A,  E S C O L H A  A P E N A S  A S  O P Ç Õ E S  E X I S T E N T E S!!");
		}
		
		else if (numeroSorteado == 1 && jogada == 1) {
			System.out.println();
			System.out.println("Você escolheu: Pedra");
			System.out.println("RandomBot escolheu: Pedra");
			System.out.println();
			System.out.println("E M P A T E !!");
			
		}else if(numeroSorteado == 1 && jogada == 2) {
			System.out.println();
			System.out.println("Você escolheu: Papel");
			System.out.println("RandomBot escolheu: Pedra");
			System.out.println();
			System.out.println("V O C Ê  V E N C E U  R A N D O M B O T!!");
			
		}else if (numeroSorteado == 1 && jogada == 3) {
			System.out.println();
			System.out.println("Você escolheu: Tesoura");
			System.out.println("RandomBot escolheu: Pedra");
			System.out.println();
			System.out.println("R A N D O M B O T  V E N C E U!!");
		}
		
		else if (numeroSorteado == 2 && jogada == 1) {
			System.out.println();
			System.out.println("Você escolheu: Pedra");
			System.out.println("RandomBot escolheu: Papel");
			System.out.println();
			System.out.print("R A N D O M B O T  V E N C E U!!");
			
		}else if (numeroSorteado == 2 && jogada == 2) {
			System.out.println();
			System.out.println("Você escolheu: Papel");
			System.out.println("RandomBot escolheu: Papel");
			System.out.println();
			System.out.println("E M P A T E!!");
			
		}else if (numeroSorteado == 2 && jogada == 3) {
			System.out.println();
			System.out.println("Você escolheu: Tesoura");
			System.out.println("RandomBot escolheu: Papel");
			System.out.println();
			System.out.println("V O C Ê  V E N C E U  R A N D O M B O T!!");
			
		}else if (numeroSorteado == 3 && jogada == 1) {
			System.out.println();
			System.out.println("Você escolheu: Pedra");
			System.out.println("RandomBot escolheu: Tesoura");
			System.out.println();
			System.out.println("V O C Ê  V E N C E U  R A N D O M B O T!!");
			
		}else if (numeroSorteado == 3 && jogada == 2) {
			System.out.println();
			System.out.println("Você escolheu: Papel");
			System.out.println("RandomBot escolheu: Tesoura");
			System.out.println();
			System.out.println("R A N D O M B O T  V E N C E U!!");
			
		}else {
			System.out.println();
			System.out.println("Você escolheu: Tesoura");
			System.out.println("RandomBot escolheu: Tesoura");
			System.out.println();
			System.out.println("E M P A T E");
		}
		
	}

}
