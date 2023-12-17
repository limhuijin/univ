
class Program
{

    static void Main(string[] args)
    {
        int day, mon, num7 = 0;
        int monNum;
        int dayNum = 0;

        Console.WriteLine("달력을 만들 연도를 입력하세요!(예 : 2023)");
        day = int.Parse(Console.ReadLine());
        Console.WriteLine("월을 입력하세요!(예 : 11)");
        mon = int.Parse(Console.ReadLine());

        DateTime dateTime = new DateTime(day, mon, 1);

        String monDay = dateTime.DayOfWeek.ToString();

        Console.WriteLine(monDay);

        monNum = DateTime.DaysInMonth(day, mon);

        if (monDay == "Sunday")
        {
            dayNum = 1;
        }
        else if (monDay == "Monday")
        {
            dayNum = 2;
        }
        else if (monDay == "Tuesday")
        {
            dayNum = 3;
        }
        else if (monDay == "Wednesday")
        {
            dayNum = 4;
        }
        else if (monDay == "Thursday")
        {
            dayNum = 5;
        }
        else if (monDay == "Friday")
        {
            dayNum = 6;
        }
        else if (monDay == "Saturday")
        {
            dayNum = 7;
        }

        Console.WriteLine($"\t\t{day}년 {mon}월 달력\t\t");
        Console.WriteLine($"=================================================");
        Console.WriteLine($"Sun\tMon\tTue\tWed\tThu\tFri\tSat");
        Console.WriteLine($"-------------------------------------------------");

        for (int i = 1; i <= monNum; i++)
        {
            num7++;
            if (dayNum > 0)
            {
                Console.Write("\t");
                dayNum--;
                i--;
                continue;
            }

            Console.Write($"{i}\t");

            if(num7 % 7 == 0)
            {
                Console.WriteLine();
            }
        }
}

    /*static void Main(string[] args)
    {
        int []arrInput = new int[4];
        int[] arrResult = new int[4];
        int num, st = 0, ba = 0, clearNum = 0;
        Random random = new Random();  
       

        for(int i = 0; i < 4; i++)
        {
            arrInput[i] = random.Next(1, 10);

            for (int j = 0; j < i; j++)
            {
                if (arrInput[i] == arrInput[j])
                {
                    i--;
                    break;
                }
            }
        }


        while (true)
        {
            st = 0;
            ba = 0;
            clearNum++;

            for (int i =0; i < 4; i++)
            {
                Console.Write(arrInput[i] + " ");
            }
            Console.WriteLine("\n4자리 숫자 입력?");
            num = int.Parse(Console.ReadLine());

            for (int i = 4; i > 0; i--)
            {
                arrResult[i - 1] = num % 10;
                num /= 10;

            }

            for (int i = 0; i < 4; i++)
            {
                for (int j = 0; j < 4; j++)
                {
                    if (arrResult[i] == arrInput[j] && i == j)
                    {
                        st++;
                        break;
                    }
                    else if (arrResult[i] == arrInput[j])
                    {
                        ba++;
                        break;
                    }
                }
            }

            if (st == 4)
            {
                Console.WriteLine("축하합니다!");
                Console.WriteLine($"{clearNum-1}회 클리어");
                break;
            }
            else
            {
                Console.WriteLine($"{st}스트라이크, {ba}볼({clearNum}회)\n");
            }
        }
    }*/
}