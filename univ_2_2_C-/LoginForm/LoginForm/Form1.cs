namespace LoginForm
{
    public partial class Form1 : Form
    {
        static public List<String> id = new List<string>();
        static public List<String> password = new List<string>();
        static public List<String> name = new List<string>();

        public Form1()
        {
            InitializeComponent();
        }

        private void groupBox1_Enter(object sender, EventArgs e)
        {

        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            for (int i = 0; i < id.Count; i++)
            {
                if (textBox1.Text.Equals(id[i]) && textBox2.Text.Equals(password[i]))
                {
                    MessageBox.Show($"로그인 성공\n{name[i]}님 환영합니다.", "로그인");
                    return;
                }
            }

            MessageBox.Show($"아이디와 패스워드를 확인해주세요.", "로그인 실패",
                    MessageBoxButtons.OK, MessageBoxIcon.Error);
        }

        private void button2_Click(object sender, EventArgs e)
        {
            Form form2 = new Form2();

            form2.Show();
        }
    }
}