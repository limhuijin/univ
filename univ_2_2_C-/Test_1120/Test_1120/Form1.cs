namespace Test_1120
{
    public partial class Form1 : Form
    {
        int sum = 0;
        int printSum = 0;
        int num = -1;
        bool isor = false;

        public Form1()
        {
            InitializeComponent();
        }

        private void radioButton4_CheckedChanged(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            buttonClick(0);
        }

        private void button2_Click(object sender, EventArgs e)
        {
            buttonClick(1);
        }

        private void button3_Click(object sender, EventArgs e)
        {
            buttonClick(2);
        }

        private void button4_Click(object sender, EventArgs e)
        {
            buttonClick(3);
        }

        private void button5_Click(object sender, EventArgs e)
        {
            buttonClick(4);
        }

        private void button6_Click(object sender, EventArgs e)
        {
            buttonClick(5);
        }

        private void button7_Click(object sender, EventArgs e)
        {
            buttonClick(6);
        }

        private void button8_Click(object sender, EventArgs e)
        {
            buttonClick(7);
        }

        private void button9_Click(object sender, EventArgs e)
        {
            buttonClick(8);
        }

        private void button10_Click(object sender, EventArgs e)
        {
            buttonClick(9);
        }

        private void button11_Click(object sender, EventArgs e)
        {
            sum = 0;
            printSum = 0;
            label1.Text = null;
            label2.Text = null;
        }

        private void button12_Click(object sender, EventArgs e)
        {
            switch (num) {
                case 0:
                    label2.Text = printSum.ToString() + " + " + sum.ToString() + " = ";
                    printSum += sum ;
                    label1.Text = printSum.ToString();
                    break;
                case 1:
                    label2.Text = (sum - printSum).ToString();
                    printSum = (sum + printSum);
                    break;
                case 2:
                    label2.Text = (sum * printSum).ToString();
                    printSum = (sum + printSum);
                    break;
                case 3:
                    label2.Text = (sum / printSum).ToString();
                    printSum = (sum + printSum);
                    break;
            }
            isor = true;
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void label2_Click(object sender, EventArgs e)
        {

        }

        public void buttonClick(int num)
        {
            if(isor == true)
            {
                sum += printSum;
                printSum = 0;
                label1.Text = null;
                label2.Text = null;
                isor = false;
            }

            printSum = printSum * 10 + num;
            label1.Text = printSum.ToString();
        }
        public void radioClick(int num)
        {
            sum = printSum;
            printSum = 0;
            label1.Text = printSum.ToString();
            label2.Text = sum.ToString();
        }


        private void radioButton1_CheckedChanged(object sender, EventArgs e)
        {

        }

        private void button13_Click(object sender, EventArgs e)
        {
            sum = printSum;
            printSum = 0;
            label1.Text = printSum.ToString();
            label2.Text = sum.ToString() + " + ";
            num = 0;
        }

        private void button14_Click(object sender, EventArgs e)
        {
            sum = printSum;
            printSum = 0;
            label1.Text = printSum.ToString();
            label2.Text = sum.ToString() + " - ";
            num = 1;
        }

        private void button15_Click(object sender, EventArgs e)
        {
            sum = printSum;
            printSum = 0;
            label1.Text = printSum.ToString();
            label2.Text = sum.ToString() + " x ";
            num = 2;
        }

        private void button16_Click(object sender, EventArgs e)
        {
            sum = printSum;
            printSum = 0;
            label1.Text = printSum.ToString();
            label2.Text = sum.ToString() + " % ";
            num = 3;
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }
    }
}