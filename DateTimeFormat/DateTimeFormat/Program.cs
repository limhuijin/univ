using System.Globalization;

namespace DataTimeFormat
{
    public class Program
    { 
        static void Main(string[] args)
        {
            DateTime today = DateTime.Now;
            Console.WriteLine(today.ToString("yyyy년 MM월 dd일 HH시 mm분 ss초"));
            Console.WriteLine(String.Format("{0:G}", today));
            Console.WriteLine(String.Format("{0:d}", today));
            Console.WriteLine(String.Format("{0:D}", today));
            Console.WriteLine(String.Format("{0:t}", today));
            Console.WriteLine(String.Format("{0:T}", today));
            Console.WriteLine(today.ToString("프랑스식 : MMMM dd, yyyy ddd", new CultureInfo("fr-FR")));
        }
    }
}