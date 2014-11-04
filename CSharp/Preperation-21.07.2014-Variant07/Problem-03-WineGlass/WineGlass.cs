using System;

class WineGlass
{
    static void Main()
    {
        int n = int.Parse(Console.ReadLine());

        // upper part of glass
        for (int i = 0; i < n/2; i++)
        {
            string dots = new string('.', i);
            string asterix = new string('*', (n - 2 * i) - 2);


            Console.WriteLine("{0}\\{1}/{0}", dots, asterix);
        }
        // middle part of glass
        for (int i = 0; i < n/2 - 1; i++)
        {
            string dots = new string('.', (n - 2) / 2);
            if (n >= 12 && i== (n/2-2))
            {
                Console.WriteLine(new string ('-', n));
                break;
            }
            Console.WriteLine("{0}||{0}", dots);

        }
        //last line
        Console.WriteLine(new string('-', n));
    }
}

