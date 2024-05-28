
import java.util.Scanner; 
public class BankManagementSystem { 
public static void main(String[] args) { 
 Scanner scanner = new Scanner(System.in); 
 Bank bank = new Bank(); 
 while (true) 
{ 
 System.out.println("Bank Management System"); 
 System.out.println("1. Create Account"); 
 System.out.println("2. Deposit"); 
 System.out.println("3. Withdraw"); 
 System.out.println("4. View Balance"); 
 System.out.println("5. Transfer Money"); 
 System.out.println("6. Delete Account"); 
 System.out.println("7. Number of Active Users"); 
 System.out.println("8. Exit"); 
System.out.print("Enter your choice: "); 
int choice = scanner.nextInt(); 
scanner.nextLine(); // Consume newline
 switch (choice) 
{ 
 case 1:
System.out.print("Enter account number: "); 
int accNumber = scanner.nextInt(); 
scanner.nextLine(); // Consume newline 
System.out.print("Enter account holder name: "); 
String accHolderName = scanner.nextLine(); 
bank.createAccount(accNumber, accHolderName); 
System.out.println("Account created successfully."); 
break; 
 
case 2: 
 System.out.print("Enter account number: "); 
int depositAccNumber = scanner.nextInt(); 
System.out.print("Enter deposit amount: "); 
double depositAmount = scanner.nextDouble(); 
BankAccount depositAccount = bank.getAccount(depositAccNumber); 
if (depositAccount != null) { 
depositAccount.deposit(depositAmount); 
System.out.println("Amount deposited successfully."); 
 } else { 
 System.out.println("Account not found."); 
 } 
break; 
 
case 3: 
System.out.print("Enter account number: "); 
int withdrawAccNumber = scanner.nextInt(); 
System.out.print("Enter withdrawal amount: "); 
double withdrawAmount = scanner.nextDouble(); 
BankAccount withdrawAccount = bank.getAccount(withdrawAccNumber); 
if (withdrawAccount != null) { 
if (withdrawAccount.withdraw(withdrawAmount)) { 
System.out.println("Amount withdrawn successfully."); 
 } else
{ 
 System.out.println("Insufficient balance."); 
 } 
 } else { 
 System.out.println("Account not found."); 
 } 
break; 
 
case 4: 
 System.out.print("Enter account number: "); 
int viewAccNumber = scanner.nextInt(); 
BankAccount viewAccount = bank.getAccount(viewAccNumber); 
if (viewAccount != null) { 
 System.out.println("Account Holder: " + 
viewAccount.getAccountHolderName()); 
 System.out.println("Balance: " + 
viewAccount.getBalance()); 
 } else { 
 System.out.println("Account not found."); 
 } 
break; 
 
case 5: 
 System.out.print("Enter sender's account number: "); 
int senderAccNumber = scanner.nextInt(); 
 System.out.print("Enter recipient's account number: "); 
int recipientAccNumber = scanner.nextInt(); 
System.out.print("Enter transfer amount: "); 
 
double transferAmount = scanner.nextDouble(); 
 
BankAccount senderAccount = bank.getAccount(senderAccNumber); 
BankAccount recipientAccount = bank.getAccount(recipientAccNumber); 
 
if (senderAccount != null&& recipientAccount != null) 
{ 
senderAccount.transfer(recipientAccount, transferAmount); 
 } 
else 
{ 
 System.out.println("Invalid account numbers."); 
 } 
break; 
 
case 6: 
 System.out.print("Enter account number: "); 
int deleteAccNumber = scanner.nextInt(); 
if (bank.deleteAccount(deleteAccNumber))
{ 
 System.out.println("Account deleted successfully."); 
 }
else { 
 System.out.println("Account not found."); 
 } 
break; 
 
case 7: 
 System.out.println("Number of Active Users: " + 
bank.getNumberOfActiveUsers()); 
 
break; 
case 8: 
 
 System.out.println("Exiting..."); 
scanner.close(); 
System.exit(0); 
break; 
default: 
 System.out.println("Invalid choice."); 
 } 
 System.out.println(); 
 } 
 } 
} 

