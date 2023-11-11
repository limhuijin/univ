// See https://aka.ms/new-console-template for more information

class Program
{
    static void Main(String[] args)
    {
        Output(1);
        Output(2.1);
        Output("k", 3);
    }

    static void Output(int a)
    {
        Console.WriteLine(a);
    }
    static void Output(double a)
    {
        Console.WriteLine(a);
    }
    static void Output(String a)
    {
        Console.WriteLine(a);
    }
    static void Output(String a, double b)
    {
        Console.WriteLine(a + b);
    }
}
