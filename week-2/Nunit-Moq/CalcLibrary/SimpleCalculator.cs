namespace CalcLibrary
{
    public class SimpleCalculator
    {
        public double Addition(double a, double b) => a + b;
        public double Subtraction(double a, double b) => a - b;
        public double Multiplication(double a, double b) => a * b;
        public double Division(double a, double b) => b != 0 ? a / b : throw new DivideByZeroException();
    }
}
