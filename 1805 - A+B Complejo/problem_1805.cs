using System;

namespace problem_1805
{
    class Program
    {
        static void Main(string[] args)
        {
            String cad;
            long A, B, res;
            String [] a = new String[2];
            cad = Console.ReadLine();
            a = cad.Split(' ');
            A = Convert.ToInt64(a[0]);
            B = Convert.ToInt64(a[1]);
            res = 2*(A+B);
            Console.WriteLine(res);
        }
    }
}
