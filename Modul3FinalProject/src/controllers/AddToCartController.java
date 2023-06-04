package controllers;

import data.service.ShopService;

import java.util.Scanner;

public class AddToCartController {//отвечает за возможность добавления карт айтема в корзину.
    public final ShopService shopService;

    public AddToCartController(ShopService shopService) {
        this.shopService = shopService;
    }

    public boolean addToCart() {//позволяет добавлять карт айтем в корзину.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product id: ");
        String productID = sc.nextLine();
        System.out.println("Enter count: ");
        int count = sc.nextInt();
        return shopService.addToCart(productID, count);
    }
}
