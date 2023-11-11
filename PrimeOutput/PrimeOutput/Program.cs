// See https://aka.ms/new-console-template for more information
class Program
{
    static void Main(String[] arg) 
    {
        for (int i = 2; i <= 50; i++) 
        {
            if(IsPrime(i))
            {
                Console.Write(i + " ");
            }
        }
    }

    static bool IsPrime(int a)
    {
        int num = (int)Math.Sqrt(a);

        for(int i = 2; i <= num; i++)
        {
            if(a % i == 0)
            {
                return false;
            }
        }

        return true;
    }
}