using System;

namespace problem_1483
{
    class Program
    {
        static void Main(string[] args)
        {
            String cad = Console.ReadLine();
            String[] sep = cad.Split(' ');
            int area;
            double areacir;
            if(sep[0].Equals("rectangle"))
            {
                area = Convert.ToInt32(sep[1]) * Convert.ToInt32(sep[2]);
                Console.WriteLine(area);
            }
            if(sep[0].Equals("square"))
            {
                area = Convert.ToInt32(sep[1]) * Convert.ToInt32(sep[1]);
                Console.WriteLine(area);
            }
            if(sep[0].Equals("triangle"))
            {
                area = Convert.ToInt32(sep[1]) * Convert.ToInt32(sep[2]);
                Console.WriteLine(area);
            }
            if(sep[0].Equals("circle"))
            {
                areacir = Math.PI * (Double.Parse(sep[1]) * Double.Parse(sep[1]));
                Console.WriteLine(areacir);
            }

        }
    }
}
