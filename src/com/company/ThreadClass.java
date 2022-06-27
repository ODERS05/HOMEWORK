package com.company;

public class ThreadClass implements Runnable {
    String mathOperation;
    static Integer num = 2;

    public ThreadClass(String mathOperation) {
        this.mathOperation = mathOperation;
    }
    public ThreadClass() {
    }

    @Override
    public void run() {
        if (mathOperation.equals("*")) {
            num = num * 2;
        } else if (mathOperation.equals("/")) {
            num = num / 2;
        } else if (mathOperation.equals("+")) {
            num = num + 2;
        } else {
            num = num - 2;
        }
        System.out.println(num);
    }

    public String getMathOperation() {
        return mathOperation;
    }

    public void setMathOperation(String mathOperation) {
        this.mathOperation = mathOperation;
    }

    public static Integer getNum() {
        return num;
    }

    public static void setNum(Integer num) {
        ThreadClass.num = num;
    }
}
