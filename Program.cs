using System;
namespace RandomApp
{
    public class Lab2Exe
    {

    }

    public class Part1Exe : Calculation
    {
        private static Part1Exe executiveObject = new Part1Exe();

        public void ApplyCalculation()
        {
            Input();
            for (x = a; x <= b+h; x += h)
            {
                Calculate();
                TabulativeOutput();
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

        public virtual void Input()
        {
            Console.Write("Input a=");
            a = double.Parse(Console.ReadLine());
            Console.Write("Input b=");
            b = double.Parse(Console.ReadLine());
            Console.Write("Input h=");
            h = double.Parse(Console.ReadLine());

        }

        public virtual void TabulativeOutput()
        {
            Console.Write("x = {0} \t y = {1} \n", x, y);
        }

        public virtual void Calculate()
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

    public class Part2Exe : Calculation2
    {
        private static Part2Exe executiveObject = new Part2Exe();

        public void ApplyCalculation()
        {
            Input();
            for (x = a; x <= b+h; x += h)
            {
                Sum = 0;
                n = 1;
                Calculate();
                TabulativeOutput();
            }
       
         }
    }

    public class Calculation2 : Calculation
    {
        public double d = 0.0;
        public double n = 1.0;
        public double Sum = 0.0;

        public override void  Input()
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

        public override void Calculate()
        {
            do
            {
                Sum += y;
                y = Math.Pow((x - 1), n) / (n * Math.Pow(x, n));
                n++;
            } while (Math.Abs(y) > d);
        }

        public override void TabulativeOutput()
        {
            Console.Write("x = " + x + " \t y = " + y + " \t Sum =" + Sum + "\n");
        }

    }
   
}