package prototype.framework;

import java.util.HashMap;
import java.util.Map;

public class Manager {
    private Map<String, Product> showcase = new HashMap<>();

    public void register(String name, Product prototype) { // 원본 등록
        showcase.put(name, prototype);
    }

    public Product create(String prototypeName) {
        Product p = showcase.get(prototypeName);
        return p.createCopy();
    }
}
