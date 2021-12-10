package task3.product;

import java.util.Arrays;

public class Product {
    protected String name;
    protected int value;
    protected String[] composition;
    public Product(String name, int value){
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String[] getComposition() {
        return composition;
    }

    public void setComposition(String[] composition) {
        this.composition = composition;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", value=" + value +
                ", composition=" + Arrays.toString(composition) +
                '}';
    }
}
