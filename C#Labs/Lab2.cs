using System;
namespace RandomApp
{
    public class Lab2
    {
        public static void Apply(FunctionHandler fh)
        {
            fh.Executioner();
        }
        public static void Main(String[] args)
        {
            Apply(new Function1());
        }
    }

    public abstract class FunctionHandler
    {
        public abstract void CalculateFunction();
        public abstract void DataScanner();
        public abstract void Executioner();
        public void TabulateFunction(Object value)
        {
            Console.Write(value+"\t");
        }
    }

    public class Function1 : FunctionHandler
    {
        private double ArgValue = 0.0;
        private double Step = 0.0;
        private double Border = 0.0;

        public Function1() => DataScanner();

        public override void DataScanner()
        {
            Console.WriteLine("Input value of argument");
            ArgValue = Convert.ToDouble(Console.ReadLine());

            Console.WriteLine("Input value of step");
            Step = Convert.ToDouble(Console.ReadLine());

            Console.WriteLine("Input value of borders");
            Console.WriteLine("Border");
            Border = Convert.ToDouble(Console.ReadLine());
        }
        public override void CalculateFunction()
        {
            for (;ArgValue < (Border + Step); ArgValue += Step)
            {
                TabulateFunction(SwitchFunction());
            }
        }

        private double SwitchFunction()
        {
            double iTemp = 0.0;
            if (ArgValue <= -0.7)
            {
                iTemp = Math.Atan(Math.Pow(ArgValue,3));
            }
            else if ((-0.7 < ArgValue) && (ArgValue <= -0.6))
            {
                iTemp = Math.Tan(ArgValue + Math.Log(Math.Abs(ArgValue)));
            }
            else if (ArgValue >= -0.6)
            {
                iTemp = 1 / Math.Tan(Math.Pow(ArgValue, 2));
            }
            else
            {
                iTemp = 0.0;
            }
            return iTemp;
        }

        public override void Executioner()
        {
            CalculateFunction();
        }


    }


}
