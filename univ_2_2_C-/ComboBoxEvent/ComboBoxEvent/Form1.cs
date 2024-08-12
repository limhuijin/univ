namespace ComboBoxEvent
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
            //label1.Text = comboBox1.SelectedItem.ToString();
            label1.Text = ((ComboBox)sender).SelectedItem.ToString();
        }
    }
}