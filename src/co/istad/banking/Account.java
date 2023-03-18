package co.istad.banking;

import java.util.Scanner;
public abstract class Account {
    static Scanner scanner = new Scanner(System.in);
    // state account number  balance
    // type account saving account , credit card using to buy anything
    // Concepts encapsulation + inheritance
    private Integer acountNumber ;
    private String name;
    private Double balance;


    public Account(Integer acountNumber,String name,Double balance){
        this.acountNumber=acountNumber;
        this.name=name;
        this.balance=balance;
    }
    public Account(){

    }
    public Integer getAcountNumber() {
        return acountNumber;
    }

    public void setAcountNumber(Integer acountNumber) {
        this.acountNumber = acountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
    protected void deposit(Double amount){
        if (amount<0){
            System.out.println("Are you kidding me ?");
            return ;
        }
        if(amount == 0){
            System.out.println("You cannot deposit");
            return ;
        }
        balance +=amount;
    }
    protected void withdrawal(Double amount){
        if (amount<0){
            System.out.println("Are you kidding me ?");
            return ;
        }
        if (amount > balance){
            System.out.println("Insufficient balance ");
            return ;
        }
        balance -= amount;
    }
    protected abstract void showBalance();

}