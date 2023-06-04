package view;

import data.models.Product;
import data.service.ShopService;

import java.util.ArrayList;

public class CatalogView extends AppView {//класс, отвечающий за отображение каталога.
    final ShopService shopService;
    public CatalogView(ShopService shopService, ArrayList<AppView> children) {
        super("Catalog", children);
        this.shopService = shopService;
    }

    @Override
    public void action() {//выводит информацию о каталоге.
        ArrayList<Product> catalog = shopService.getCatalog();
        for (Product p : catalog) {
            System.out.println(p.id + " " + p.title + " " + p.price);
        }
        System.out.println();
    }
}
