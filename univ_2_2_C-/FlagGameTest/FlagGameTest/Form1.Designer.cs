namespace FlagGameTest
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
            textBox1 = new TextBox();
            textBox2 = new TextBox();
            textBox3 = new TextBox();
            textBox4 = new TextBox();
            button1 = new Button();
            button2 = new Button();
            button3 = new Button();
            button4 = new Button();
            label1 = new Label();
            label2 = new Label();
            label3 = new Label();
            SuspendLayout();
            // 
            // textBox1
            // 
            textBox1.Font = new Font("맑은 고딕", 20F, FontStyle.Regular, GraphicsUnit.Point);
            textBox1.Location = new Point(77, 113);
            textBox1.Name = "textBox1";
            textBox1.Size = new Size(100, 43);
            textBox1.TabIndex = 0;
            textBox1.TextChanged += textBox1_TextChanged;
            // 
            // textBox2
            // 
            textBox2.Font = new Font("맑은 고딕", 20F, FontStyle.Regular, GraphicsUnit.Point);
            textBox2.Location = new Point(77, 176);
            textBox2.Name = "textBox2";
            textBox2.Size = new Size(100, 43);
            textBox2.TabIndex = 1;
            textBox2.TextChanged += textBox2_TextChanged;
            // 
            // textBox3
            // 
            textBox3.Font = new Font("맑은 고딕", 20F, FontStyle.Regular, GraphicsUnit.Point);
            textBox3.Location = new Point(236, 113);
            textBox3.Name = "textBox3";
            textBox3.Size = new Size(100, 43);
            textBox3.TabIndex = 2;
            textBox3.TextChanged += textBox3_TextChanged;
            // 
            // textBox4
            // 
            textBox4.Font = new Font("맑은 고딕", 20F, FontStyle.Regular, GraphicsUnit.Point);
            textBox4.Location = new Point(236, 176);
            textBox4.Name = "textBox4";
            textBox4.Size = new Size(100, 43);
            textBox4.TabIndex = 3;
            textBox4.TextChanged += textBox4_TextChanged;
            // 
            // button1
            // 
            button1.Font = new Font("맑은 고딕", 20F, FontStyle.Regular, GraphicsUnit.Point);
            button1.Location = new Point(48, 273);
            button1.Name = "button1";
            button1.Size = new Size(149, 68);
            button1.TabIndex = 4;
            button1.Text = "청기 올려";
            button1.UseVisualStyleBackColor = false;
            button1.Click += button1_Click;
            // 
            // button2
            // 
            button2.Font = new Font("맑은 고딕", 20F, FontStyle.Regular, GraphicsUnit.Point);
            button2.Location = new Point(48, 358);
            button2.Name = "button2";
            button2.Size = new Size(149, 68);
            button2.TabIndex = 5;
            button2.Text = "청기 내려";
            button2.UseVisualStyleBackColor = false;
            button2.Click += button2_Click;
            // 
            // button3
            // 
            button3.Font = new Font("맑은 고딕", 20F, FontStyle.Regular, GraphicsUnit.Point);
            button3.Location = new Point(215, 273);
            button3.Name = "button3";
            button3.Size = new Size(149, 68);
            button3.TabIndex = 6;
            button3.Text = "적기 올려";
            button3.UseVisualStyleBackColor = false;
            button3.Click += button3_Click;
            // 
            // button4
            // 
            button4.Font = new Font("맑은 고딕", 20F, FontStyle.Regular, GraphicsUnit.Point);
            button4.Location = new Point(215, 358);
            button4.Name = "button4";
            button4.Size = new Size(149, 68);
            button4.TabIndex = 7;
            button4.Text = "적기 내려";
            button4.UseVisualStyleBackColor = false;
            button4.Click += button4_Click;
            // 
            // label1
            // 
            label1.AutoSize = true;
            label1.Font = new Font("맑은 고딕", 20F, FontStyle.Regular, GraphicsUnit.Point);
            label1.Location = new Point(60, 29);
            label1.Name = "label1";
            label1.Size = new Size(137, 37);
            label1.TabIndex = 8;
            label1.Text = "라이프 : 5";
            label1.Click += label1_Click;
            // 
            // label2
            // 
            label2.AutoSize = true;
            label2.Font = new Font("맑은 고딕", 20F, FontStyle.Regular, GraphicsUnit.Point);
            label2.Location = new Point(395, 29);
            label2.Name = "label2";
            label2.Size = new Size(110, 37);
            label2.TabIndex = 9;
            label2.Text = "점수 : 5";
            label2.Click += label2_Click;
            // 
            // label3
            // 
            label3.AutoSize = true;
            label3.Font = new Font("맑은 고딕", 20F, FontStyle.Regular, GraphicsUnit.Point);
            label3.Location = new Point(406, 176);
            label3.Name = "label3";
            label3.Size = new Size(71, 37);
            label3.TabIndex = 10;
            label3.Text = "준비";
            label3.Click += label3_Click;
            // 
            // Form1
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(598, 450);
            Controls.Add(label3);
            Controls.Add(label2);
            Controls.Add(label1);
            Controls.Add(button4);
            Controls.Add(button3);
            Controls.Add(button2);
            Controls.Add(button1);
            Controls.Add(textBox4);
            Controls.Add(textBox3);
            Controls.Add(textBox2);
            Controls.Add(textBox1);
            Name = "Form1";
            Text = "Form1";
            Load += Form1_Load;
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private TextBox textBox1;
        private TextBox textBox2;
        private TextBox textBox3;
        private TextBox textBox4;
        private Button button1;
        private Button button2;
        private Button button3;
        private Button button4;
        private Label label1;
        private Label label2;
        private Label label3;
    }
}