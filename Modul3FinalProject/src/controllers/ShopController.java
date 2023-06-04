package controllers;

import data.service.ShopService;
import view.AppView;

import java.util.Scanner;

public class ShopController {//отвечает за взаимодействие пользователя с магазином.
    final AppView view;
    public final ShopService shopService;

    public ShopController(AppView view, ShopService shopService) {
        this.view = view;
        this.shopService = shopService;
    }

    public void run() {//запускает магазин, позволяет переходить между окнами магазина.
        while (true) {
            view.action();
            if (view.children.size() == 0) break;
            view.displayChildren();
            Scanner sc = new Scanner(System.in);
            int value = sc.nextInt();
            if (value < 0 && value > view.children.size() + 1) {
                System.out.println("Wrong value!");
            } else if (value == view.children.size() + 1) {
                break;
            } else {
                new ShopController(view.children.get(value - 1), shopService).run();
            }

        }
    }

}
