package factories;
import documents.Document;
import documents.PdfDocumentactivate;

public class PdfDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new PdfDocumentactivate();
    } 
    
}
