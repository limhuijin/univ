// See https://aka.ms/new-console-template for more information

/*
for (int i = 0; i < 5; i++)
{
    for (int j = 5; j > i; j--)
    {
        Console.Write("☆");
    }

    Console.WriteLine();
}*/

/*
for (int i = 0; i < 5; i++)
{
    if (i < 3)
    {
        for (int j = i; j < 2; j++)
        {
            Console.Write("□");
        }

        for (int j = 0; j < i * 2 + 1; j++)
        {
            Console.Write("☆");
        }

        Console.WriteLine();
    }
    else
    {
        for (int j = i; j > 2; j--)
        {
            Console.Write("□");
        }

        for (int j = i * 2 + 1; j < 10; j++)
        {
            Console.Write("☆");
        }

        Console.WriteLine();
    }
}*/

int num = 7;

for (int i = 0; i < num; i++)
{
    int a = 0;

    if (i < num / 2 + 1)
    {
        a = num / 2 - i;
    }
    else
    {
        a = i - num / 2;
    }

    Console.Write(a + " ");
    Console.WriteLine(num - a * 2);
}