using System;

namespace lab3Exe
{
    public class Executor
    {   
        public void execute()
        {
            ArrayHandler arrayHandler = new ArrayHandler();
            try
            {
                arrayHandler.Fields();
            } catch(IndexOutOfRangeException e)
            {
                Console.WriteLine(e.Message);
            }
            arrayHandler.ScanArray();
            arrayHandler.PrintArray(arrayHandler.getArray());
            arrayHandler.putNumbersThatDiffersFromGreatestOnPercentageFirst(arrayHandler.getArray(), 20);
            Console.Write("Formatted array: ");
            arrayHandler.PrintArray(arrayHandler.getArray());
            Console.WriteLine("Sum of elements after last negative:"+ arrayHandler.CalculateSumOfIntegersAfterNegatives(arrayHandler.getArray()));
            Console.WriteLine("Input compare num");
            Double compareNum = Convert.ToDouble(Console.ReadLine());
            Console.WriteLine("Number of elements lower than "+compareNum+":"+arrayHandler.NumberOfLowerThan(arrayHandler.getArray(),compareNum));
        }
        public static void Main(String[] args)
        {
            new Executor().execute();
        }

    }

    public class ArrayData
    {
        public int size1, size2;
        private int n;
        public void Fields()
        {
            do
            {
                Console.WriteLine("Input size1");
                size1 = Convert.ToInt32(Console.ReadLine());
                Console.WriteLine("Input size2");
                size2 = Convert.ToInt32(Console.ReadLine());
                if (size1 > size2)
                {
                    Console.WriteLine("Bad input!Retry!!!");
                    continue;
                }
                break;
            } while (true);

            n = size2 - size1 + 1;
        }
        protected double[] mas = new double[100];
        public void ScanArray()
        {
            Array.Resize(ref mas, n);
            int x = size1;
            for (int i = 0; i < n; i++)
            {
                Console.Write("[{0}] = ", x);
                mas[i] = Convert.ToDouble(Console.ReadLine());
                x++;
            }
            Console.Write("\n");
        }

        public double[] getArray()
        {
            return mas;
        }
    }


    public class ArrayHandler:ArrayData
    {

        public void PrintArray(double[] array)
        {
            foreach (double temp in array)
            {
                Console.Write("\t"+temp);
            }
            Console.WriteLine();
        }

        public int NumberOfLowerThan(double[] array, double compareNum)
        {
            int counterOfLowers = 0;
            foreach (double temp in array)
            {
                if (temp < compareNum)
                {
                    counterOfLowers++;
                }
            }
            return counterOfLowers;
        }

        public int CalculateSumOfIntegersAfterNegatives(double[] array)
        {
            int sumOfIntegers = 0;
            for (int i = GetLastNegativeIndex(array) + 1; i < array.Length; i++)
            {
                sumOfIntegers += (int)array[i];
            }

            return sumOfIntegers;
        }

        private int GetLastNegativeIndex(double[] array)
        {
            double lastNegativeValue = Array.FindLast(array, a => a < 0);
            return Array.LastIndexOf(array, lastNegativeValue);
        }

        private void MoveIndexes(double[] array, int start, int end)
        {
            double prev = 0.0;
            double next = 0.0;
            for (int i = start; i < end; i++)
            {
                next = array[i + 1];
                if (i == start)
                {
                    array[i+1] = array[i];

                }
                else
                {
                    array[i + 1] = prev;
                }
                prev = next;
            }
        }

        public void putNumbersThatDiffersFromGreatestOnPercentageFirst(double[] array, int differencePercent)
        {
            double maxNumber = GetGreatest(array);
            int counter = 0;
            for (int i = 0; i < array.Length; i++)
            {
                if (GetDifferencePercentage(maxNumber,array[i]) <= differencePercent)
                {
                    double temp = array[i];
                    MoveIndexes(array, counter, i);
                    array[counter] = temp;
                    counter++;
                }
            }
        }
        
        private double GetDifferencePercentage(double decreasing, double substractor)
        {
            double difference = Math.Abs(decreasing - substractor);
            return (difference / decreasing) * 100;

        }

        private double GetGreatest(double[] array)
        {
            double max = array[0];
            foreach (double temp in array)
            {
                max = temp > max ? temp : max;
            }

                return max;
        }
    }
}

