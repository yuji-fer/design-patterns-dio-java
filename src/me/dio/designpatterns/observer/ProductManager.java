package me.dio.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    List<IProductListener> productListeners = new ArrayList<IProductListener>();

    public void subscribe(IProductListener iProductListener) {
        productListeners.add(iProductListener);
    }

    public void unsubscribe(IProductListener iProductListener) {
        productListeners.remove(iProductListener);
    }

    public void notify(String message) {
        productListeners.forEach(p -> p.update(message));
    }
}
