package factorymethod.idcard;

import factorymethod.framework.Factory;
import factorymethod.framework.Product;


public class IDCardFactory extends Factory {
    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected Product registerProduct(Product product) {
        System.out.println(product + "을 등록했습니다.");
        return product;
    }
}
