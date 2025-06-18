package factories;

import documents.Document;
import documents.WordDocument; // ✅ Correct class

public class WordDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new WordDocument(); // ✅ Correct instance
    }
}

