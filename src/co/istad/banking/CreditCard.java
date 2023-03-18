package co.istad.banking;

import co.istad.banking.database.Database;
import java.time.LocalDate;
import java.util.Objects;

public class CreditCard extends Account {

    private Integer pin;
    private Double limitAmount;
    private LocalDate thruData;

    public CreditCard(){}
    public CreditCard(Integer acountNumber,String name,Double balance){
        super(acountNumber, name, balance);
    }

    public Integer getPin() {
        return pin;
    }

    public void setPin(Integer pin) {
        this.pin = pin;
    }

    public Double getLimitAmount() {
        return limitAmount;
    }

    public void setLimitAmount(Double limitAmount) {
        this.limitAmount = limitAmount;
    }
    public LocalDate getThruData() {
        return thruData;
    }
    public void setThruData(LocalDate thruData) {
        this.thruData = thruData;
    }
    @Override
    protected  final void deposit(Double amount) {
        if (isExpired(thruData)){
            System.out.println("Card is expired...!");
            return ;
        }
        super.deposit(amount);
    }

    @Override
    protected final void withdrawal(Double amount) {
        if (isExpired(thruData)){
            System.out.println("Card is expired....!");
            return;
        }
        if (amount>limitAmount){
            System.out.println("Over the limit amount...!");
        }
        super.withdrawal(amount);
    }

    @Override
    protected void showBalance() {
        System.out.println("============ Account Information =============");
        System.out.println("Act NO  : "+getAcountNumber());
        System.out.println("Name    : "+getName());
        System.out.println("Balance : $"+getBalance());
        System.out.println("Pin     : "+pin);
        System.out.println("Thru Date   : "+thruData);
        System.out.println("LimitAmount : $"+limitAmount);
        System.out.println("===============================================");
    }
    private boolean isExpired(LocalDate date){
        LocalDate now = LocalDate.now();
        return now.isAfter(date);
    }
    protected final void withdrawal(){
        withdrawal(getBalance());
    }

}
