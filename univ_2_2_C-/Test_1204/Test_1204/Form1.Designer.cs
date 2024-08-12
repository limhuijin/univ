namespace Test_1204
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
            label1 = new Label();
            button1 = new Button();
            button2 = new Button();
            button3 = new Button();
            SuspendLayout();
            // 
            // label1
            // 
            label1.AutoSize = true;
            label1.Font = new Font("맑은 고딕", 24F, FontStyle.Regular, GraphicsUnit.Point);
            label1.Location = new Point(308, 133);
            label1.Name = "label1";
            label1.Size = new Size(142, 45);
            label1.TabIndex = 0;
            label1.Text = "00:00:00";
            label1.Click += label1_Click;
            // 
            // button1
            // 
            button1.Font = new Font("맑은 고딕", 20F, FontStyle.Regular, GraphicsUnit.Point);
            button1.Location = new Point(115, 251);
            button1.Name = "button1";
            button1.Size = new Size(171, 73);
            button1.TabIndex = 1;
            button1.Text = "시작";
            button1.UseVisualStyleBackColor = true;
            button1.Click += button1_Click;
            // 
            // button2
            // 
            button2.Font = new Font("맑은 고딕", 20F, FontStyle.Regular, GraphicsUnit.Point);
            button2.Location = new Point(292, 251);
            button2.Name = "button2";
            button2.Size = new Size(171, 73);
            button2.TabIndex = 2;
            button2.Text = "일시정지";
            button2.UseVisualStyleBackColor = true;
            button2.Click += button2_Click;
            // 
            // button3
            // 
            button3.Font = new Font("맑은 고딕", 20F, FontStyle.Regular, GraphicsUnit.Point);
            button3.Location = new Point(469, 251);
            button3.Name = "button3";
            button3.Size = new Size(171, 73);
            button3.TabIndex = 3;
            button3.Text = "초기화";
            button3.UseVisualStyleBackColor = true;
            button3.Click += button3_Click;
            // 
            // Form1
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(800, 450);
            Controls.Add(button3);
            Controls.Add(button2);
            Controls.Add(button1);
            Controls.Add(label1);
            Name = "Form1";
            Text = "Form1";
            Load += Form1_Load_1;
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private Label label1;
        private Button button1;
        private Button button2;
        private Button button3;
    }
}