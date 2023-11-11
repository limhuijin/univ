// See https://aka.ms/new-console-template for more information
class Program
{
    class Car
    { 
        private void PrivateM()
        {
            Console.WriteLine("PrivateM");
        }

        protected void ProtectedM()
        {
            Console.WriteLine("ProtectedM");
        }

        public void PublicM()
        {
            Console.WriteLine("PublicM");
        }

        public Car()
        {
            PrivateM();
            ProtectedM();
            PublicM();
        }
    }

    class Sedan : Car
    { 
        public Sedan() 
        {
            PrivateM();
            ProtectedM();
            PublicM();
        }
    }


    static void Main(string[] args)
    {
        Sedan sedan = new Sedan();
        sedan.PrivateM();
        sedan.ProtectedM();
        sedan.PublicM();
    }
}