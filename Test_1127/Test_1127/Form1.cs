using System.Collections.Generic;
using System.Security.Principal;
using System.Xml.Linq;

namespace Test_1127
{
    public partial class Form1 : Form
    {
        public static List<Student> lis = new List<Student>();
        public static Dictionary<string, string> dict = new Dictionary<string, string>();
        public struct Student
        {
            public string name;
            public string acount;
            public string sub1;
            public string sub2;
            public string sub3;
            public int aver;

            public Student()
            {
                name = "";
                acount = "";
                sub1 = "";
                sub2 = "";
                sub3 = "";
                aver = 0;
            }
            public Student(string name, string acount, string sub1, string sub2, string sub3)
            {
                this.name = name;
                this.acount = acount;
                this.sub1 = sub1;
                this.sub2 = sub2;
                this.sub3 = sub3;
                aver = int.Parse(sub1) + int.Parse(sub2) + int.Parse(sub3);
            }
        }

        public Form1()
        {
            InitializeComponent();
        }

        private void label2_Click(object sender, EventArgs e)
        {

        }

        private void label4_Click(object sender, EventArgs e)
        {

        }

        private void label5_Click(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            string name = textBox2.Text;
            string acount = textBox1.Text;
            string sub1 = textBox3.Text;
            string sub2 = textBox4.Text;
            string sub3 = textBox5.Text;

            if (dict.ContainsKey(acount))
            {
                MessageBox.Show("중복입니다.");
            }
            else
            {
                dict[acount] = name;
                lis.Add(new Student(name, acount, sub1, sub2, sub3));
                MessageBox.Show($"추가되었습니다.", "추가", MessageBoxButtons.OK);
            }
        }

        private void button2_Click(object sender, EventArgs e)
        {
            Form2 form2 = new Form2();

            form2.Show();
        }
    }
}