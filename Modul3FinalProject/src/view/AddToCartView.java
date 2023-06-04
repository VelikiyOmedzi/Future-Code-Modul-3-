package view;

import controllers.AddToCartController;
import data.service.ShopService;

import java.util.ArrayList;

public class AddToCartView extends AppView {//класс, отвечающий за отображение добавления карт айтема в корзину.
    final ShopService shopService;

    public AddToCartView(ShopService shopService) {
        super("Add to cart", new ArrayList<>());
        this.shopService = shopService;
    }

    @Override
    public void action() {//выводит информацию о добавлении заказа.
        AddToCartController addToCartController = new AddToCartController(shopService);
            if (addToCartController.addToCart()) {
                System.out.println("Success");
            } else {
                System.out.println("Failure");
            }
    }
}
