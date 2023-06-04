package data.data_source.catalog;

import data.models.Product;

import java.util.ArrayList;

public class MockCatalogDataSourceImpl extends CatalogDataSource {
    //шуточный источник данных для каталога.
    @Override
    public ArrayList<Product> getCatalog() {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("1", "Tetris",  "The best tetris in the world", 1000, true));
        products.add(new Product("2", "Tetris 2.0",  "Better then tetris", 1999, true));
        products.add(new Product("3", "Golem I0919",  "The standart golem", 200000, false));
        products.add(new Product("4", "SmartPhone",  "SmartPhone", 25000, true));
        return products;
    }
}
