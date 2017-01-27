public class OverloadConstructor
{
   private int balance;

   public OverloadConstructor() {
      balance = 1000;
   }

   public OverloadConstructor(int balance) {
      this();
      this.balance += balance;
   }

   public int getbalance() {
	   return balance;
   }
   
   public void setbalance(int balance) {
	   this.balance = balance;
   }
   
   public static void main(String args[]) {
       OverloadConstructor example = new OverloadConstructor(500);
       System.out.println(example.getbalance());
    }
}
