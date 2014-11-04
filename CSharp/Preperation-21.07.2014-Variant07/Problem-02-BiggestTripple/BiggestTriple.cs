using System;

class BiggestTriple
{
    static void Main()
    {
        string input = Console.ReadLine();

        string[] stringNumbers = input.Split(' ');
        int[] numbers = new int[stringNumbers.Length];
        numbers = Array.ConvertAll<string, int>(stringNumbers, int.Parse);
        int finalSum = Int32.MinValue;
        string output = string.Empty;
        int tempSum = 0;
        for (int i = 0; i < numbers.Length; i+=3)
        { 
            
            if ((numbers.Length-i) < 2)
            {
                tempSum = numbers[i];
                if (tempSum > finalSum)
                {
                    finalSum = tempSum;
                    output = numbers[i].ToString();
                }
                break;
            }
            else if ((numbers.Length - i) < 3)
            {
                tempSum = numbers[i] + numbers[i + 1];
                if (tempSum > finalSum)
                {
                    finalSum = tempSum;
                    output = numbers[i] + " " + numbers[i + 1];
                }
                break;
            }
            tempSum = numbers[i] + numbers[i + 1] + numbers[i + 2];
            if (tempSum > finalSum)
            {
                finalSum = tempSum;
                output = numbers[i] + " " + numbers[i + 1] + " " + numbers[i + 2];
            }
            
            

        }
        Console.WriteLine(output);
    }
}
