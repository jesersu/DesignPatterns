package FactoryMethod.ConcreteCreators;

import FactoryMethod.ConcreteProduct.WordDocument;
import FactoryMethod.Creator.DocumentCreator;
import FactoryMethod.Product.Document;

/**
 * Concrete CREATORS
 * **/
public class WordDocumentCreator extends DocumentCreator {
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}