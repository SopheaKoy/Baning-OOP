package co.istad.banking;

import co.istad.banking.database.Database;

public class BankProgram {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard();
        creditCard.setAcountNumber(22334455);
        creditCard.setPin(1234);
        // Check credit card exists or not
        if(Database.creditCard().getAcountNumber().equals(creditCard.getAcountNumber())){
            if (Database.creditCard().getPin().equals(creditCard.getPin())){
                creditCard = Database.creditCard();
            }else{
                System.out.println("Correct Pin ! Pleas enter again....!");
            }
        }else{
            System.out.println("Invalid credit card...!");
        }
        creditCard.deposit(1000.0);
        creditCard.showBalance();
        SavingAccount savingAccount = new SavingAccount();
        savingAccount.setName("Seavmey");
        savingAccount.setAcountNumber(11223344);
        System.out.println("            Interest DollarRate       ");
        SavingAccount saving = Database.savingAccount();
        saving.setInterestI(new DollarRate());
        saving.calculateInterest();
        saving.showBalance();
        System.out.println("                Interest RielRate       ");
        saving.setInterestI(new RielRate());
        saving.calculateInterest();
        saving.showBalance();

    }
}
