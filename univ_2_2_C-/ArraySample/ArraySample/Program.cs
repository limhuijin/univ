// See https://aka.ms/new-console-template for more information
/*
int[] a = new int[10];

for (int i = 0; i < a.Length; i++)
{
    a[i] = i+1;
}

for (int i = 0; i < a.Length; i++)
{
    Console.WriteLine(a[i]);
}*/

/*
int num = 1;
int a = 0;

Console.WriteLine("숫자를 입력해주세요 : ");
a = int.Parse(Console.ReadLine());

while (true)
{
    if (a < 10) 
    {
        Console.WriteLine($"{num}자리입니다.");
        break;
    }

    a /= 10;
    num++;

}*/
/*
Random ran = new Random();

int[] num = new int[6];

for (int i = 0; i < 6; i++)
{
    num[i] = ran.Next(1, 46);

    for(int j = 0; j < i; j++)
    {
        if (num[i] == num[j])
        {
            Console.WriteLine($"중복 번호 : {num[i]}");
            i--;
            break;
        }
    }
}

Console.Write($"로또 번호 : ");

for (int i = 0; i < 6; i++)
{
    Console.Write($"{num[i]} ");
}*/

/*
int n = 1;
Random ran = new Random();
int r = 1;
int[] rotto = new int[6];
rotto[0] = ran.Next(0, 4);
while (true)
{
    int random = ran.Next(0, 46);
    bool isSame = false;
    for (int i = 0; i < r; i++)
    {
        if (rotto[i] == random)
        {
            isSame = true;
            break;
        }
    }

    if(!isSame)
    {
        rotto[r] = random;
        r++;
    }

    if(r >= 6)
    {
        break;
    }
}

for (int i = 0; i < 6; i++)
{
    Console.Write($"{rotto[i]} ");
}
*/

Random ran = new Random();
List<int> randomList = new List<int>();
int[] rotto = new int[6];

for (int i = 1; i < 46; i++)
{
    randomList.Add(i);
}

for (int i = 1; i < 6; i++)
{
    int index = ran.Next(0, randomList.Count);
    rotto[i] = randomList[index];
    randomList.Remove(index);
    Console.WriteLine(rotto[i].ToString());
}