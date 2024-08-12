namespace imgViewerTest
{
    partial class Form1
    {
        /// <summary>
        ///  Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        ///  Clean up any resources being used.
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
        ///  Required method for Designer support - do not modify
        ///  the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            menuStrip1 = new MenuStrip();
            이미지입력ToolStripMenuItem = new ToolStripMenuItem();
            크기조절ToolStripMenuItem = new ToolStripMenuItem();
            normalToolStripMenuItem = new ToolStripMenuItem();
            autoSizeToolStripMenuItem = new ToolStripMenuItem();
            zoomToolStripMenuItem = new ToolStripMenuItem();
            종료ToolStripMenuItem = new ToolStripMenuItem();
            pictureBox1 = new PictureBox();
            openFileDialog1 = new OpenFileDialog();
            menuStrip1.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)pictureBox1).BeginInit();
            SuspendLayout();
            // 
            // menuStrip1
            // 
            menuStrip1.Items.AddRange(new ToolStripItem[] { 이미지입력ToolStripMenuItem, 크기조절ToolStripMenuItem, 종료ToolStripMenuItem });
            menuStrip1.Location = new Point(0, 0);
            menuStrip1.Name = "menuStrip1";
            menuStrip1.Size = new Size(800, 24);
            menuStrip1.TabIndex = 0;
            menuStrip1.Text = "menuStrip1";
            // 
            // 이미지입력ToolStripMenuItem
            // 
            이미지입력ToolStripMenuItem.Name = "이미지입력ToolStripMenuItem";
            이미지입력ToolStripMenuItem.Size = new Size(83, 20);
            이미지입력ToolStripMenuItem.Text = "이미지 입력";
            이미지입력ToolStripMenuItem.Click += 이미지입력ToolStripMenuItem_Click;
            // 
            // 크기조절ToolStripMenuItem
            // 
            크기조절ToolStripMenuItem.DropDownItems.AddRange(new ToolStripItem[] { normalToolStripMenuItem, autoSizeToolStripMenuItem, zoomToolStripMenuItem });
            크기조절ToolStripMenuItem.Name = "크기조절ToolStripMenuItem";
            크기조절ToolStripMenuItem.Size = new Size(71, 20);
            크기조절ToolStripMenuItem.Text = "크기 조절";
            // 
            // normalToolStripMenuItem
            // 
            normalToolStripMenuItem.Name = "normalToolStripMenuItem";
            normalToolStripMenuItem.Size = new Size(180, 22);
            normalToolStripMenuItem.Text = "normal";
            normalToolStripMenuItem.Click += noamlToolStripMenuItem_Click;
            // 
            // autoSizeToolStripMenuItem
            // 
            autoSizeToolStripMenuItem.Name = "autoSizeToolStripMenuItem";
            autoSizeToolStripMenuItem.Size = new Size(180, 22);
            autoSizeToolStripMenuItem.Text = "autoSize";
            autoSizeToolStripMenuItem.Click += autoSizeToolStripMenuItem_Click;
            // 
            // zoomToolStripMenuItem
            // 
            zoomToolStripMenuItem.Name = "zoomToolStripMenuItem";
            zoomToolStripMenuItem.Size = new Size(180, 22);
            zoomToolStripMenuItem.Text = "zoom";
            zoomToolStripMenuItem.Click += maxToolStripMenuItem_Click;
            // 
            // 종료ToolStripMenuItem
            // 
            종료ToolStripMenuItem.Name = "종료ToolStripMenuItem";
            종료ToolStripMenuItem.Size = new Size(43, 20);
            종료ToolStripMenuItem.Text = "종료";
            종료ToolStripMenuItem.Click += 종료ToolStripMenuItem_Click;
            // 
            // pictureBox1
            // 
            pictureBox1.Location = new Point(0, 27);
            pictureBox1.Name = "pictureBox1";
            pictureBox1.Size = new Size(800, 424);
            pictureBox1.TabIndex = 1;
            pictureBox1.TabStop = false;
            // 
            // openFileDialog1
            // 
            openFileDialog1.FileName = "openFileDialog1";
            // 
            // Form1
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(800, 450);
            Controls.Add(pictureBox1);
            Controls.Add(menuStrip1);
            MainMenuStrip = menuStrip1;
            Name = "Form1";
            Text = "Form1";
            menuStrip1.ResumeLayout(false);
            menuStrip1.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)pictureBox1).EndInit();
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private MenuStrip menuStrip1;
        private ToolStripMenuItem 이미지입력ToolStripMenuItem;
        private ToolStripMenuItem 크기조절ToolStripMenuItem;
        private ToolStripMenuItem normalToolStripMenuItem;
        private ToolStripMenuItem 종료ToolStripMenuItem;
        private PictureBox pictureBox1;
        private OpenFileDialog openFileDialog1;
        private ToolStripMenuItem autoSizeToolStripMenuItem;
        private ToolStripMenuItem zoomToolStripMenuItem;
    }
}