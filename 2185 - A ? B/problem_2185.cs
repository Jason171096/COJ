using System;

namespace problem_2185
{
    class Program
    {
        static void Main(string[] args)
        {
            String cad = Console.ReadLine();
            String[] cad1 = cad.Split(' ');
            int A = Convert.ToInt32(cad1[0]);
            int B = Convert.ToInt32(cad1[1]);
            int suma, resta, multi, divi, mod;
            suma=A+B;
            resta=A-B;
            multi=A*B;
            divi=A/B;
            mod=(A%=B);
            Console.WriteLine(suma);
            Console.WriteLine(resta);
            Console.WriteLine(multi);
            Console.WriteLine(divi);
            Console.WriteLine(mod);
        }
    }
}
