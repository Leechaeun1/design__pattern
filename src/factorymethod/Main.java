package factorymethod;

import factorymethod.framework.Factory;
import factorymethod.framework.Product;
import factorymethod.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("Youngjin Kim");
        Product card2 = factory.create("Heunmin Son");
        Product card3 = factory.create("Kane");

        // 표준 사용법
        card1.use();
        card2.use();
        card3.use();
    }
}
