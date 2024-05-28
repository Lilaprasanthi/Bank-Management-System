
class BankAccount { 
private int accountNumber; 
private String accountHolderName; 
private double balance; 
public BankAccount(int accountNumber, String accountHolderName)
{ 
this.accountNumber = accountNumber; 
this.accountHolderName = accountHolderName; 
 this.balance = 0.0; 
 } 
 public int getAccountNumber()
{ 
return accountNumber; 
 } 
public String getAccountHolderName()
{ 
 return accountHolderName; 
 } 
public double getBalance()
{ 
return balance; 
 } 
public void deposit(double amount)
{ 
balance += amount; 
 } 
 
 public boolean withdraw(double amount) 
{ 
 if (balance >= amount) 
{ 
balance -= amount; 
return true; 
 } 
return false; 
 } 
public void transfer(BankAccount recipient, double amount)
{ 
 if (withdraw(amount)) 
 { 
recipient.deposit(amount); 
 System.out.println("Transfer successful."); 
 } else 
 { 
 System.out.println("Insufficient balance for transfer."); 
 } 
 } 
} 




