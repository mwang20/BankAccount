public class BankAccount{
  private double balance;
  private int accountID;
  private String password;
  public BankAccount(int accountID, String password){
    accountID = accountID;
    password = password;
    balance = 0;
  }
  public double getBalance(){
    return balance;
  }
  public int getAccountID(){
    return accountID;
  }
}
