using System;
using System.Threading;

class FruitMarket
{
    static void Main()
    {
        string dayOfWeek = Console.ReadLine();
        decimal sum = 0;
        for (int i = 0; i < 3; i++)
        {
            decimal tempQuantity = decimal.Parse(Console.ReadLine());
            string tempProduct = Console.ReadLine();
            decimal price = 0;
            bool isFruit = false;
            switch (tempProduct)
            {
                case "banana":
                    {
                        price = 1.80m;
                        isFruit = true;
                    }
                    break;
                case "cucumber":
                    price = 2.75m;
                    break;
                case "tomato":
                    price = 3.2m;
                    break;
                case "orange":
                    {
                        price = 1.6m;
                        isFruit = true;
                    }
                    break;
                case "apple":
                    {
                        price = 0.86m;
                        isFruit = true;
                    }
                    break;
            }
            decimal value = price * tempQuantity;

            switch (dayOfWeek)
            {
                case "Friday":
                    {
                        value = 0.9m * value;
                    }
                    break;
                case "Sunday":
                    {
                        value = 0.95m * value;
                    }
                    break;
                case "Tuesday":
                    {
                        if (isFruit)
                        {
                            value = 0.8m * value;
                        }
                    }
                    break;
                case "Wednesday":
                    {
                        if (!isFruit)
                        {
                            value = 0.9m * value;
                        }
                    }
                    break;
                case "Thursday":
                    {
                        if (tempProduct=="banana")
                        {
                            value = 0.7m * value;
                        }
                    }
                    break;
            }
            sum += value;
           
        }
        Console.WriteLine("{0:F2}", sum);

    }
}

