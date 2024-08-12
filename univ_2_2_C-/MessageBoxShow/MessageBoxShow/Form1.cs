namespace MessageBoxShow
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            MessageBox.Show("�޼��� �ڽ�.", "�⺻");
            MessageBox.Show("��ӽð��� �ʾ����ϴ�.", "����", MessageBoxButtons.OK, MessageBoxIcon.Error);
            MessageBox.Show("����ǥ�� �˸�", "�ȳ�", MessageBoxButtons.OK, MessageBoxIcon.Exclamation);

            DialogResult result = MessageBox.Show(
                "3���� ��ư�� ������", "������ ǥ��", MessageBoxButtons.YesNoCancel, MessageBoxIcon.Question);

            label1.Text = $"{result.ToString()} -> {(int)result}";

            if(result == DialogResult.Yes)
            {

            }
        }
    }
}