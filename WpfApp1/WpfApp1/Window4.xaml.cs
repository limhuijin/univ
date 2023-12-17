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
    /// Window4.xaml에 대한 상호 작용 논리
    /// </summary>
    public partial class Window4 : Window
    {
        public Window4()
        {
            InitializeComponent();
            comboYear.Items.Add(2023);
            for (int i = 1; i <= 12; i++)
            {
                comboMonth.Items.Add(i);
            }

            DateTime dt = new DateTime(2023, 12, 15);
            int startWeek = dt.DayOfWeek.GetHashCode();
        }

    }
}
