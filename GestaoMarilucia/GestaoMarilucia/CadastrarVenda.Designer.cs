namespace GestaoMarilucia
{
    partial class CadastrarVenda
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
            this.comboClientes = new System.Windows.Forms.ComboBox();
            this.lblClienteNome = new System.Windows.Forms.Label();
            this.lblProduto = new System.Windows.Forms.Label();
            this.txtProduto = new System.Windows.Forms.TextBox();
            this.txtPrecoUnit = new System.Windows.Forms.TextBox();
            this.lblPrecoUnit = new System.Windows.Forms.Label();
            this.txtObservacoes = new System.Windows.Forms.TextBox();
            this.label1 = new System.Windows.Forms.Label();
            this.btnRegVenda = new System.Windows.Forms.Button();
            this.txtQtd = new System.Windows.Forms.TextBox();
            this.lblQtd = new System.Windows.Forms.Label();
            this.comboTipo = new System.Windows.Forms.ComboBox();
            this.lblTipo = new System.Windows.Forms.Label();
            this.txtCodigo = new System.Windows.Forms.TextBox();
            this.lblCod = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // comboClientes
            // 
            this.comboClientes.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.comboClientes.FormattingEnabled = true;
            this.comboClientes.Location = new System.Drawing.Point(199, 29);
            this.comboClientes.Name = "comboClientes";
            this.comboClientes.Size = new System.Drawing.Size(374, 33);
            this.comboClientes.TabIndex = 0;
            // 
            // lblClienteNome
            // 
            this.lblClienteNome.AutoSize = true;
            this.lblClienteNome.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblClienteNome.Location = new System.Drawing.Point(85, 32);
            this.lblClienteNome.Name = "lblClienteNome";
            this.lblClienteNome.Size = new System.Drawing.Size(73, 25);
            this.lblClienteNome.TabIndex = 1;
            this.lblClienteNome.Text = "Cliente";
            // 
            // lblProduto
            // 
            this.lblProduto.AutoSize = true;
            this.lblProduto.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblProduto.Location = new System.Drawing.Point(85, 137);
            this.lblProduto.Name = "lblProduto";
            this.lblProduto.Size = new System.Drawing.Size(80, 25);
            this.lblProduto.TabIndex = 2;
            this.lblProduto.Text = "Produto";
            // 
            // txtProduto
            // 
            this.txtProduto.CharacterCasing = System.Windows.Forms.CharacterCasing.Upper;
            this.txtProduto.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtProduto.Location = new System.Drawing.Point(199, 132);
            this.txtProduto.Name = "txtProduto";
            this.txtProduto.Size = new System.Drawing.Size(208, 30);
            this.txtProduto.TabIndex = 2;
            this.txtProduto.KeyPress += new System.Windows.Forms.KeyPressEventHandler(this.txtProduto_KeyPress);
            // 
            // txtPrecoUnit
            // 
            this.txtPrecoUnit.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.txtPrecoUnit.CausesValidation = false;
            this.txtPrecoUnit.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtPrecoUnit.Location = new System.Drawing.Point(199, 186);
            this.txtPrecoUnit.Name = "txtPrecoUnit";
            this.txtPrecoUnit.Size = new System.Drawing.Size(100, 30);
            this.txtPrecoUnit.TabIndex = 4;
            this.txtPrecoUnit.TextChanged += new System.EventHandler(this.txtPrecoUnit_TextChanged);
            this.txtPrecoUnit.KeyPress += new System.Windows.Forms.KeyPressEventHandler(this.txtPrecoUnit_KeyPress);
            // 
            // lblPrecoUnit
            // 
            this.lblPrecoUnit.AutoSize = true;
            this.lblPrecoUnit.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblPrecoUnit.Location = new System.Drawing.Point(2, 191);
            this.lblPrecoUnit.Name = "lblPrecoUnit";
            this.lblPrecoUnit.Size = new System.Drawing.Size(177, 25);
            this.lblPrecoUnit.TabIndex = 5;
            this.lblPrecoUnit.Text = "Preço Unitário (R$)";
            // 
            // txtObservacoes
            // 
            this.txtObservacoes.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtObservacoes.Location = new System.Drawing.Point(37, 288);
            this.txtObservacoes.Multiline = true;
            this.txtObservacoes.Name = "txtObservacoes";
            this.txtObservacoes.Size = new System.Drawing.Size(395, 204);
            this.txtObservacoes.TabIndex = 6;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(30, 250);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(135, 25);
            this.label1.TabIndex = 7;
            this.label1.Text = "Observações:";
            // 
            // btnRegVenda
            // 
            this.btnRegVenda.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnRegVenda.Location = new System.Drawing.Point(469, 331);
            this.btnRegVenda.Name = "btnRegVenda";
            this.btnRegVenda.Size = new System.Drawing.Size(120, 102);
            this.btnRegVenda.TabIndex = 7;
            this.btnRegVenda.Text = "Registrar Venda";
            this.btnRegVenda.UseVisualStyleBackColor = true;
            this.btnRegVenda.Click += new System.EventHandler(this.btnRegVenda_Click);
            // 
            // txtQtd
            // 
            this.txtQtd.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtQtd.Location = new System.Drawing.Point(489, 189);
            this.txtQtd.Name = "txtQtd";
            this.txtQtd.Size = new System.Drawing.Size(100, 30);
            this.txtQtd.TabIndex = 5;
            this.txtQtd.KeyPress += new System.Windows.Forms.KeyPressEventHandler(this.txtQtd_KeyPress);
            // 
            // lblQtd
            // 
            this.lblQtd.AutoSize = true;
            this.lblQtd.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblQtd.Location = new System.Drawing.Point(351, 194);
            this.lblQtd.Name = "lblQtd";
            this.lblQtd.Size = new System.Drawing.Size(114, 25);
            this.lblQtd.TabIndex = 10;
            this.lblQtd.Text = "Quantidade";
            // 
            // comboTipo
            // 
            this.comboTipo.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.comboTipo.FormattingEnabled = true;
            this.comboTipo.Location = new System.Drawing.Point(199, 82);
            this.comboTipo.Name = "comboTipo";
            this.comboTipo.Size = new System.Drawing.Size(208, 33);
            this.comboTipo.TabIndex = 1;
            // 
            // lblTipo
            // 
            this.lblTipo.AutoSize = true;
            this.lblTipo.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblTipo.Location = new System.Drawing.Point(24, 90);
            this.lblTipo.Name = "lblTipo";
            this.lblTipo.Size = new System.Drawing.Size(141, 25);
            this.lblTipo.TabIndex = 12;
            this.lblTipo.Text = "Tipo de Venda";
            // 
            // txtCodigo
            // 
            this.txtCodigo.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtCodigo.Location = new System.Drawing.Point(489, 132);
            this.txtCodigo.Name = "txtCodigo";
            this.txtCodigo.Size = new System.Drawing.Size(100, 30);
            this.txtCodigo.TabIndex = 3;
            this.txtCodigo.KeyPress += new System.Windows.Forms.KeyPressEventHandler(this.txtCodigo_KeyPress);
            // 
            // lblCod
            // 
            this.lblCod.AutoSize = true;
            this.lblCod.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblCod.Location = new System.Drawing.Point(411, 137);
            this.lblCod.Name = "lblCod";
            this.lblCod.Size = new System.Drawing.Size(54, 25);
            this.lblCod.TabIndex = 14;
            this.lblCod.Text = "Cod.";
            // 
            // CadastrarVenda
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(613, 504);
            this.Controls.Add(this.lblCod);
            this.Controls.Add(this.txtCodigo);
            this.Controls.Add(this.lblTipo);
            this.Controls.Add(this.comboTipo);
            this.Controls.Add(this.lblQtd);
            this.Controls.Add(this.txtQtd);
            this.Controls.Add(this.btnRegVenda);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.txtObservacoes);
            this.Controls.Add(this.lblPrecoUnit);
            this.Controls.Add(this.txtPrecoUnit);
            this.Controls.Add(this.txtProduto);
            this.Controls.Add(this.lblProduto);
            this.Controls.Add(this.lblClienteNome);
            this.Controls.Add(this.comboClientes);
            this.Name = "CadastrarVenda";
            this.Text = "Cadastro de Vendas";
            this.Load += new System.EventHandler(this.CadastrarVenda_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.ComboBox comboClientes;
        private System.Windows.Forms.Label lblClienteNome;
        private System.Windows.Forms.Label lblProduto;
        private System.Windows.Forms.TextBox txtProduto;
        private System.Windows.Forms.TextBox txtPrecoUnit;
        private System.Windows.Forms.Label lblPrecoUnit;
        private System.Windows.Forms.TextBox txtObservacoes;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Button btnRegVenda;
        private System.Windows.Forms.TextBox txtQtd;
        private System.Windows.Forms.Label lblQtd;
        private System.Windows.Forms.ComboBox comboTipo;
        private System.Windows.Forms.Label lblTipo;
        private System.Windows.Forms.TextBox txtCodigo;
        private System.Windows.Forms.Label lblCod;
    }
}