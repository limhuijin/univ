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
                    MessageBox.Show($"�α��� ����\n{name[i]}�� ȯ���մϴ�.", "�α���");
                    return;
                }
            }

            MessageBox.Show($"���̵�� �н����带 Ȯ�����ּ���.", "�α��� ����",
                    MessageBoxButtons.OK, MessageBoxIcon.Error);
        }

        private void button2_Click(object sender, EventArgs e)
        {
            Form form2 = new Form2();

            form2.Show();
        }
    }
}