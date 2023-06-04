package view;

import controllers.OrderController;
import data.service.ShopService;

import java.util.ArrayList;

public class OrderView extends AppView { //класс, отвечающий за отображение заказа.
    public final ShopService shopService;
    public OrderView(ShopService shopService) {
        super("Ordering", new ArrayList<>());
        this.shopService = shopService;
    }

    @Override
    public void action() {//выводит информацию о заказе.
        OrderController orderController = new OrderController(shopService);
        if (orderController.createOrder()) {
            System.out.println("Successful ordering");
        } else {
            System.out.println("Ordering failed!");
        }
    }
}
