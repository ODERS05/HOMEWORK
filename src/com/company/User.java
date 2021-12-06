package com.company;

public class User {
    private String firstName;
    private String login;
    private int age;
    private String password;
    private boolean blockedOrNotblocked;
    public boolean logic(boolean answer){
        if (answer) System.out.println("Welcome!");
        else System.out.println("Try again");
        return answer;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int inputAge) {
        if (inputAge < 0) age = 0;
        else age = inputAge;
    }

    public String getPassword(String password) {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isBlockedOrNotblocked() {
        return blockedOrNotblocked;
    }

    public void setBlockedOrNotblocked(boolean blockedOrNotblocked) {
        this.blockedOrNotblocked = blockedOrNotblocked;
    }

    @Override
    public String toString(){
        return firstName + " " + age + " " + login + " " + password + " ";
    }
}
