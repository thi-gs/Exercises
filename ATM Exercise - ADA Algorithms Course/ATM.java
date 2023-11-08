import java.util.Scanner;

class ATM{
	public static void main(String[] args){
		String SelectedOption;
		Scanner myObj = new Scanner(System.in);
		int Balance = 0;
		boolean ExitProgram = false;
		
		while (ExitProgram == false){
			SelectedOption = ShowMenu();

			if (SelectedOption.equals("a")){
				System.out.println("\n\tYour Balance is: " + Balance);
			} else if (SelectedOption.equals("b")){
				System.out.println("\n\tType the amount to deposit: ");
				int Amount = myObj.nextInt();
				Balance = Amount + Balance;
				System.out.println("\n\t Successful Deposit");
			} else if (SelectedOption.equals("c")){
				System.out.println("\n\tType the amount to withdraw: ");
				int Amount = myObj.nextInt();
				if (Amount > Balance){
					System.out.println("\n\tWithdraw not allowed, insuficient Balance");
				} else {
					Balance = Balance - Amount;
					System.out.println("\n\tSuccessful withdraw");
				}
			} else if (SelectedOption.equals("d")){
				ExitProgram = true;
			} else {
				System.out.println("\n\tInvalid option, please try again");
			}
		}
	}
	
	static String ShowMenu(){
		Scanner myObj = new Scanner(System.in);
		String TypedOption;
		
		System.out.println("\n");
		System.out.println("-------------------------------------------");
		System.out.println("\tOperations Menu");
		System.out.println("-------------------------------------------");
		System.out.println("[a] Show your Balance");
		System.out.println("[b] Deposit");
		System.out.println("[c] Withdraw");
		System.out.println("[d] Exit\n");
		System.out.println("Selected option: ");
		
		TypedOption = myObj.nextLine();
		
		return TypedOption;
	}
}