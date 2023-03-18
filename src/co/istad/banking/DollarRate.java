package co.istad.banking;

public class DollarRate implements Interest{
    @Override
    public Double calcuate(Double amount) {
        return 0.06*amount;
    }
}
