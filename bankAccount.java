import java.util.Scanner;

public class bankAccount{

	//attributes
	private int acctNum;
	private int balance;

	//default constructor
	public bankAccount(){
		this.acctNum=0;
		this.balance=0;
	}

	//parameterised constructor
	public bankAccount(int acctNum, int balance){
		this.acctNum=acctNum;
		this.balance=balance;
	}

	//getter for acctNum
	public int getAcctNum(){
		return acctNum;
	}

	//getter for balance
	public int getBalance(){
		return balance;
	}

	//setter for acctNum
	public void setAcctNum(int num){
		this.acctNum=num;
		System.out.println("Your account number: " + acctNum);
	}

	//setter for balance
	public void setBalance(int choice, int amount){
		if (choice == 1){
			if(amount>=100){
				this.balance += amount;
				System.out.println("Your new balance: " + balance);
			}else{
				System.out.println("You can recharge a minimum of 100");
			}
		}else if (choice == 2){
			if(balance>0 && balance-amount>0){
				this.balance -= amount;
				System.out.println("Your new balance: " + balance);
			}else{
				System.out.println("There is not sufficient balance");
			}
		}
		else{
			System.out.println("Invalid choice");
		}
	}

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		bankAccount user1 = new bankAccount();

		int userChoice1;

		System.out.println("Welcome to our banking system.");

		do{

			System.out.println(" ");
			System.out.println("Menu:");
			System.out.println("1. Check my balance");
			System.out.println("2. Set/change my account number");
			System.out.println("3. View my account number");
			System.out.println("4. Withdraw money/Recharge my account");
			System.out.println("5. Exit the system");
			System.out.println(" ");
			System.out.println("Your choice: ");

			userChoice1 = scanner.nextInt();
			if (userChoice1 == 1){
				System.out.println("Your balance: " + user1.getBalance());
			}
			else if (userChoice1 == 2){
				System.out.println("Enter the new account number");
				int newNum = scanner.nextInt();
				user1.setAcctNum(newNum);
			}
			else if (userChoice1 == 3){
				System.out.println("Got a pen and paper? Your account number is: " + user1.getAcctNum());
			}else if (userChoice1 == 4){
				System.out.println("1. Recharge my account");
				System.out.println("2. Withdraw money");
				int userChoice2 = scanner.nextInt();
				if(userChoice2==1){
					System.out.println("How much do you want to recharge?");
					int amtToRecharge = scanner.nextInt();
					user1.setBalance(userChoice2, amtToRecharge);
				}else if(userChoice2==2){
					System.out.println("How much do you want to withdraw?");
					int amtToWithdraw = scanner.nextInt();
					user1.setBalance(userChoice2, amtToWithdraw);
				}else{
				System.out.println("Invalid choice");
				}
			}
			else if (userChoice1 == 5){
				System.out.println("Thank you for using our system. Exiting...");
			}
			else{
				System.out.println("Invalid choice");
			}
		}while(userChoice1 != 5);

	}


}