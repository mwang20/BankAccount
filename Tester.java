public class Tester{
  public static void main(String[] args){
    BankAccount testBank = new BankAccount(2100, "password");
    System.out.println(testBank.getBalance());
    System.out.println();
    System.out.println(testBank.getAccountID());
  }
}
