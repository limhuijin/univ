namespace RadioButtonEvent
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void groupBox1_Enter(object sender, EventArgs e)
        {

        }

        private void radioButton4_CheckedChanged(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            string result = "";
            RadioButton[] radioButtons = new RadioButton[]
            {
                radioButton1, radioButton2, radioButton3, radioButton4, radioButton5
            };

            for (int i = 0; i < 3; i++)
            {
                if (radioButtons[i].Checked)
                {
                    result = radioButtons[i].Text + "학과 ";
                    break;
                }
            }

            for (int i = 3; i < 5; i++)
            {
                if (radioButtons[i].Checked)
                {
                    result += radioButtons[i].Text + "입니다.";
                    break;
                }
            }

            label2.Text = result;
        }
    }
}