using System;
namespace Lab2
{
    public class Run
    {
        public static void Main(String[] args)
        {
            Lab2Part2 part2 = new Lab2Part2();
            part2.ApplyCalculation();
        }
    }
    public class Lab2Part1 : Calculation
    {
        private static Lab2Part1 lab2p1 = new Lab2Part1();
        public void ApplyCalculation()
        {
            Input();
            for (x = a; x <= b+h; x += h)
            {
                Calculate();
                Output();
            }
        }
    }

    public class Calculation
    {
        public double x = 0.0;
        public double y = 0.0;
        public double h = 0.0;
        public double a = 0.0;
        public double b = 0.0;

        public void Input()
        {
            Console.Write("Input a=");
            a = double.Parse(Console.ReadLine());
            Console.Write("Input b=");
            b = double.Parse(Console.ReadLine());
            Console.Write("Input h=");
            h = double.Parse(Console.ReadLine());

        }

        public void Output()
        {
            Console.Write("x = {0} \t y = {1} \n", x, y);
        }

        public void Calculate()
        {
            if (x <= -0.7)
            {
                y = Math.Atan(Math.Pow(x, 3));
            }
            else if ((-0.7 < x) && (x <= -0.6))
            {
                y = Math.Tan(x + Math.Log(Math.Abs(x)));
            }
            else
            {
                y = 1 / Math.Tan(Math.Pow(x, 2));
            }
        }
    }

    public class Lab2Part2 : Calculation2
    {
        private static Lab2Part2 lab2p2 = new Lab2Part2();
        public void ApplyCalculation()
        {
            Input();
            for (x = a; x <= b+h; x += h)
            {
                Sum = 0;
                n = 1;
                Calculate();
                Output();
            }
        }
       
    }

    public class Calculation2
    {
        public double x = 0.0;
        public double y = 0.0;
        public double h = 0.0;
        public double a = 0.0;
        public double b = 0.0;
        public double d = 0.0;
        public double n = 1.0;
        public double Sum = 0.0;

        public void Input()
        {
            Console.Write("Input a=");
            a = double.Parse(Console.ReadLine());
            Console.Write("Input b=");
            b = double.Parse(Console.ReadLine());
            Console.Write("Input h=");
            h = double.Parse(Console.ReadLine());
            Console.Write("Input d = ");
            d = double.Parse(Console.ReadLine());
        }

        public void Calculate()
        {
            do
            {
                Sum += y;
                y = Math.Pow((x - 1), n) / (n * Math.Pow(x, n));
                n++;
            } while (Math.Abs(y) > d);
        }

        public void Output()
        {
            Console.Write("x = " + x + " \t y = " + y + " \t Sum =" + Sum + "\n");
        }

    }


}
