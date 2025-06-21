using System;

namespace FactoryMethodPatternExample
{
    public class WordDocument : Document
    {
        public void Open()
        {
            Console.WriteLine("Opening a Word document.");
        }
    }
}
