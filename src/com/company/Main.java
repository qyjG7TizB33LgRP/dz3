package com.company;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount();
        bankAccount.deposit(20000);
        while (true){
            System.out.println("Ваш баланс  = " + bankAccount.getAmount());
            try {
                System.out.println("Снято  " + bankAccount.withDraw(6000) + " ваш остаток =" + bankAccount.getAmount());
            } catch (LimitExcption limitExcption) {
                System.out.println(limitExcption.getMessage() + " остаток  = " + limitExcption.getRemainingAmount());
                System.out.println("Ваш баланс = " + limitExcption.getRemainingAmount());
                try {
                    System.out.println( "Снято  "+ bankAccount.withDraw((int) limitExcption.getRemainingAmount()) + " теперь твой счет = " + bankAccount.getAmount());
                    break;
                } catch (LimitExcption limitExcption1) {
                    limitExcption1.printStackTrace();
                }
            }
        }
    }


}