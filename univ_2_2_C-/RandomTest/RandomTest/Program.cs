Random r = new Random();
int[] v = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
int t = 0;
int rand;

for (int i = 0; i < v.Length; i++)
{
    rand = r.Next(i, 10);
    if (rand != i)
    {
        t = v[i];
        v[i] = v[rand];
        v[rand] = t;
    }


    Console.Write($"테스트 {i} - ");
    for (int h = 0; h < v.Length; h++)
    {
        Console.Write(v[h] + " ");
    }
    Console.WriteLine();
}