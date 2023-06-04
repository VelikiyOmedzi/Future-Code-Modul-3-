package data.data_source.catalog;

import data.models.Product;

import java.util.ArrayList;

public abstract class CatalogDataSource {
    //благодаря тому что CatalogDataSource - абстрактный мы можем использовать несколько разных
    //источников данных для каталога.
    public abstract ArrayList<Product> getCatalog();
}
