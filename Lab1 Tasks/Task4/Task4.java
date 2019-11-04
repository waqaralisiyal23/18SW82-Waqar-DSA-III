//Just constructing the Classes using class Diagrams represented thorugh UML
class Account{

    //required instance variable 
    protected double balance;

    //Deposit method
    public double deposit(int amount){
        //Implementation is not required
    }
    public double withdraw(int amount){
        //Implementation is not required
    }
}
class SavingAccount extends Account{

    //Required instance variables
    private double defaultInterestRate=2.5;
    private double interestRate;
    public void setDefaultInterestRate(int rate){
        //Implementation is not required
    }
    public void applyMonthlyInterest(){
        //Implementation is not required
    }
}
public class Task4{
    public static void main(String[]args){
        
    }
}