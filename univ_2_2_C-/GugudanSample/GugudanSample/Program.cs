// See https://aka.ms/new-console-template for more information

/*
for(int i = 2; i < 10; i++)
{
    Console.WriteLine($"----{i}단----");

    for (int j = 2; j < 10; j++)
	{
        Console.WriteLine($"{i} x {j} = {i*j}");
    }

    Console.WriteLine();
}*/

/*
int a = 2, b = 1;

Console.WriteLine($"\n----{a}단----");

while (a < 10)
{ 
    Console.WriteLine($"{a} x {b} = {a * b}");

    b++;

    if(b >= 10)
    {
        a++;
        b = 1;
        Console.WriteLine($"\n----{a}단----");
    }
}*/

int i = 20;

while (i <= 99)
{
    Console.WriteLine($"{i / 10} x {i % 10} = {(i / 10) * (i % 10)}");
    i++;
}