// See https://aka.ms/new-console-template for more information
int[] v = new int[10];
int temp = 0;
Random r = new Random();

for (int i = 0; i < 10; i++)
{
    v[i] = r.Next(100);
}

for(int i = 0; i < v.Length - 1; i++)
{
    for(int j = 0; j < v.Length - 1 - i; j++)
    {
        if (v[j] > v[j+1])
        {
            temp = v[j];
            v[j] = v[j + 1];
            v[j + 1] = temp;
        }
    }
}

for (int i = 0; i < v.Length; i++)
{
    Console.Write($"{v[i]} ");
}

