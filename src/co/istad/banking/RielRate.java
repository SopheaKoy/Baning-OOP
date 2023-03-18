package co.istad.banking;

public class RielRate implements Interest{
    @Override
    public Double calcuate(Double amount) {
        return 0.09*amount;
    }
}
