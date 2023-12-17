namespace FlagGameTest
{
    public partial class Form1 : Form
    {
        System.Windows.Forms.Timer timer = new System.Windows.Forms.Timer();
        public int count = 0;
        public int life = 6;
        public int sum = 0;
        public int click = -1;
        public bool isBoll = false;
        public bool isBoll1 = false;
        int ran = -1;
        public string[] str = new string[] { "청기 올려", "청기 내려", "적기 올려", "적기 내려" };

        Random random = new Random();

        public Form1()
        {
            InitializeComponent();
        }
        private void Form1_Load(object sender, EventArgs e)
        {
            timer.Interval = 100;
            timer.Tick += Form1Tick;
            timer.Start();

            ran = random.Next(0, 4);
        }

        void Form1Tick(object sender, EventArgs e)
        {
            count++;

            if (count < 20)
            {
                if (isBoll == true)
                {
                    if (ran != click)
                    {
                        label1.Text = "라이프 : " + (--life).ToString();
                        click = -1;
                        isBoll = false;
                    }
                    else
                    {
                        label2.Text = "점수 : " + (++sum).ToString();
                        click = -1;
                        isBoll = false;
                    }
                }
            }
            else
            {
                if (isBoll1 != true)
                {
                    label1.Text = "라이프 : " + (--life).ToString();
                }

                isBoll1 = false;

                textBox1.BackColor = System.Drawing.Color.White;
                textBox2.BackColor = System.Drawing.Color.White;
                textBox3.BackColor = System.Drawing.Color.White;
                textBox4.BackColor = System.Drawing.Color.White;
                count = 0;

                ran = random.Next(0, 4);

                label3.Text = str[ran];
                isBoll = false;
            }
        }

        private void label2_Click(object sender, EventArgs e)
        {

        }

        private void label3_Click(object sender, EventArgs e)
        {

        }

        private void label1_Click(object sender, EventArgs e)
        {

        }


        private void button1_Click(object sender, EventArgs e)
        {
            textBox1.BackColor = System.Drawing.Color.Blue;
            click = 0;
            isBoll = true;
            isBoll1 = true;
        }

        private void button2_Click(object sender, EventArgs e)
        {
            textBox2.BackColor = System.Drawing.Color.Blue;
            click = 1;
            isBoll = true;
            isBoll1 = true;
        }

        private void button3_Click(object sender, EventArgs e)
        {
            textBox3.BackColor = System.Drawing.Color.Red;
            click = 2;
            isBoll = true;
            isBoll1 = true;
        }

        private void button4_Click(object sender, EventArgs e)
        {
            textBox4.BackColor = System.Drawing.Color.Red;
            click = 3;
            isBoll = true;
            isBoll1 = true;
        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void textBox2_TextChanged(object sender, EventArgs e)
        {

        }

        private void textBox3_TextChanged(object sender, EventArgs e)
        {

        }

        private void textBox4_TextChanged(object sender, EventArgs e)
        {

        }
    }
}