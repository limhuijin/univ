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
using System.IO;
using System.Runtime.Serialization.Formatters.Binary;

namespace C_231211_MoveScreen
{
    /// <summary>
    /// Welcome.xaml에 대한 상호 작용 논리
    /// </summary>
    public partial class Welcome : Window
    {
        public Welcome()
        {
            InitializeComponent();
        }

        private void btnPrev_Click(object sender, RoutedEventArgs e)
        {
            MainWindow m = new MainWindow();
            m.Show();
            Close();
        }

        private void btnLoad_Click(object sender, RoutedEventArgs e)
        {
            // using System.IO;, using System.Runtime.Serialization.Formatters.Binary; 먼저 추가

            string path = "D:\\C#_2051057\\C_231211_MoveScreen\\Save";
            string fileName = "UserData.txt";

            try
            {
                FileStream fs = new FileStream(path + fileName, FileMode.Open);
                BinaryFormatter bf = new BinaryFormatter();
                UserData ud = bf.Deserialize(fs) as UserData;
                fs.Close();
                text1.Text = $"{ud.name}, {ud.number}";
            }

            catch
            {
                text1.Text = "파일이 없습니다.";
            }

        }
    }
}
