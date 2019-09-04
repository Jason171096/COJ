using System;

namespace problem_1049
{
    class Program
    {
        static void Main(string[] args)
        {
            int n; 
            n = Convert.ToInt32(Console.ReadLine());
            if(n>=0)
                Console.WriteLine((n*(n+1))/2);
            else
                Console.WriteLine(((n*(n-1))/-2)+1);
        }
    }
}
