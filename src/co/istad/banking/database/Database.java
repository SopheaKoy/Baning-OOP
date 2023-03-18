package co.istad.banking.database;

import co.istad.banking.CreditCard;
import co.istad.banking.SavingAccount;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Database {

    public static CreditCard creditCard(){
        CreditCard creditCard = new CreditCard(22334455,"Koy Sophea",10000.0);
        creditCard.setPin(1234);
        creditCard.setLimitAmount(10000.0);
        creditCard.setThruData(LocalDate.now().plus(1, ChronoUnit.DAYS));
        return creditCard;
    }
    public static SavingAccount savingAccount(){
        SavingAccount savingAccount = new SavingAccount(11223344,"Seavmey",1000.0);
        return savingAccount;
    }
}
