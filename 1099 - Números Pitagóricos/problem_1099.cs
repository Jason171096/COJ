using System;

namespace problem_1099
{
    class Program
    {
        static void Main(string[] args)
        {
            bool bandera=true;
            string num;
            String [] arreglo = new String[3];
            int [] arregloint = new int[3];
            int num1, num2, num3;
            while(bandera == true)
            {
                num = Console.ReadLine();
                if(num[0]=='0')
                {
                    bandera=false;
                    break;
                }
                else{
                    arreglo = num.Split(' ');
                    Array.Sort(arreglo);
                    for(int i = 0; i<3; i++)
                    {
                        arregloint[i] = Convert.ToInt32(arreglo[i]);
                    }
                    Array.Sort(arregloint);
                    num1 = arregloint[0]*arregloint[0];
                    num2 = arregloint[1]*arregloint[1];
                    num3 = arregloint[2]*arregloint[2];
                    if(num3==(num1+num2))
                        Console.WriteLine("right");
                    else
                        Console.WriteLine("wrong");
                }
            }
        }
    }
}
