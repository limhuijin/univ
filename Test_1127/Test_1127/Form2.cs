using System;
using System.Collections;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using static System.Windows.Forms.VisualStyles.VisualStyleElement;
using static Test_1127.Form1;

namespace Test_1127
{
    public partial class Form2 : Form
    {
        public Form2()
        {
            InitializeComponent();
        }

        private void listBox1_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            list.Items.Clear();

            for (int i = 0; i < Form1.lis.Count; i++)
            {
                for (var j = 0; j < Form1.lis.Count - 1 - i; j++)
                {
                    if (Form1.lis[j].aver < Form1.lis[j + 1].aver)
                    {
                        var temp = Form1.lis[j];
                        Form1.lis[j] = Form1.lis[j + 1];
                        Form1.lis[j + 1] = temp;
                    }
                }
            }

            for (int i = 0; i < Form1.lis.Count; i++)
            {
                list.Items.Add($"이름 : {Form1.lis[i].name}\t 국어 : {Form1.lis[i].sub1}\t 영어 : {Form1.lis[i].sub2}\t 수학 : {Form1.lis[i].sub3}\t");
            }
        }
    }
}
