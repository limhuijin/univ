// See https://aka.ms/new-console-template for more information
/*
 자판기
1. 금액 입력 받기
2. 음료수 목록
   1. 콜라 500, 2. 사이다 600, 3. 환타 700
3. 음료수 선택
4. 조건에 맞으면 음료수와 잔돈 출력.
   조건에 맞지 않으면 들어간 돈을 반환
 */

int money, num, sum = 0;
bool Tr = true;
String name = "";

Console.Write("금액을 입력해주세요 : ");
money = int.Parse(Console.ReadLine());

while (Tr)
{
    Console.WriteLine($"\n현재 금액 {money}원");
    Console.WriteLine($"음료수 목록");
    Console.WriteLine($"(1) 콜라 : 500");
    Console.WriteLine($"(2) 사이다 : 600");
    Console.WriteLine($"(3) 환타 : 700\n");

    Console.Write($"음료를 선택해주세요(1 ~ 3) 종료(4) : ");
    num = int.Parse(Console.ReadLine());

    switch (num)
    {
        case 1:
            sum = 500;
            name = "콜라";
            break;
        case 2:
            sum = 600;
            name = "사이다";
            break;
        case 3:
            sum = 700;
            name = "환타";
            break;
        case 4:
            Tr = false;
            break;
        default:
            Console.WriteLine($"다시 입력해주세요.");
            sum = 0;
            name = "";
            break;
    }

    if(money - sum < 0)
    {
        Console.WriteLine($"돈이 부족합니다.");
        Console.WriteLine($"반환 : {money}원");
    }
    else
    {
        money -= sum;
        Console.WriteLine($"음료 : {name}");
        Console.WriteLine($"잔돈 : {money}원");
    }
}

Console.WriteLine($"종료합니다.");
