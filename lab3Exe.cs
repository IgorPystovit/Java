using System;

namespace lab3Exe
{
    public class Executor
    {
        public static void Main(String[] args)
        {
            Lab3ArrayHandler arrayHandler = new Lab3ArrayHandler();
            double[] array = new double[] { 3.3, 2.1, -3.4, -2.0, 1.23, 9.11, 8.3, 8.8 };
            arrayHandler.PrintArray(array);
            arrayHandler.putNumbersThatDiffersFromGreatestOnPercentageFirst(array, 20);
            arrayHandler.PrintArray(array);
            arrayHandler.putNumbersThatDiffersFromGreatestOnPercentageFirst(array, 20);
            try
            {

            } catch (IndexOutOfRangeException e)
            {
                Console.Write(e.StackTrace);
            }
        }

    }

    public class Lab3ArrayHandler
    {
        public void PrintArray(double[] array)
        {
            foreach (double temp in array)
            {
                Console.Write("\t"+temp);
            }
            Console.WriteLine();
        }
        public int NumberOfLowerThan(double[] array, int compareNum)
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

