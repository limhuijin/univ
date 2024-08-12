namespace FirstFormApp
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
            ClientSize = new Size(800, 500);
        }

        private void button1_Click(object sender, EventArgs e)
        {
            /*label1.Text = "버튼 클릭!!";
            Form form2 = new Form2();
            this.AddOwnedForm(form2);
            form2.Show();*/

            /*            if (String.IsNullOrEmpty(textBox1.Text))
                        {
                            label1.Text = "값이 없습니다.";
                        }
                        else
                        {
                            label1.Text = $"{textBox1.Text}님 환영합니다.";
                        }*/

            string str = "당신이 좋아하는 과일은 ";
            CheckBox[] cbs = new CheckBox[] {
                checkBox1, checkBox2, checkBox3, checkBox4
            };

            for (int i = 0; i < cbs.Length; i++)
            {
                if (cbs[i].Checked)
                {
                    str += cbs[i].Text + " ";
                }
            }

            str += "입니다.";
            
            label1.Text = str;
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void Form1_Load(object sender, EventArgs e)
        {
            CenterToParent();
        }

        private void checkBox1_CheckedChanged(object sender, EventArgs e)
        {

        }

        private void checkBox4_CheckedChanged(object sender, EventArgs e)
        {

        }

        private void label2_Click(object sender, EventArgs e)
        {

        }
    }
}