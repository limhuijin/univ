// See https://aka.ms/new-console-template for more information
/*
int a, choice;

Console.Write("정수 입력 : ");
a = int.Parse(Console.ReadLine());
choice = a % 2;

if(choice == 0)
{
    Console.WriteLine("짝수 입니다.");
}
else 
{
    Console.WriteLine("홀수 입니다.");
}
*/

int num = 0;

Console.Write("점수 입력 : ");

try
{
    num = int.Parse(Console.ReadLine());

    if (num > 100 || num < 0)
    {
        Console.WriteLine("잘못 입력했습니다.");
    }
    else
    {
        if (num >= 90)
        {
            Console.WriteLine("A 입니다.");
        }
        else if (num >= 80)
        {
            Console.WriteLine("B 입니다.");
        }
        else if (num >= 70)
        {
            Console.WriteLine("C 입니다.");
        }
        else if (num >= 60)
        {
            Console.WriteLine("D 입니다.");
        }
        else
        {
            Console.WriteLine("F 입니다.");
        }
    }
}
catch(Exception e)
{
    Console.WriteLine("정수를 입력해주세요.");
}
