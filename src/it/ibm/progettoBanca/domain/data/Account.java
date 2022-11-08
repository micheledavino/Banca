package it.ibm.progettoBanca.domain.data;

public class Account {
    public Account(){}
    public Account(double initialBalance){
        balance=initialBalance;
    }
    private double balance; //instance variable, field, attribute
    public void printBalance(){ //method
        System.out.println (balance);
    }
    public double getBalance(){
        return balance;
    }
    public double deposit(double amount){
        balance=balance+amount;
        return balance;
    }
    public double withdraw(double amount){
        balance=balance-amount;
        return balance;
    }
    public double transfer(double amount, Account receiver){
        withdraw(amount);
        receiver.deposit(amount);
        return balance;
        //balance=balance-amount;
        //receiver.balance=receiver.balance+amount;
    }
}

