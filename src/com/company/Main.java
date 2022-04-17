package com.company;

public class Main {

    public static void main(String[] args) {
        Credit credit1 = new Credit(1,10000, "20-02-2022", 0.1);
        Credit credit2 = new Credit(2,101000, "20-02-2022", 0.2);
        Credit credit3 = new Credit(3,230000, "20-02-2022", 0.03);
        Credit credit4 = new Credit(4,100000, "20-02-2022", 0.05);
        Credit credit5 = new Credit(5,20000, "20-02-2022", 0.01);
        int sum = credit1.getSum() + credit2.getSum() +credit3.getSum() + credit4.getSum() + credit5.getSum();
        int avgSum = sum/credit1.getCount();
        System.out.println(credit1.getCount());
        System.out.println(sum);
        System.out.println(avgSum);

    }
}
