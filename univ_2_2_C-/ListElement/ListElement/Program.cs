// See https://aka.ms/new-console-template for more information
class Program
{
    static void Main(String[] args)
    {
        List<int> list = new List<int>();
        list.Add(1);
        list.Add(2);
        list.Add(3);
        list.Add(4);
        list.Add(5);

        for (int i = 0; i < list.Count; i++)
        {
            Console.WriteLine(list[i]);
        }

        list.RemoveAt(2);
        list.Remove(5);

        for (int i = 0; i < list.Count; i++)
        {
            Console.WriteLine(list[i]);
        }

        if(list.Contains(1))
        {
            Console.WriteLine("있음");
        }


        Console.WriteLine($"절대값(-1) : {Math.Abs(-1)}");
        Console.WriteLine($"반올림(1.5) : {Math.Round(1.5)}");
        Console.WriteLine($"큰값(1, 9) : {Math.Max(1, 9)}");
        Console.WriteLine($"제곱근(9) : {Math.Sqrt(9)}");
    }
}