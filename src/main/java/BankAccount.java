public class BankAccount {

    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private int accountNumber;
    private int balance;
    private int deposit;
    private int withdrawal;


    public BankAccount(String firstName, String lastName, String dateOfBirth, int accountNumber, int balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    //getter and setters
    public String getFirstName(){
        return this.firstName;
    }
    public void setFirstName(String newFirstName){
        this.firstName = newFirstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public void setLastName(String newLastname){
        this.firstName = newLastname;
    }
    public String getDateOfBirth(){
        return this.dateOfBirth;
    }
    public void setDateOfBirth(String newDateOfBirth){
        this.dateOfBirth = newDateOfBirth;
    }
    public int getAccountNumber(){
        return this.accountNumber;
    }
    public void setAccountNumber(int newAccountNumber){
        this.accountNumber = newAccountNumber;
    }
    public int getBalance(){
        return this.balance;
    }
    public void setBalance(int newBalance){
        this.balance = newBalance;
    }
//deposit method
    public int deposit(int b) {
        this.deposit = b;
        return balance + b;
    }
//    public String deposit2(){
//        return "Your total balance after deposit is £"+ balance;
//    }

//withdrawal method
    public int withdrawal(int a) {
        this.withdrawal = a;
        return balance - a;
    }

//interest method
    public int interest() {
        return balance;
    }

}
