namespace GestaoMarilucia
{
    partial class GestaoVendas
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
            this.btnCadCliente = new System.Windows.Forms.Button();
            this.btnCadVenda = new System.Windows.Forms.Button();
            this.btnReceber = new System.Windows.Forms.Button();
            this.btnRelatorios = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // btnCadCliente
            // 
            this.btnCadCliente.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnCadCliente.Location = new System.Drawing.Point(12, 90);
            this.btnCadCliente.Name = "btnCadCliente";
            this.btnCadCliente.Size = new System.Drawing.Size(165, 74);
            this.btnCadCliente.TabIndex = 0;
            this.btnCadCliente.Text = "Cadastrar Cliente";
            this.btnCadCliente.UseVisualStyleBackColor = true;
            this.btnCadCliente.Click += new System.EventHandler(this.btnCadCliente_Click);
            // 
            // btnCadVenda
            // 
            this.btnCadVenda.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnCadVenda.Location = new System.Drawing.Point(12, 188);
            this.btnCadVenda.Name = "btnCadVenda";
            this.btnCadVenda.Size = new System.Drawing.Size(165, 74);
            this.btnCadVenda.TabIndex = 1;
            this.btnCadVenda.Text = "Cadastrar Venda";
            this.btnCadVenda.UseVisualStyleBackColor = true;
            this.btnCadVenda.Click += new System.EventHandler(this.btnCadVenda_Click);
            // 
            // btnReceber
            // 
            this.btnReceber.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnReceber.Location = new System.Drawing.Point(12, 288);
            this.btnReceber.Name = "btnReceber";
            this.btnReceber.Size = new System.Drawing.Size(165, 74);
            this.btnReceber.TabIndex = 2;
            this.btnReceber.Text = "Registrar Recebimento";
            this.btnReceber.UseVisualStyleBackColor = true;
            this.btnReceber.Click += new System.EventHandler(this.btnReceber_Click);
            // 
            // btnRelatorios
            // 
            this.btnRelatorios.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnRelatorios.Location = new System.Drawing.Point(13, 396);
            this.btnRelatorios.Name = "btnRelatorios";
            this.btnRelatorios.Size = new System.Drawing.Size(164, 89);
            this.btnRelatorios.TabIndex = 3;
            this.btnRelatorios.Text = "Ver Relatórios";
            this.btnRelatorios.UseVisualStyleBackColor = true;
            this.btnRelatorios.Click += new System.EventHandler(this.btnRelatorios_Click);
            // 
            // GestaoVendas
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(706, 586);
            this.Controls.Add(this.btnRelatorios);
            this.Controls.Add(this.btnReceber);
            this.Controls.Add(this.btnCadVenda);
            this.Controls.Add(this.btnCadCliente);
            this.Name = "GestaoVendas";
            this.Text = "Gestão de Vendas";
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Button btnCadCliente;
        private System.Windows.Forms.Button btnCadVenda;
        private System.Windows.Forms.Button btnReceber;
        private System.Windows.Forms.Button btnRelatorios;
    }
}

