package FactoryMethod.ConcreteProduct;

import FactoryMethod.Product.Document;

public class ExcelDocument implements Document {

    @Override
    public void open() {
        System.out.print("Excel abrir");
    }

    @Override
    public void save() {
        System.out.print("Excel save");
    }

    @Override
    public void close() {
        System.out.print("Excel close");
    }
}
