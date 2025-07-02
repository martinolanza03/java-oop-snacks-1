package com.bank;

public class AccountBank {
    public int numberBank;
    public float balance;

    public AccountBank(int numberBank) {
        this.numberBank = numberBank;
        this.balance = 0;
    }

    public float getBalance() {
        return this.balance;
    }

    public void setBalance(float addMoney) {
        this.balance = balance + addMoney;
    }
}
