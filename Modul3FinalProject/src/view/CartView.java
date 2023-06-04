package view;

import data.models.CartItem;
import data.service.ShopService;

import java.util.ArrayList;
public class CartView extends AppView {//класс, отвечающий за отображение корзины.
    final ShopService shopService;
    public CartView(ShopService shopService) {
        super("Cart", new ArrayList<>());
        this.shopService = shopService;
    }

    @Override
    public void action() {//выводит информацию о корзине.
        ArrayList<CartItem> cart = shopService.getCart();
        for (CartItem item : cart) {
            System.out.println(item.count + " " + item.product.title);
        }
        System.out.println();
    }
}
