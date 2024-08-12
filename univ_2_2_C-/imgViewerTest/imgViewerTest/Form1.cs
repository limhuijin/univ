namespace imgViewerTest
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void noamlToolStripMenuItem_Click(object sender, EventArgs e)
        {
            pictureBox1.SizeMode = PictureBoxSizeMode.Normal;
        }

        private void autoSizeToolStripMenuItem_Click(object sender, EventArgs e)
        {
            pictureBox1.SizeMode = PictureBoxSizeMode.AutoSize;
        }

        private void maxToolStripMenuItem_Click(object sender, EventArgs e)
        {
            pictureBox1.SizeMode = PictureBoxSizeMode.Zoom;
        }

        private void �̹����Է�ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            openFileDialog1.Filter = "�̹�������(.jpg)|*.jpg|�������(*.*)|*.*";
            openFileDialog1.Title = "�̹�������";
            openFileDialog1.FileName = "";
            openFileDialog1.ShowDialog();

            if (string.IsNullOrEmpty(openFileDialog1.FileName) == false)
            {
                pictureBox1.Image = new Bitmap(openFileDialog1.FileName);
            }
            pictureBox1.SizeMode = PictureBoxSizeMode.Zoom;
        }

        private void ����ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Close();
        }
    }
}