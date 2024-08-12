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
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace C_231211_ColorBoard
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();
        }

        private void Button_Click(object sender, RoutedEventArgs e)
        {
            var bc = new BrushConverter();
            textBox.Background = (Brush)bc.ConvertFrom("#FF0000");
        }

        private void Button_Click_1(object sender, RoutedEventArgs e)
        {
            var bc = new BrushConverter();
            textBox.Background = (Brush)bc.ConvertFrom("#FFFF00");
        }

        private void Button_Click_2(object sender, RoutedEventArgs e)
        {
            var bc = new BrushConverter();
            textBox.Background = (Brush)bc.ConvertFrom("#0000FF");
        }

        private void Button_Click_3(object sender, RoutedEventArgs e)
        {
            var bc = new BrushConverter();
            textBox.Background = (Brush)bc.ConvertFrom("#00FF00");
        }

        private void Button_Click_4(object sender, RoutedEventArgs e)
        {
            var bc = new BrushConverter();
            textBox.Background = (Brush)bc.ConvertFrom("#FF7F50");
        }

        private void Button_Click_5(object sender, RoutedEventArgs e)
        {
            var bc = new BrushConverter();
            textBox.Background = (Brush)bc.ConvertFrom("#9922CC");
        }

        private void Button_Click_6(object sender, RoutedEventArgs e)
        {
            var bc = new BrushConverter();
            textBox.Background = (Brush)bc.ConvertFrom("#FFF0F5");
        }

        private void Button_Click_7(object sender, RoutedEventArgs e)
        {
            var bc = new BrushConverter();
            textBox.Background = (Brush)bc.ConvertFrom("#000000");
        }
    }
}
