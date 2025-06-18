import factories.DocumentFactory;
import factories.WordDocumentFactory;
import factories.PdfDocumentFactory;
import factories.ExcelDocumentFactory;

public class FactoryMethodPattern {
    public static void main(String[] args) {
        DocumentFactory wordFactory = new WordDocumentFactory();
        wordFactory.processDocument();

        System.out.println();

        DocumentFactory pdfFactory = new PdfDocumentFactory();
        pdfFactory.processDocument();

        System.out.println();

        DocumentFactory excelFactory = new ExcelDocumentFactory();
        excelFactory.processDocument();
    }
}

