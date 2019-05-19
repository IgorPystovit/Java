using System;

namespace Lab3
{
    public static void main(String[] args)
    {
        try
        {
            throw new IndexOutOfRangeException();
        } catch (Exception e)
        {
            Console.Write(e.GetObjectData);
        }
    }
}
