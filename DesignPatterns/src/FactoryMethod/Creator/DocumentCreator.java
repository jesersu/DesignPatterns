package FactoryMethod.Creator;

import FactoryMethod.Product.Document;

/**
 * Create de CREATOR (Factory) abstract Class
 * */
public abstract class DocumentCreator {
    // The factory method
    public abstract Document createDocument();

    // Other operations that work with documents
    public void newDocument() {
        Document doc = createDocument();
        doc.open();
        doc.save();
        doc.close();
    }
}
