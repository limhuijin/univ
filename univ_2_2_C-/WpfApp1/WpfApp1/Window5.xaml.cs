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
    /// Window5.xaml에 대한 상호 작용 논리
    /// </summary>
    public partial class Window5 : Window
    {
        DispatcherTimer timer = new DispatcherTimer();
        int count = 0;
        public Window5()
        {
            Random random = new Random();
            int a = random.Next(0, 4);

            InitializeComponent();
            timer.Interval = TimeSpan.FromMilliseconds(100);
            timer.Tick += Timer1Call;
        }

        private void Timer1Call(object sender, System.EventArgs e)
        {
            count++;

            label1.Content = count;
            label2.Content = count / 10;
            label3.Content = count / 20;
        }

        private void Loaded(object sender, RoutedEventArgs e)
        {
            timer.Start();
        }
    }
}
