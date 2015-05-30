package jogoDaForca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Este é o jogo da forca");

		/*Forca jogo = new Forca("BOI");
		System.out.println(jogo.desenhaLinhaForca());

		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite uma palavra: ");
		String nome = entrada.nextLine();
		jogo.advinhaLetra(nome);*/
		
		String palavra[] = { "b", "o", "i" };  
		  
		Scanner sc = new Scanner(System.in);  
		  
		int forca = 1, vencer = 0, perder = 0, contador = 0, chancesDificil = 5;  
		// Nesse caso o array não precisa ter o tamanho de 100, já que a pessoa se  
		// perder for = 5 ele perde e  
		// se vencer = 5, ele ganha, pode ser 10 para melhorar a performace do  
		// for criado abaixo, nesse caso vamos deixar com tamanho 20 no caso da pessoa   
		//digitar a mesma letra algumas vezes.  
		String digito, letrasDigitadas[] = new String[20];  
		  
		while (forca == 1) {  
		    int existePalavra = 0;  
		    System.out.println("Digite a letra:");  
		    digito = sc.next();  
		    letrasDigitadas[contador] = digito;  
		  
		    /** for criado para verificar se a letra já foi digitada. */  
		    for (int i = 0; i < letrasDigitadas.length; i++) {  
		        if (letrasDigitadas[i] != null) {  
		            if (letrasDigitadas[i].equals(digito)) {  
		                existePalavra++;  
		            }  
		        }  
		    }  
		    /**Se a letra não foi digitada ainda verifica se está correta, caso contrario exibe a mensagem */  
		    if (!(existePalavra > 1)) {  
		        /**Faz o loop no array da palavra, que não estava sendo feito */  
		        for (int x = 0; x < palavra.length; x++) {  
		            /**Verifica se a letra está correta */  
		            if (palavra[x].equals(digito)) {  
		                System.out.println("Letra correta.");  
		                vencer++;  
		                break;  
		            } else {  
		                if (x == 2) {  
		                    System.out.println("Letra inexistente.");  
		                    perder++;
		                    System.out.println("Você tem apenas:" + (chancesDificil - perder) + "chanses");
		                }  
		            }  
		        }  
		        if (perder == chancesDificil) {  
		            System.out.println("Você perdeu, tente novamente!");  
		            System.exit(0);  
		        } else if (vencer == 3) {  
		            System.out.println("Voce venceu parabéns.");  
		            System.exit(0);  
		        }  
		    } else {  
		        System.out.println("Essa letra já foi digitada.");  
		    }  
		    contador++;  
		}  

		
		

	}

}
