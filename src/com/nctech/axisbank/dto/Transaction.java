package com.nctech.axisbank.dto;

public class Transaction {
    private Integer id;
    private Long fromAccountNo;
    private Long toAccountNo;
    private Double amount;

    public Transaction(Integer id, Long fromAccountNo, Long toAccountNo, Double amount) {
        this.id = id;
        this.fromAccountNo = fromAccountNo;
        this.toAccountNo = toAccountNo;
        this.amount = amount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getFromAccountNo() {
        return fromAccountNo;
    }

    public void setFromAccountNo(Long fromAccountNo) {
        this.fromAccountNo = fromAccountNo;
    }

    public Long getToAccountNo() {
        return toAccountNo;
    }

    public void setToAccountNo(Long toAccountNo) {
        this.toAccountNo = toAccountNo;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", fromAccountNo=" + fromAccountNo +
                ", toAccountNo=" + toAccountNo +
                ", amount=" + amount +
                '}';
    }
}
