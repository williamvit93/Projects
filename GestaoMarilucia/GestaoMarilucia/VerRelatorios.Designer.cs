namespace GestaoMarilucia
{
    partial class VerRelatorios
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
            this.dataRelatorios = new System.Windows.Forms.DataGridView();
            this.btnClien = new System.Windows.Forms.Button();
            this.btnVendas = new System.Windows.Forms.Button();
            ((System.ComponentModel.ISupportInitialize)(this.dataRelatorios)).BeginInit();
            this.SuspendLayout();
            // 
            // dataRelatorios
            // 
            this.dataRelatorios.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dataRelatorios.Location = new System.Drawing.Point(226, 12);
            this.dataRelatorios.Name = "dataRelatorios";
            this.dataRelatorios.RowTemplate.Height = 24;
            this.dataRelatorios.Size = new System.Drawing.Size(720, 433);
            this.dataRelatorios.TabIndex = 0;
            // 
            // btnClien
            // 
            this.btnClien.Location = new System.Drawing.Point(75, 512);
            this.btnClien.Name = "btnClien";
            this.btnClien.Size = new System.Drawing.Size(75, 23);
            this.btnClien.TabIndex = 1;
            this.btnClien.Text = "button1";
            this.btnClien.UseVisualStyleBackColor = true;
            this.btnClien.Click += new System.EventHandler(this.btnClien_Click);
            // 
            // btnVendas
            // 
            this.btnVendas.Location = new System.Drawing.Point(284, 512);
            this.btnVendas.Name = "btnVendas";
            this.btnVendas.Size = new System.Drawing.Size(75, 23);
            this.btnVendas.TabIndex = 2;
            this.btnVendas.Text = "button2";
            this.btnVendas.UseVisualStyleBackColor = true;
            this.btnVendas.Click += new System.EventHandler(this.btnVendas_Click);
            // 
            // VerRelatorios
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(1152, 664);
            this.Controls.Add(this.btnVendas);
            this.Controls.Add(this.btnClien);
            this.Controls.Add(this.dataRelatorios);
            this.Name = "VerRelatorios";
            this.Text = "Ver Relatorios";
            this.Load += new System.EventHandler(this.VerRelatorios_Load);
            ((System.ComponentModel.ISupportInitialize)(this.dataRelatorios)).EndInit();
            this.ResumeLayout(false);

        }

        #endregion
        private System.Windows.Forms.Button btnVendaProdutos;
        private System.Windows.Forms.Button btnClientes;
        private System.Windows.Forms.DataGridView dataRelatorios;
        private System.Windows.Forms.Button btnClien;
        private System.Windows.Forms.Button btnVendas;
    }
}