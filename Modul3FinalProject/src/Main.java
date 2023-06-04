import controllers.ShopController;
import data.data_source.cart.CartDataSource;
import data.data_source.cart.MockCartDataSourceImpl;
import data.data_source.catalog.CatalogDataSource;
import data.data_source.catalog.MockCatalogDataSourceImpl;
import data.data_source.order.MockOrderDataSourceImpl;
import data.data_source.order.OrderDataSource;
import data.service.ShopService;
import view.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //  package controllers - отвечает за взаимодействие пользователя с магазином.
        //------------------------------
        //  package data:
        //  data_source - это источники данных нашего магазина (для каталога,
        //для корзины и для заказа). При желании мы можем в него добавить новый источник информации
        //и написать его вместо Mock... благодаря тому, что мы используем ссылку на абстрактный класс.
        //  models - это модели хранения самых базовых "кирпичиков" магазина.
        //  service - содержит ShopService, который отвечает за управление нашим магазином.
        //------------------------------
        //  package view - отвечает за отображение магазина.
        CatalogDataSource catalogDataSource = new MockCatalogDataSourceImpl();
        CartDataSource cartDataSource = new MockCartDataSourceImpl();
        OrderDataSource orderDataSource = new MockOrderDataSourceImpl();
        ShopService shopService = new ShopService(catalogDataSource, cartDataSource, orderDataSource);

        AddToCartView addToCartView = new AddToCartView(shopService);
        CartView cartView = new CartView(shopService);
        OrderView orderView = new OrderView(shopService);

        ArrayList<AppView> catalogChildren = new ArrayList<>();
        catalogChildren.add(addToCartView);
        CatalogView catalogView = new CatalogView(shopService, catalogChildren);

        ArrayList<AppView> mainChildren = new ArrayList<>();
        mainChildren.add(catalogView);
        mainChildren.add(cartView);
        mainChildren.add(orderView);
        MainView mainView = new MainView(mainChildren);

        new ShopController(mainView, shopService).run();
    }
}