package task3.product;

public class Milk extends Product {
    private String expirationDate;

    public Milk(String name, int value) {
        super(name, value);
    }

    public String getExpirationDate(){
        return expirationDate;
    }
    public void setExpirationDate(String expirationDate){
        this.expirationDate = expirationDate;
    }
    @Override
    public String toString(){
        return expirationDate;
    }
}
