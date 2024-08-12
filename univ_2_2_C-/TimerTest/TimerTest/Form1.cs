namespace TimerTest
{
    public partial class Form1 : Form
    {
        private int count = 0;

        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            System.Windows.Forms.Timer timer = new System.Windows.Forms.Timer();
            timer.Interval = 1000;
            timer.Tick += Form1Tick;
            timer.Start();
        }

        void Form1Tick(object sender, EventArgs e)
        {
            label1.Text = count++.ToString();
        }
    }
}