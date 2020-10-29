public class BankAccount{
  private double balance;
  private int accountID;
  private String password;
  public BankAccount(int accountID1, String password1){
    accountID = accountID1;
    password = password1;
    balance = 0;
  }
  public double getBalance(){
    return balance;
  }
  public int getAccountID(){
    return accountID;
  }
  public void setPassword(String newPass){
    password = newPass;
  }
  public boolean deposit(double amount){
    if (amount >= 0){
      balance += amount;
      return true;
    }
    return false;
  }
  public boolean withdraw(double amount){
    if (amount >= 0 && amount <= balance){
      balance -= amount;
      return true;
    }
    return false;
  }
  public String toString(){
    return accountID + "\t" + balance;
  }
}
