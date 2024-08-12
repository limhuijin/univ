// See https://aka.ms/new-console-template for more information
class a
{
    private int start;
    public int Start
    {
        get
        {
            return start;
        }
        set
        {
            if (value >= 0)
            {
                start = value;
            }
            else
            {
                start = 0;
                Console.WriteLine("양수만 입력");
            }
        }
    }

    int end;
    public int End
    {
        get
        {
            return end;
        }
        set
        {
            if (value >= 0)
            {
                end = value;
            }
            else
            {
                end = 0;
                Console.WriteLine("양수만 입력");
            }
        }
    }

    /// <summary>
    /// 이 함수는 길이를 구하는 함수입니다.
    /// </summary>
    /// <returns></returns>

    public a(int start, int end)
    {
        this.start = start;
        this.end = end;
    }
    public int GetLength()
    {
        return end - start;
    }
}


class Program
{
    static void Main(string[] args)
    {
        a program = new a(1, 10);

        Console.WriteLine(program.Start);
        Console.WriteLine(program.End);

        program.Start = 2;
        program.End = 11;

        Console.WriteLine(program.Start);
        Console.WriteLine(program.End);
    }
}