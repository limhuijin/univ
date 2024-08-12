using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace LoginForm
{
    public partial class Form2 : Form
    {
        public Form2()
        {
            InitializeComponent();
        }

        private void groupBox1_Enter(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            if (textBox1.Text.Equals("") || textBox2.Text.Equals("") || textBox3.Equals(""))
            {

                MessageBox.Show($"정보를 입력해주세요", "오류",
                        MessageBoxButtons.OK, MessageBoxIcon.Error);
                return; 
            }

            for (int i = 0; i < Form1.id.Count; i++)
            {
                if (textBox1.Text.Equals(Form1.id[i]))
                {
                    MessageBox.Show($"이미 존재하는 아이디입니다.", "회원가입 실패",
                    MessageBoxButtons.OK, MessageBoxIcon.Error);

                    return;
                }
            }

            MessageBox.Show($"회원가입에 성공하셨습니다.", "회원가입 성공",
                    MessageBoxButtons.OK);


            Form1.id.Add(textBox1.Text);
            Form1.password.Add(textBox2.Text);
            Form1.name.Add(textBox3.Text);
        }

        private void label3_Click(object sender, EventArgs e)
        {

        }

        private void textBox3_TextChanged(object sender, EventArgs e)
        {
            this.Close();
        }
    }
}
