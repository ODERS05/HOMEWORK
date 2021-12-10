package task2;

import task2.product.Milk;

public class Main {
    public static void main(String[] args) {
        Milk Milk = new Milk();
        // Tea не создался потому что у него модификатор default  который работает только в своем package  или в своем классе
        // А Milk вызвался потому что у него публичный модификатор который работает везде и вызвать его можно во всез классах.
    }
}
