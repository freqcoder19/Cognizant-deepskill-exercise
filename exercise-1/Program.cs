// See https://aka.ms/new-console-template for more information
using System;

namespace SingletonPatternExample
{
    class Program
    {
        static void Main(string[] args)
        {
            Logger logger1 = Logger.GetInstance();
            logger1.Log("This is the first message.");

            Logger logger2 = Logger.GetInstance();
            logger2.Log("This is the second message.");

            // Check if both references are the same
            Console.WriteLine("Are both logger instances the same? " + (logger1 == logger2));
        }
    }
}
