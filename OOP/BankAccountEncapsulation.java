package OOP;
/*
Encapsulation of "balance" field -> Private with getter and setter
Why? => To protect the internal state of the object and allow validation or logic before changing the data.
 */
public class BankAccountEncapsulation {
    private double balance;

    public BankAccountEncapsulation(double initialDeposit){
        this.balance = initialDeposit;
    }

    public double getBalance() {
        return balance;
    }

    public boolean deposit(double depositAmt){
        if(depositAmt>0){
            this.balance+=depositAmt;
            return true;
        }
        return false;
    }
}

class MainClass{
    public static void main(String[] args) {
        BankAccountEncapsulation myBankAccount = new BankAccountEncapsulation(50000);
        System.out.println(myBankAccount.getBalance());
        myBankAccount.deposit(2000);
        System.out.println(myBankAccount.getBalance());
    }
}
