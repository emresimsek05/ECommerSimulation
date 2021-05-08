package ECommers.Core.concretes;

import java.util.Scanner;

import ECommers.Core.abstracts.LoggerService;

public class LoggerManager implements LoggerService {
	
	@Override
	public void Log(String message) {
		System.out.println("Epostanýza doðrulama gönderilmiþtir " + message);
		System.out.println("Doðrulama için ekrana týklayýnýz");
		
		Scanner scanner = new Scanner(System.in);
			scanner.nextInt();
			while(scanner.nextInt()!=1) {
				System.out.println("Doðrulama onaylanmadý , tekrar deneyiniz");
				
			}
				System.out.println("Doðrulama Onaylandý");
	}

}
