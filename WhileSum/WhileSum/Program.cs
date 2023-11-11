// See https://aka.ms/new-console-template for more information

int a = 0, sum = 0;

while (a < 100)
{
    /*
    Console.WriteLine("양의 정수 입력");
    a = int.Parse(Console.ReadLine());
    
    if(a > 0)
    {
        Console.WriteLine("양의 정수");
    }
    else
    {
        Console.WriteLine("음의 정수");
    }*/

    sum += ++a;
}

Console.WriteLine($"sum = {sum}, a = {a}");

int b = 0;
sum = 0;

do {
    b++;
    sum += b;
} while (b < 100);

Console.WriteLine($"sum = {sum}, b = {b}");

int i = 1;
sum = 0;

for (i = 1; i <= 100; i++)
{
    sum += i;
}

Console.WriteLine($"sum = {sum}, b = {i}");