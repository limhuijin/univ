
// See https://aka.ms/new-console-template for more information

while (true)
{
    Console.WriteLine("숫자 5를 입력하세요!");
    int a = int.Parse(Console.ReadLine());
    if (a == 5)
    {
        break;
    }
    else
    {
        Console.WriteLine("잘못 입력하셨습니다.");
    }
}