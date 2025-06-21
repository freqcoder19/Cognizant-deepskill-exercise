using System;

namespace FactoryMethodPatternExample
{
    class Program
    {
        static void Main(string[] args)
        {
            DocumentFactory factory;

            factory = new WordDocumentFactory();
            Document wordDoc = factory.CreateDocument();
            wordDoc.Open();

            factory = new PdfDocumentFactory();
            Document pdfDoc = factory.CreateDocument();
            pdfDoc.Open();

            factory = new ExcelDocumentFactory();
            Document excelDoc = factory.CreateDocument();
            excelDoc.Open();
        }
    }
}
