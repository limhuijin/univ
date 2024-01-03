using System;
using System.Collections.Generic;
using System.Linq;
using System.Reflection.Emit;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Shapes;

namespace WpfApp1
{
    /// <summary>
    /// Test1218.xaml에 대한 상호 작용 논리
    /// </summary>
    public partial class Test1218 : Window
    {
        int RandDice0, RandDice1;
        int userPlace = 0, user = 0;
        public Test1218()
        {
            InitializeComponent();

            x0.Background = new SolidColorBrush(Colors.Red);
        }

        private void dice_Click(object sender, RoutedEventArgs e)
        {
            Random random = new Random();
            RandDice0 = random.Next(1, 7);
            RandDice1 = random.Next(1, 7);

            dice0.Text = $"{RandDice0}";
            dice1.Text = $"{RandDice1}";

            userPlace = user;

            if (user + RandDice0 + RandDice1 > 15)
            {
                user -= 15;
            }

            user += RandDice0 + RandDice1;

            switch (user)
            {
                case 0:
                    x0.Background = new SolidColorBrush(Colors.Red);
                break;
                case 1:
                    x1.Background = new SolidColorBrush(Colors.Red);
                    break;
                case 2:
                    x2.Background = new SolidColorBrush(Colors.Red);
                    break;
                case 3:
                    x3.Background = new SolidColorBrush(Colors.Red);
                    break;
                case 4:
                    x4.Background = new SolidColorBrush(Colors.Red);
                    break;
                case 5:
                    x5.Background = new SolidColorBrush(Colors.Red);
                    break;
                case 6:
                    x6.Background = new SolidColorBrush(Colors.Red);
                    break;
                case 7:
                    x7.Background = new SolidColorBrush(Colors.Red);
                    break;
                case 8:
                    x8.Background = new SolidColorBrush(Colors.Red);
                    break;
                case 9:
                    x9.Background = new SolidColorBrush(Colors.Red);
                    break;
                case 10:
                    x10.Background = new SolidColorBrush(Colors.Red);
                    break;
                case 11:
                    x11.Background = new SolidColorBrush(Colors.Red);
                    break;
                case 12:
                    x12.Background = new SolidColorBrush(Colors.Red);
                    break;
                case 13:
                    x13.Background = new SolidColorBrush(Colors.Red);
                    break;
                case 14:
                    x14.Background = new SolidColorBrush(Colors.Red);
                    break;
                case 15:
                    x15.Background = new SolidColorBrush(Colors.Red);
                    break;
            }

            switch (userPlace)
            {
                case 0:
                    x0.Background = new SolidColorBrush(Colors.Green);
                    break;
                case 1:
                    x1.Background = new SolidColorBrush(Colors.Green);
                    break;
                case 2:
                    x2.Background = new SolidColorBrush(Colors.Green);
                    break;
                case 3:
                    x3.Background = new SolidColorBrush(Colors.Green);
                    break;
                case 4:
                    x4.Background = new SolidColorBrush(Colors.Green);
                    break;
                case 5:
                    x5.Background = new SolidColorBrush(Colors.Green);
                    break;
                case 6:
                    x6.Background = new SolidColorBrush(Colors.Green);
                    break;
                case 7:
                    x7.Background = new SolidColorBrush(Colors.Green);
                    break;
                case 8:
                    x8.Background = new SolidColorBrush(Colors.Green);
                    break;
                case 9:
                    x9.Background = new SolidColorBrush(Colors.Green);
                    break;
                case 10:
                    x10.Background = new SolidColorBrush(Colors.Green);
                    break;
                case 11:
                    x11.Background = new SolidColorBrush(Colors.Green);
                    break;
                case 12:
                    x12.Background = new SolidColorBrush(Colors.Green);
                    break;
                case 13:
                    x13.Background = new SolidColorBrush(Colors.Green);
                    break;
                case 14:
                    x14.Background = new SolidColorBrush(Colors.Green);
                    break;
                case 15:
                    x15.Background = new SolidColorBrush(Colors.Green);
                    break;
            }
        }
    }
}
