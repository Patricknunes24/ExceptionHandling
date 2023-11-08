package model.entitites;

import model.exception.MainException;

public class AccountBank {
    private Integer number;
    private String holder;
    private double balance;
    private double withdrawLimit;

    public AccountBank() {
    }

    public AccountBank(Integer number, String holder, double balance, double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(double depositAmount){
        balance = balance + depositAmount;
    }

    public void withdraw(double withdrawAmount){
        if (withdrawAmount <= withdrawLimit){
            balance = balance - withdrawAmount;
        }
        else {
            throw new MainException("VOCÊ NÃO POSSUI TODO ESSE LIMITE PARA SAQUE!");
        }
    }
}
