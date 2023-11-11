// See https://aka.ms/new-console-template for more information

for (int i = 0; i < 10; i++)
{
    if(i % 2 == 0)
    {
        continue;
    }

    Console.WriteLine(i);
}

int b = 0;

replay:
b += 2;
Console.WriteLine(b.ToString());
if(b < 10)
{
    goto replay;
}