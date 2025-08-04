package FactoryMethod;

import FactoryMethod.ConcreteCreators.ExcelDocumentCreator;
import FactoryMethod.ConcreteCreators.PdfDocumentCreator;
import FactoryMethod.ConcreteCreators.WordDocumentCreator;
import FactoryMethod.Creator.DocumentCreator;

public class DocumentApplication {
    public static void main (String[] args){
        DocumentCreator pdfCreator = new PdfDocumentCreator();
        pdfCreator.newDocument();

        DocumentCreator wordCreator = new WordDocumentCreator();
        wordCreator.newDocument();

        DocumentCreator excelCreator = new ExcelDocumentCreator();
        excelCreator.newDocument();
    }
}
