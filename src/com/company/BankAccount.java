package com.company;

public class BankAccount {
    private double  amount;
    public void  deposit(double sum ){
        amount=amount+sum;
    }
    public  int   withDraw(int sum) throws LimitExcption {
        if (amount < sum){
            throw new LimitExcption("ВАШ БАЛАНС НЕДОСТАТОЧНА ДЕНЕГ ",getAmount() );
        }
        amount=amount-sum;
        return  sum;
    }
    public double getAmount() {
        return amount;
    }
}