namespace Test_1127
{
    partial class Form2
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            list = new ListBox();
            button1 = new Button();
            SuspendLayout();
            // 
            // list
            // 
            list.FormattingEnabled = true;
            list.ItemHeight = 15;
            list.Location = new Point(0, 0);
            list.Name = "list";
            list.Size = new Size(460, 304);
            list.TabIndex = 0;
            list.SelectedIndexChanged += listBox1_SelectedIndexChanged;
            // 
            // button1
            // 
            button1.Location = new Point(161, 339);
            button1.Name = "button1";
            button1.Size = new Size(145, 67);
            button1.TabIndex = 1;
            button1.Text = "출력";
            button1.UseVisualStyleBackColor = true;
            button1.Click += button1_Click;
            // 
            // Form2
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(461, 450);
            Controls.Add(button1);
            Controls.Add(list);
            Name = "Form2";
            Text = "Form2";
            ResumeLayout(false);
        }

        #endregion

        private ListBox list;
        private Button button1;
    }
}