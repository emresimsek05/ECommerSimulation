package ECommers.Core.concretes;

import java.util.Scanner;

import ECommers.Core.abstracts.LoggerService;

public class LoggerManager implements LoggerService {
	
	@Override
	public void Log(String message) {
		System.out.println("Epostan�za do�rulama g�nderilmi�tir " + message);
		System.out.println("Do�rulama i�in ekrana t�klay�n�z");
		
		Scanner scanner = new Scanner(System.in);
			scanner.nextInt();
			while(scanner.nextInt()!=1) {
				System.out.println("Do�rulama onaylanmad� , tekrar deneyiniz");
				
			}
				System.out.println("Do�rulama Onayland�");
	}

}
