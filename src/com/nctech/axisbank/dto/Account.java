package com.nctech.axisbank.dto;

public class Account {
    private Integer id;
    private String name;
    private Long accountNumber;
    private Double amount;

    public Account (Integer id, String name, Long accountNumber, Double amount) {
        this.id = id;
        this.name = name;
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", accountNumber=" + accountNumber +
                ", amount=" + amount +
                '}';
    }
}
