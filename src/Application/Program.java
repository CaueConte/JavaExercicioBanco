package Application;
import java.util.Locale;
import java.util.Scanner;
import entities.Account;
public class Program {
	public static void main(String[] args) {
		System.out.println("ola");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account account;
		System.out.println("Enter account number: ");
		int number =sc.nextInt();
		System.out.println("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.println("initial y/n");
		char response = sc.next().charAt(0);
		if(response=='y') {
			System.out.print("Enter initial deposit: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit);
		}
		else {
			account = new Account(number,holder);
		}
		System.out.println("Account data: ");
		System.out.println(account);
		
		System.out.println("enter the deposit");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Updated data: "+account);
		
		System.out.println("enter withdraw");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("updated data"+account);
		
	}

}
