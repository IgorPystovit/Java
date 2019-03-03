using System;

namespace Lab1
{
    class Executor
    {
        static void Main(string[] args)
        {
            Lab1 lab = new Lab1();
            lab.Scan();
            lab.Calculation();
            lab.Output();
        }
    }

    class Lab1
    {
        private double x = 0.0;
        private double result = 0.0;
        private double y = 0.0;

        //reading values of variables x,y from a keyboard
        public void Scan()
        {
            Console.WriteLine("Input the value of x = ");
            x = Convert.ToDouble(Console.ReadLine());
            Console.WriteLine("Input the value of y = ");
            y = Convert.ToDouble(Console.ReadLine());
        }
        //@return void

        //Calculating result with given values
        public void Calculation()
        {
            //introducing local
            //double localCalc = (142 * (y - x)) / 16.32;
            result = Math.Sqrt((x * y * y) + (y * Math.Sin(x)) + (142 * x * x * y)) + Math.Tan(x * y) - (142 * (y - x)) / 16.32;
        }
        //@return void

        //Outputing result
        public void Output()
        {
            Console.WriteLine("Result = " + result);
        }
        //@return void
    }
}
