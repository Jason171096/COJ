using System;

namespace problem_1495
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = Convert.ToInt32(Console.ReadLine());
            int[] lista = new int[n];
            for(int i=0; i<lista.Length; i++)
            {
                lista[i] = Convert.ToInt32(Console.ReadLine());
            }
            Array.Sort(lista);
            foreach(int var in lista)
            {
                Console.WriteLine(var);
            }
        }
    }
}
