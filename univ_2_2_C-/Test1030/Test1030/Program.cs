using System;

struct Person
{
    public int id;
    public string name;
    public int moeny;

    public Person()
    {
        id = 0;
        name = "";
        moeny = 0;
    }
}

class Program
{
    static public void start(Person[] person)
    {
        string[] personName = { "임희진", "이찬", "허선진" };

        for (int i = 0; i < 3; i++)
        {
            person[i].id = i + 1;
            person[i].name = personName[i];
            person[i].moeny = 100;
        }
    }

    static public void printInpo(Person []person)
    {
        Console.WriteLine($"--- 현재 정보 ---\n");
        Console.WriteLine($"아이디\t이름\t돈\t");
        for (int i = 0; i < 3; i++)
        {
            Console.WriteLine($"{person[i].id}\t{person[i].name}\t{person[i].moeny}\t");
        }
        Console.WriteLine();
    }

    static public int InputOutput(Person[] person, int num)
    {
        int idNum = 0, moenyNum = 0;

        Console.WriteLine($"어떤 작업을 하시겠습니까? 입급[1] 출금[2] 종료[-1]\n");
        num = int.Parse(Console.ReadLine());

        if (num > 3 || num < 1)
        {
            Console.WriteLine($"잘못 입력했습니다. 다시 입력해주세요\n");
            return 1;
        }

        switch (num)
        {
            case 1:
                Console.WriteLine($"누구에게 입금하시겠습니까? (id 입력)");
                idNum = int.Parse(Console.ReadLine());

                if (idNum > 3 || idNum < 1)
                {
                    Console.WriteLine($"잘못 입력했습니다. 다시 입력해주세요\n");
                    break;
                }

                Console.WriteLine($"얼마를 입금하시겠습니까? (돈 입력)");
                moenyNum = int.Parse(Console.ReadLine());

                person[idNum - 1].moeny += moenyNum;
                Console.WriteLine($"{person[idNum - 1].name}에게 {moenyNum}원을 입금하였습니다.");
                break;

            case 2:
                Console.WriteLine($"누구의 계좌에서 출금하시겠습니까? (id 입력)");
                idNum = int.Parse(Console.ReadLine());

                if (idNum > 3 || idNum < 1)
                {
                    Console.WriteLine($"잘못 입력했습니다. 다시 입력해주세요\n");
                    break;
                }

                Console.WriteLine($"얼마를 출금하시겠습니까? (돈 입력)");
                moenyNum = int.Parse(Console.ReadLine());

                if (person[idNum - 1].moeny - moenyNum < 0)
                {
                    Console.WriteLine($"돈이 부족합니다. 다시 입력해주세요\n");
                }
                else
                {
                    person[idNum - 1].moeny -= moenyNum;
                    Console.WriteLine($"{person[idNum - 1].name}에서 {moenyNum}원을 출금하였습니다.");
                }
                break;

            default:
                break;
        }

        return num;
    }


    static void Main(string[] args)
    {
        Person[] person = new Person[3];
        int num = 0;

        start(person);

        while (num != -1)
        {
            printInpo(person);

            num = InputOutput(person, num);
        }

        printInpo(person);

        Console.WriteLine($"종료합니다.\n");
    }
}


