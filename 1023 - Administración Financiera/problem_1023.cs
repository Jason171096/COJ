using System;

namespace problem_1023
{
    class Program
    {
        static void Main(string[] args)
        {
            decimal[] mes = new decimal[12];
            decimal total=0;
            for(int i=0; i<12; i++)
            {
                mes[i] = decimal.Parse(Console.ReadLine());
            }
            foreach(decimal dec in mes)
            {
                total+=dec;
            }
            Console.WriteLine("$"+(total/12));
        }
    }
}
