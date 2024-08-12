using System;
using System.Collections.Generic;
using System.Linq;
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
using System.Windows.Threading;

namespace WpfApp1
{
    /// <summary>
    /// Window6.xaml에 대한 상호 작용 논리
    /// </summary>
    /// 
    public partial class Window6 : Window
    {
        DispatcherTimer timer1;
        int timerCount, life, score;
        int selectNumber;
        bool isGameBool = true;

        public Window6()
        {
            InitializeComponent();
            timer1 = new DispatcherTimer();
        }

        private void TimerCall(object sender, EventArgs e)
        {
            Random random = new Random();
            selectNumber = random.Next(0, 4);
            BrushConverter bc = new BrushConverter();
            txt1.Background = (Brush)bc.ConvertFrom("#ffffff");
            txt2.Background = (Brush)bc.ConvertFrom("#ffffff");
            txt3.Background = (Brush)bc.ConvertFrom("#ffffff");
            txt4.Background = (Brush)bc.ConvertFrom("#ffffff");

            switch (selectNumber)
            {
                case 0:
                    txt1.Background = (Brush)bc.ConvertFrom("#ff0000");
                    break;
                case 1:
                    txt2.Background = (Brush)bc.ConvertFrom("#ff0000");
                    break;
                case 2:
                    txt3.Background = (Brush)bc.ConvertFrom("#ff0000");
                    break;
                case 3:
                    txt4.Background = (Brush)bc.ConvertFrom("#ff0000");
                    break;

            }
            isGameBool = true;
        }

        private void Loaded(object sender, RoutedEventArgs e)
        {
            timer1.Interval = TimeSpan.FromMilliseconds(2000);
            timer1.Tick += TimerCall;
            timer1.Start();
            life = 3;
            score = 0;
            UpdataUI();

        }

        private void button1(object sender, MouseButtonEventArgs e)
        {
            TextBlock textBlock = (TextBlock)sender;
            if (isGameBool == true)
            {
                switch (textBlock.Name)
                {
                    case "txt1":
                        if (selectNumber == 0)
                        {
                            score += 10;
                        }
                        else
                        {
                            life--;
                        }
                        UpdataUI();
                        break;
                    case "txt2":
                        if (selectNumber == 1)
                        {
                            score += 10;
                        }
                        else
                        {
                            life--;
                        }
                        UpdataUI();
                        break;
                    case "txt3":
                        if (selectNumber == 2)
                        {
                            score += 10;
                        }
                        else
                        {
                            life--;
                        }
                        UpdataUI();
                        break;
                    case "txt4":
                        if (selectNumber == 3)
                        {
                            score += 10;
                        }
                        else
                        {
                            life--;
                        }
                        UpdataUI();
                        break;
                }

                isGameBool = false;
            }
        }

        void UpdataUI()
        {
            d1.Text = $"점수 : {score}";
            d2.Text = $"생명 : {life}";
        }
    }
}
