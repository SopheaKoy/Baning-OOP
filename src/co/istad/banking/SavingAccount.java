package co.istad.banking;

public class SavingAccount extends Account {
    private Double interest;
    private Interest interestI;

    public void setInterestI(Interest interestI) {
        this.interestI = interestI;
    }

    public void setInterest(Double interest) {
        this.interest = interest;
    }

    public Double getInterest() {
        return interest;
    }

    public Interest getInterestI() {
        return interestI;
    }

    public SavingAccount(Integer acountNumber, String name, Double balance){
        super(acountNumber, name, balance);
    }
    public void calculateInterest(){
        interest = interestI.calcuate(getBalance());
    }
    public SavingAccount(){}
    @Override
    protected void showBalance() {
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("Saving Act NO  : "+getAcountNumber());
        System.out.println("Saving Name    : "+getName());
        System.out.println("Balance : $"+getBalance());
        System.out.println("Interest: "+interest);
        System.out.println("#################################################");
    }

}
