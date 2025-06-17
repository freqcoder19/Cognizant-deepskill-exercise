package factories;


import documents.Document;
import documents.WordDocumentactivate;

public class WordDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new WordDocumentactivate();
    }
    
}
