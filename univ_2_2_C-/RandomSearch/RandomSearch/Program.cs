// See https://aka.ms/new-console-template for more information
Random r = new Random();
int[] num = new int[10];

for (int i = 0; i < num.Length; i++)
{
    num[i] = r.Next(100);
}

for (int i = 0; i < num.Length; i++)
{
    Console.Write(num[i] + " ");
}

Console.WriteLine();
int choice = int.Parse(Console.ReadLine());
int count = 0;

for(int i = 0; i < num.Length; i++)
{
    count++;
    if(choice == num[i])
    {
        Console.WriteLine($"인덱스 : [{i}] = {choice}");
        Console.WriteLine($"탐색 횟수 : {count}");
        break;
    }
}

Console.WriteLine("---------------------");

Array.Sort(num);

count = 0;
int low = 0;
int high = num.Length - 1;
int mid = (low + high) / 2;

while (low <= high)
{
    count++;

    if (choice == num[mid])
    {
        Console.WriteLine($"인덱스 : [{mid}] = {choice}");
        Console.WriteLine($"탐색 횟수 : {count}");
        break;
    }
    else
    {
        if(choice > num[mid])
        {
            low = mid + 1;
        }
        else
        {
            high = mid - 1;
        }
    }
}