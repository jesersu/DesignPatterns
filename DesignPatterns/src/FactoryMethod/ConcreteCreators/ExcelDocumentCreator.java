package FactoryMethod.ConcreteCreators;

import FactoryMethod.ConcreteProduct.ExcelDocument;
import FactoryMethod.Creator.DocumentCreator;
import FactoryMethod.Product.Document;

public class ExcelDocumentCreator extends DocumentCreator {
    @Override
    public Document createDocument() {
        return new ExcelDocument();
    }
}
