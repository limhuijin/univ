namespace Test_1204
{
    public partial class Form1 : Form
    {
        System.Windows.Forms.Timer timer = new System.Windows.Forms.Timer();
        public int count = 0;
        public Form1()
        {
            InitializeComponent();
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        void Form1Tick(object sender, EventArgs e)                          
        {
            count++;
            int time1 = (count % 100);
            int time2 = (count / 100) % 60;
            int time3 = (count / 100) / 60;
            string timea = "";
            string timeb = "";
            string timec = "";

            if (time1 < 10)
            {
                timea = "0" + time1.ToString();
            }
            else
            {
                timea = time1.ToString();
            }

            if (time2 < 10)
            {
                timeb = "0" + time2.ToString();
            }
            else
            {
                timeb = time2.ToString();
            }

            if (time3 < 10)
            {
                timec = "0" + time3.ToString();
            }
            else
            {
                timec = time3.ToString();
            }

            label1.Text = $"{timec}:{timeb}:{timea}";
        }

        private void button1_Click(object sender, EventArgs e)
        {
            timer.Start();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            timer.Stop();
        }

        private void button3_Click(object sender, EventArgs e)
        {
            timer.Stop();
            count = 0;
            label1.Text = "00:00:00";
        }

        private void Form1_Load_1(object sender, EventArgs e)
        {
            timer.Interval = 10;
            timer.Tick += Form1Tick;
        }
    }
}