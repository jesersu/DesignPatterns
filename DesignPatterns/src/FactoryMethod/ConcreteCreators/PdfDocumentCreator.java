package FactoryMethod.ConcreteCreators;

import FactoryMethod.ConcreteProduct.PdfDocument;
import FactoryMethod.Creator.DocumentCreator;
import FactoryMethod.Product.Document;

/**
 * Concrete CREATORS
 * **/
public class PdfDocumentCreator extends DocumentCreator {
    @Override
    public Document createDocument() {
        return new PdfDocument();
    }

}
