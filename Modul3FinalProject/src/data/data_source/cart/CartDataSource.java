package data.data_source.cart;

import data.models.CartItem;
import data.models.Product;

import java.util.ArrayList;

public abstract class CartDataSource {
    //благодаря тому что CartDataSource- абстрактный мы можем использовать несколько разных
    //источников данных для корзины.
    public abstract ArrayList<CartItem> getCart();
    public abstract void addToCart(Product product, int count); //метод добавления карт айтема в корзину.
}
