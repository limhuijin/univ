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

namespace WpfApp1
{
    /// <summary>
    /// Window2.xaml에 대한 상호 작용 논리
    /// </summary>
    public partial class Window2 : Window
    {
        public Window2()
        {
            InitializeComponent();
        }

        private void buttonRed_Click(object sender, RoutedEventArgs e)
        {
            /*BrushConverter brushConverter = new BrushConverter();
            label.Background = (Brush)brushConverter.ConvertFrom("#FF0000");*/
            label.Content = "색깔 : 빨강";
            label.Background = new SolidColorBrush(Colors.Red);
        }

        private void buttonGreen_Click(object sender, RoutedEventArgs e)
        {
            label.Content = "색깔 : 초록";
            label.Background = new SolidColorBrush(Colors.Green);
        }

        private void buttonBlue_Click(object sender, RoutedEventArgs e)
        {
            label.Content = "색깔 : 파랑";
            label.Background = new SolidColorBrush(Colors.Blue);
        }

        private void button_Click(object sender, RoutedEventArgs e)
        {
            label.Content = "색상 : " + ((Button)sender).Content;
            label.Background = ((Button)sender).Background;
        }
    }
}
