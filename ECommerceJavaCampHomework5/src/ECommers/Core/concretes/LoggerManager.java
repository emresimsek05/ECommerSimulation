package ECommers.Core.concretes;

import java.util.Scanner;

import ECommers.Core.abstracts.LoggerService;

public class LoggerManager implements LoggerService {
	
	@Override
	public void Log(String message) {
		System.out.println("Epostanıza doğrulama gönderilmiştir " + message);
		System.out.println("Doğrulama için ekrana tıklayınız");
		
		Scanner scanner = new Scanner(System.in);
			scanner.nextInt();
			while(scanner.nextInt()!=1) {
				System.out.println("Doğrulama onaylanmadı , tekrar deneyiniz");
				
			}
				System.out.println("Doğrulama Onaylandı");
	}

}
