// See https://aka.ms/new-console-template for more information
/*
int[,] array2D = new int[3, 3];
{1, 2, 3},
{4, 5, 6}

int[][] array2AD = new int[10][];
{1, 2, 3},
{4, 5}
*/

int[] array = { 1, 2, 3, 4 };

for (int i = 0; i < array.Length; i++)
{
    Console.WriteLine(array[i]);
}

Console.WriteLine("---");

foreach (var item in array)
{
    Console.WriteLine(item);
}

Console.WriteLine("---");

int[,] array2D = { { 1, 2, 3 }, { 4, 5, 6 } };

for (int i = 0; i < array2D.GetLength(0); i++)
{
    for (int j = 0; j < array2D.GetLength(1); j++)
    {
        Console.WriteLine(array2D[i, j]);
    }
}

Console.WriteLine("---");

foreach (var item in array2D)
{
    Console.WriteLine(item);
}

Console.WriteLine("---");

int[][] array2AD = new int[2][];
array2AD[0] = new int[] { 1, 2, 3 };
array2AD[1] = new int[] { 4, 5};

for (int i = 0; i < array2AD.Length; i++)
{
    for (int j = 0; j < array2AD[i].Length; j++)
    {
        Console.WriteLine(array2AD[i][j]);
    }
}

Console.WriteLine("---마지막");

foreach (var item in array2AD)
{
    foreach (var item2 in item)
    {
        Console.WriteLine(item2);
    }
}