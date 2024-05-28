
import java.util.ArrayList; 
import java.util.List;
class Bank { 
private List<BankAccount> accounts;
public Bank() { 
accounts = new ArrayList<>();
} 
public void createAccount(int accountNumber, String accountHolderName) 
{ 
 BankAccount account = new BankAccount(accountNumber, accountHolderName); 
accounts.add(account);
} 
public boolean deleteAccount(int accountNumber)
{ 
for (BankAccount account : accounts)
{
if (account.getAccountNumber() == accountNumber)
{ 
accounts.remove(account); 
 

return true;
} 
} 
return false;
} 
public BankAccount getAccount(int accountNumber)
{ 
 for (BankAccount account : accounts)
{ 
 if (account.getAccountNumber() == accountNumber)
{ 
return account;
} 
} 
return null;
} 
public List<BankAccount> getAllAccounts()
{ 
return new ArrayList<>(accounts);
} 
public int getNumberOfActiveUsers() 
{ 
return accounts.size();
}
}



