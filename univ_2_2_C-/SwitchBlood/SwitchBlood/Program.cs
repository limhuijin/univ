// See https://aka.ms/new-console-template for more information
/*
int a;

Console.Write("A, B, O, F(AB) 입력");
a = Convert.ToChar(Console.Read());

switch(a)
{
    case 'A':
        Console.WriteLine("차분한 성격");
        break;

    case 'B':
        Console.WriteLine("예술적 성격");
        break;

    case 'O':
        Console.WriteLine("활발한 성격");
        break;

    case 'F':
        Console.WriteLine("창의적 성격");
        break;

    default:
        Console.WriteLine("잘못 입력하셨습니다.");
        break;
}*/

int a;

Console.Write("숫자입력 : ");
a = int.Parse(Console.ReadLine());

if (a > 100 || a < 0)
{
    Console.WriteLine("잘못 입력하셨습니다.");
}
else
{
    switch (a / 10)
    {
        case 10:
        case 9:
            Console.WriteLine("A");
            break;

        case 8:
            Console.WriteLine("B");
            break;

        case 7:
            Console.WriteLine("C");
            break;

        case 6:
            Console.WriteLine("D");
            break;

        default:
            Console.WriteLine("F");
            break;
    }
}