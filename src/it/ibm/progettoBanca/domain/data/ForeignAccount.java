package it.ibm.progettoBanca.domain.data;

public class ForeignAccount extends Account{
    private String countryCode;
    public ForeignAccount(double balance, String countryCode){
        super(balance);
        this.countryCode=countryCode;
    }
    public double foreignTransfer(double amount, ForeignAccount receiver){
        return 0;
    }
}
