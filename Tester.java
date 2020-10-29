public class Tester{
  public static void main(String[] args){
    BankAccount testBank = new BankAccount(1200, "password");
    System.out.println(testBank.getBalance()); //Should print out 0.0
    System.out.println();
    System.out.println(testBank.getAccountID()); //Should print out 1200
    testBank.setPassword("newpassword"); //Should change password from "password" to "newpassword"
    System.out.println(testBank.deposit(1000)); //Should return true and add 1000 to the Balance
    System.out.println(testBank.getBalance()); //Should return 1000.0
    System.out.println();
    System.out.println(testBank.deposit(0)); //Should return true and add 0 to the Balance
    System.out.println(testBank.getBalance()); //Should return 1000.00
    System.out.println();
    System.out.println(testBank.deposit(-100)); //Should return false and add nothing to the balance
    System.out.println(testBank.getBalance()); //Should return 1000.0
    System.out.println();
    System.out.println(testBank.withdraw(1000)); //Should return true and subtract 1000 from the Balance
    System.out.println(testBank.getBalance()); //Should return 0.0
    System.out.println();
    System.out.println(testBank.withdraw(0)); //Should return true and subtract 0 from the Balance
    System.out.println(testBank.getBalance()); //Should return 0.0
    System.out.println();
    System.out.println(testBank.withdraw(-100)); //Should return false and subtract nothing from the balance
    System.out.println(testBank.getBalance()); //Should return 0.0
    System.out.println();
    System.out.println(testBank.toString()); //Should return 1200\t0.0
  }
}
