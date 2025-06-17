// Main.java
package factories;

import documents.Document;
import documents.ExcelDocument;
import documents.PdfDocument;
import documents.WordDocument;

public class  FactoryMethodPatternExample{
    public static void main(String[] args) {
        // Create factories
        DocumentFactory wordFactory = new WordDocumentFactory();
        DocumentFactory pdfFactory = new PdfDocumentFactory();
        DocumentFactory excelFactory = new ExcelDocumentFactory();
        
        System.out.println("=== Testing Word Document ===");
        Document wordDoc = wordFactory.createDocument();
        wordDoc.open();
        if (wordDoc instanceof WordDocument) {
            ((WordDocument) wordDoc).editContent("Hello World!");
            System.out.println("Content: " + ((WordDocument) wordDoc).getContent());
        }
        wordDoc.close();
        
        System.out.println("\n=== Testing PDF Document ===");
        Document pdfDoc = pdfFactory.createDocument();
        pdfDoc.open();
        if (pdfDoc instanceof PdfDocument) {
            System.out.println("Is read-only: " + ((PdfDocument) pdfDoc).isReadOnly());
        }
        pdfDoc.close();
        
        System.out.println("\n=== Testing Excel Document ===");
        Document excelDoc = excelFactory.createDocument();
        excelDoc.open();
        if (excelDoc instanceof ExcelDocument) {
            ((ExcelDocument) excelDoc).addSheet("Data");
            ((ExcelDocument) excelDoc).updateCell(0, 0, "Total");
            System.out.println("Cell value: " + ((ExcelDocument) excelDoc).getCellValue(0, 0));
        }
        excelDoc.close();
        
        System.out.println("\n---- Testing document Factory Processing ----");
        System.out.println("Processing Word Document:");
        wordFactory.processDocument();
        
        System.out.println("\nProcessing PDF Document:");
        pdfFactory.processDocument();
        
        System.out.println("\nProcessing Excel Document:");
        excelFactory.processDocument();
    }
}
