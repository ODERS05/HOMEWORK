package task3;

import task3.product.Milk;
import task3.product.Product;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("Веселый молочник",45);
        Milk milk = new Milk("12324",1234);
        System.out.println(product);
    }
}
