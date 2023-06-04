package data.service;

import data.data_source.cart.CartDataSource;
import data.data_source.catalog.CatalogDataSource;
import data.data_source.order.OrderDataSource;
import data.models.CartItem;
import data.models.Order;
import data.models.Product;

import java.util.ArrayList;

public class ShopService { //это сервис отвечающий за управление информации магазина.
    final CatalogDataSource catalogDataSource;
    final CartDataSource cartDataSource;
    final OrderDataSource orderDataSource;


    public ShopService(CatalogDataSource catalogDataSource, CartDataSource cartDataSource, OrderDataSource orderDataSource) {
        //Конструктор класса ShopService. Благодаря тому, что в нём находятся ссылки на абстрактные классы можно
        //использовать разные источники данных и их методы.
        this.catalogDataSource = catalogDataSource;
        this.cartDataSource = cartDataSource;
        this.orderDataSource = orderDataSource;
    }

    public ArrayList<Product> getCatalog() {
        return catalogDataSource.getCatalog();
    }
    public ArrayList<CartItem> getCart() {
        return cartDataSource.getCart();
    }
    public boolean addToCart(String productID, int count) {//метод отвечающий за добавление карт айтема в корзину.
        ArrayList<Product> catalog = getCatalog();
        for (Product p : catalog) {
            if (p.id.equals(productID) && p.available) {
                cartDataSource.addToCart(p, count);
                return true;
            }

        }
        return false;
    }
    public boolean createOrder(String name, String phone, String address, String paymentType, String deliveryTime) {
        //метод отвечающий за создание заказа.
        ArrayList<CartItem> cart = getCart();
        Order newOrder = new Order(name, phone, address, paymentType, deliveryTime, cart);
        orderDataSource.createOrder(newOrder);
        return true;
    }
}
