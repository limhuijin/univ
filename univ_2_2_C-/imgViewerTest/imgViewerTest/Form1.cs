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

        private void 이미지입력ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            openFileDialog1.Filter = "이미지파일(.jpg)|*.jpg|모든파일(*.*)|*.*";
            openFileDialog1.Title = "이미지열기";
            openFileDialog1.FileName = "";
            openFileDialog1.ShowDialog();

            if (string.IsNullOrEmpty(openFileDialog1.FileName) == false)
            {
                pictureBox1.Image = new Bitmap(openFileDialog1.FileName);
            }
            pictureBox1.SizeMode = PictureBoxSizeMode.Zoom;
        }

        private void 종료ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Close();
        }
    }
}