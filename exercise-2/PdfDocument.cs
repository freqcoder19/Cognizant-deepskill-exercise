using System;

namespace FactoryMethodPatternExample
{
    public class PdfDocument : Document
    {
        public void Open()
        {
            Console.WriteLine("Opening a PDF document.");
        }
    }
}
