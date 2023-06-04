package data.data_source.order;

import data.models.Order;

public abstract class OrderDataSource {
    //благодаря тому что OrderDataSource - абстрактный мы можем использовать несколько разных
    //источников данных для заказа.
    public abstract Order getOrder();

    public abstract void createOrder(Order order); //метод создания заказа.
}
