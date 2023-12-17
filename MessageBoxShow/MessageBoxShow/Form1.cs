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
            MessageBox.Show("메세지 박스.", "기본");
            MessageBox.Show("약속시간이 늦었습니다.", "일정", MessageBoxButtons.OK, MessageBoxIcon.Error);
            MessageBox.Show("느낌표와 알림", "안내", MessageBoxButtons.OK, MessageBoxIcon.Exclamation);

            DialogResult result = MessageBox.Show(
                "3개의 버튼과 아이콘", "아이콘 표시", MessageBoxButtons.YesNoCancel, MessageBoxIcon.Question);

            label1.Text = $"{result.ToString()} -> {(int)result}";

            if(result == DialogResult.Yes)
            {

            }
        }
    }
}