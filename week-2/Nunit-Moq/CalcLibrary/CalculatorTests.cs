using NUnit.Framework;
using CalcLibrary;
using System;

namespace CalcLibrary.Tests
{
    [TestFixture]
    public class CalculatorTests
    {
        private SimpleCalculator _calculator;

        [SetUp]
        public void Setup()
        {
            _calculator = new SimpleCalculator();
        }

        [TearDown]
        public void Cleanup()
        {
            _calculator.Dispose();
        }

        // Addition Tests
        [TestCase(5, 3, 8)]
        [TestCase(-5, -3, -8)]
        [TestCase(2.5, 3.5, 6)]
        public void Addition_ValidInputs_ReturnsCorrectResult(double a, double b, double expected)
        {
            var result = _calculator.Addition(a, b);
            Assert.That(result, Is.EqualTo(expected));
        }

        // Subtraction Tests
        [TestCase(10, 7, 3)]
        [TestCase(-5, -3, -2)]
        public void Subtraction_ValidInputs_ReturnsCorrectResult(double a, double b, double expected)
        {
            var result = _calculator.Subtraction(a, b);
            Assert.That(result, Is.EqualTo(expected));
        }

        // Division Tests
        [Test]
        public void Division_ByZero_ThrowsException()
        {
            Assert.Throws<DivideByZeroException>(() => _calculator.Division(10, 0));
        }
        [Test, CancelAfter(100), Ignore("For demonstration only")]
        public void Addition_PerformanceTest()
        {
            for (int i = 0; i < 100000; i++)
            {
                _calculator.Addition(1, 1);
            }
        }
    }
}
