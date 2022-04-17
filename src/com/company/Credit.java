package com.company;

public class Credit {
    private  int id;
    private int sum;
    private String period;
    private double interestRate;
    private static int count;
    public Credit(int id, int sum, String period, double interestRate) {
        this.count++;
        this.id = id;
        this.sum = sum;
        this.period = period;
        this.interestRate = interestRate;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Credit.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public String toString() {
        return "Credit{" +
                "id=" + id +
                ", sum=" + sum +
                ", period='" + period + '\'' +
                ", interestRate=" + interestRate +
                '}';
    }
}
