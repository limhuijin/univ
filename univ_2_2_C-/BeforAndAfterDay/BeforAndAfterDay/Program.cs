class Program
{ 
    static void Main(string[] args)
    {
        Console.WriteLine($"{DateTime.Now}");
        Console.WriteLine($"{DateTime.Now.Ticks}");
        Console.WriteLine($"{new DateTime(DateTime.Now.Ticks)}");
    }
}
