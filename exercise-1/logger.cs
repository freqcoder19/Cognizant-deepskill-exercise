using System;

namespace SingletonPatternExample
{
    public class Logger
    {
        // Step 1: Private static instance
        private static Logger _instance;

        // Step 2: Private constructor
        private Logger()
        {
            Console.WriteLine("Logger instance created.");
        }

        public static Logger GetInstance()
        {
            if (_instance == null)
            {
                _instance = new Logger();
            }
            return _instance;
        }

        // Example logging method
        public void Log(string message)
        {
            Console.WriteLine($"[LOG] {message}");
        }
    }
}
