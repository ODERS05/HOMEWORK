package com.company;

public class Generic<F,S>{
    private F objectF;
    private S objectS;

    public Generic(){
    }
    public Generic(F objectF, S objectS){
        this.objectF = objectF;
        this.objectS = objectS;
    }
    public String getObjectF(){
        return "Class name: " + objectF.getClass().getName() + "hashCode" + objectF.hashCode();
    }
    public String getObjectS(){
        return "Class name: " + objectS.getClass().getName() + "hashCode" + objectS.hashCode();
    }
    public String getValueObjectF(){
        return objectF.toString();
    }
    public String getValueObjectS(){
        return objectS.toString();
    }
    public boolean check(){
        if (objectF.getClass().getName().equals(objectS.getClass().getName())){
            if (objectF.hashCode() == objectS.hashCode()){
                return true;
            }
        }
        return false;
    }
}
