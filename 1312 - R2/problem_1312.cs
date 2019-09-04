using System;

namespace problem_1312
{
    class Program
    {
        static void Main(string[] args)
        {
            String[] separador = new String[2];
            int R1, res, R2;
            String num = Console.ReadLine();
            separador = num.Split(' ');
            R1 = Convert.ToInt32(separador[0]);
            res = Convert.ToInt32(separador[1]);
            R2 = (res*2)-R1;
            Console.WriteLine(R2);
        }
    }
}
