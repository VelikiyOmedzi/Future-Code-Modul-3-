package controllers;

import data.service.ShopService;

import java.util.Scanner;

public class OrderController {//отвечает за возможность создания заказа.
    public final ShopService shopService;

    public OrderController(ShopService shopService) {
        this.shopService = shopService;
    }
    public boolean createOrder() {//позволяет создавать заказ.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Entre your phone: ");
        String phone = sc.nextLine();
        System.out.println("Entre your address: ");
        String address = sc.nextLine();
        System.out.println("Entre your payment type: ");
        String paymentType = sc.nextLine();
        System.out.println("Entre your delivery time: ");
        String deliveryTime = sc.nextLine();
        return shopService.createOrder(name, phone, address, paymentType, deliveryTime);
    }
}
