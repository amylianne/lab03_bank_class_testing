public class Runner {
    public static void main(String[] args) {
         BankAccount amy = new BankAccount("Amy","Wynn","030499",3457342,200);

        // amy.setBalance(amy.getBalance()+20);
        System.out.println ("Your balance after deposit is:");
        System.out.println(amy.deposit(20));

       //  amy.setBalance(amy.getBalance()-100);
         System.out.println ("Your balance after withdrawal is:");
         System.out.println(amy.withdrawal(100));

         //interest rate
        float b,  r, t, si; //starting balance, interest rate,  time,  simple interest
        b = amy.getBalance();
        r = 2; // not sure how to do this if it's a decimal ???????
        t= 1;
        si = (b*r*t)/100;
        System.out.println("Your interest this year is £"+si);

        float endBalance = amy.getBalance()  + si;
        System.out.println("Ending balance is £"+endBalance);

        //extension
    }
}
