public class Tester{
  public static void main(String[] args){
    BankAccount testBank = new BankAccount(1200, "password");
    System.out.println(testBank.getBalance()); //Should print out 0.0
    System.out.println();
    System.out.println(testBank.getAccountID()); //Should print out 1200
    testBank.setPassword("newpassword"); //Should change password from "password" to "newpassword"
  }
}
