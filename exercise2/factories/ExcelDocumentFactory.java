package factories;

import documents.Document;
import documents.ExcelDocumentactivate;

public class ExcelDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new ExcelDocumentactivate();
    }
}
