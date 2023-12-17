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
using System.IO;
using System.Runtime.Serialization.Formatters.Binary;

namespace C_231211_MoveScreen
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

        private void btnNext_Click(object sender, RoutedEventArgs e)
        {
            Welcome w = new Welcome();
            w.Show(); // ShowDialog는 새로 띄운 창만 포커스 (모달-모달리스랑 비슷한 개념)
            Close(); // 이전 페이지 닫힘
        }

        private void btnSave_Click(object sender, RoutedEventArgs e)
        {
            UserData userData = new UserData();
            userData.name = "SeonJin";
            userData.number = 23;

            string path = "D:\\C#_2051057\\C_231211_MoveScreen\\Save";
            string fileName = "UserData.txt";

            // using System.IO 추가해야 FileStream 사용 가능
            FileStream fs = new FileStream(path + fileName, FileMode.Create);

            // using System.Runtime.Serialization.Formatters.Binary 추가해야 BinaryFormatter 사용가능
            BinaryFormatter bf = new BinaryFormatter(); // BinaryFormatter: 직렬화를 위한 기능 (클래스 형식으로 저장하기 위해선 직렬화가 필요)
            bf.Serialize(fs, userData);
            fs.Close();
        }
    }
}
