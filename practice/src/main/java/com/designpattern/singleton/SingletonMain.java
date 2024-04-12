package com.designpattern.singleton;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SingletonMain {
    public static void main(String[] args) {
        ShoppingCartManager cart = ShoppingCartManager.getInstance();
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String itemName = scanner.next();
            int quantity = scanner.nextInt();

            // 获取购物车实例并添加商品
            cart.addToCart(itemName, quantity);
        }

        scanner.close();

        // 输出购物车内容
        cart.viewCart();
    }
}

class ShoppingCartManager {

    // 私有建構子
    private ShoppingCartManager() {

    }

    // 私有靜態實體
    private static final ShoppingCartManager instance = new ShoppingCartManager();

    private Map<String, Integer> items = new HashMap<String, Integer>();

    // 公開靜態的取得實體方法
    public static ShoppingCartManager getInstance() {
        return instance;
    }

    public void viewCart() {
        items.keySet().forEach((key) -> {

            System.out.println(key + " " + items.get(key));
        });

    }

    public void addToCart(String itemName, int quantity) {
        items.put(itemName, items.getOrDefault(itemName, 0) + quantity);
    }

}