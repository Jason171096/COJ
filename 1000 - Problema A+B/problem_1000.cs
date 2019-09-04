using System;
namespace problem_1000
{
    class Program
    {
        static void Main(string[] args)
        {
            string a;
            int c;
            a = Console.ReadLine();
            String[] b = a.Split(' ');
            c = Convert.ToInt32(b[0]) + Convert.ToInt32(b[1]);
            Console.WriteLine(c);
        }
    }
}
