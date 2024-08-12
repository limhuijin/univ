struct Person
{
    public int year;
    public int month;
    public int day;

    public Person()
    {
        year = 2023;
        month = 10;
        day = 1;
    }
}

class Program
{
    static void Main(string[] args)
    {
        Person person;
        person.year = 2023;
        person.month = 10;
        person.day = 30;
        Console.WriteLine($"{person.year}년 {person.month}월 {person.day}일");
    }
}


