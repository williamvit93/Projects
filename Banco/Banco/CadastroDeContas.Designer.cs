namespace Banco
{
    partial class CadastroDeContas
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
            this.btnCadastrar = new System.Windows.Forms.Button();
            this.label1 = new System.Windows.Forms.Label();
            this.txtTitularNovaConta = new System.Windows.Forms.TextBox();
            this.comboTipoConta = new System.Windows.Forms.ComboBox();
            this.label3 = new System.Windows.Forms.Label();
            this.txtCpf = new System.Windows.Forms.TextBox();
            this.label4 = new System.Windows.Forms.Label();
            this.txtRg = new System.Windows.Forms.TextBox();
            this.txtRua = new System.Windows.Forms.TextBox();
            this.txtNasc = new System.Windows.Forms.DateTimePicker();
            this.lbn_Nasc = new System.Windows.Forms.Label();
            this.lbn_Rg = new System.Windows.Forms.Label();
            this.lblRua = new System.Windows.Forms.Label();
            this.btn_CarrContas = new System.Windows.Forms.Button();
            this.txtNumeroCasa = new System.Windows.Forms.TextBox();
            this.lblNum = new System.Windows.Forms.Label();
            this.lblCep = new System.Windows.Forms.Label();
            this.txtCep = new System.Windows.Forms.TextBox();
            this.txtBairro = new System.Windows.Forms.TextBox();
            this.txtCidade = new System.Windows.Forms.TextBox();
            this.lblCidade = new System.Windows.Forms.Label();
            this.lblUf = new System.Windows.Forms.Label();
            this.lblBairro = new System.Windows.Forms.Label();
            this.btnCep = new System.Windows.Forms.Button();
            this.txtUf = new System.Windows.Forms.TextBox();
            this.SuspendLayout();
            // 
            // btnCadastrar
            // 
            this.btnCadastrar.Location = new System.Drawing.Point(293, 277);
            this.btnCadastrar.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.btnCadastrar.Name = "btnCadastrar";
            this.btnCadastrar.Size = new System.Drawing.Size(135, 81);
            this.btnCadastrar.TabIndex = 16;
            this.btnCadastrar.Text = "Cadastrar";
            this.btnCadastrar.UseVisualStyleBackColor = true;
            this.btnCadastrar.Click += new System.EventHandler(this.btnCadastrar_Click);
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(30, 62);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(48, 17);
            this.label1.TabIndex = 1;
            this.label1.Text = "Titular";
            // 
            // txtTitularNovaConta
            // 
            this.txtTitularNovaConta.CharacterCasing = System.Windows.Forms.CharacterCasing.Upper;
            this.txtTitularNovaConta.Location = new System.Drawing.Point(104, 62);
            this.txtTitularNovaConta.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.txtTitularNovaConta.Name = "txtTitularNovaConta";
            this.txtTitularNovaConta.Size = new System.Drawing.Size(576, 22);
            this.txtTitularNovaConta.TabIndex = 5;
            this.txtTitularNovaConta.KeyPress += new System.Windows.Forms.KeyPressEventHandler(this.txtTitularNovaConta_KeyPress);
            // 
            // comboTipoConta
            // 
            this.comboTipoConta.FormattingEnabled = true;
            this.comboTipoConta.Location = new System.Drawing.Point(104, 244);
            this.comboTipoConta.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.comboTipoConta.Name = "comboTipoConta";
            this.comboTipoConta.Size = new System.Drawing.Size(145, 24);
            this.comboTipoConta.TabIndex = 15;
            this.comboTipoConta.KeyPress += new System.Windows.Forms.KeyPressEventHandler(this.comboTipoConta_KeyPress);
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(42, 244);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(36, 17);
            this.label3.TabIndex = 4;
            this.label3.Text = "Tipo";
            // 
            // txtCpf
            // 
            this.txtCpf.Location = new System.Drawing.Point(104, 105);
            this.txtCpf.Name = "txtCpf";
            this.txtCpf.Size = new System.Drawing.Size(145, 22);
            this.txtCpf.TabIndex = 6;
            this.txtCpf.KeyPress += new System.Windows.Forms.KeyPressEventHandler(this.txtCpf_KeyPress);
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(44, 110);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(34, 17);
            this.label4.TabIndex = 2;
            this.label4.Text = "CPF";
            // 
            // txtRg
            // 
            this.txtRg.Location = new System.Drawing.Point(334, 105);
            this.txtRg.Name = "txtRg";
            this.txtRg.Size = new System.Drawing.Size(157, 22);
            this.txtRg.TabIndex = 7;
            this.txtRg.KeyPress += new System.Windows.Forms.KeyPressEventHandler(this.txtRg_KeyPress);
            // 
            // txtRua
            // 
            this.txtRua.CharacterCasing = System.Windows.Forms.CharacterCasing.Upper;
            this.txtRua.Location = new System.Drawing.Point(104, 147);
            this.txtRua.Name = "txtRua";
            this.txtRua.Size = new System.Drawing.Size(295, 22);
            this.txtRua.TabIndex = 9;
            this.txtRua.TextChanged += new System.EventHandler(this.txtRua_TextChanged);
            // 
            // txtNasc
            // 
            this.txtNasc.Format = System.Windows.Forms.DateTimePickerFormat.Short;
            this.txtNasc.Location = new System.Drawing.Point(582, 105);
            this.txtNasc.Name = "txtNasc";
            this.txtNasc.Size = new System.Drawing.Size(98, 22);
            this.txtNasc.TabIndex = 8;
            // 
            // lbn_Nasc
            // 
            this.lbn_Nasc.AutoSize = true;
            this.lbn_Nasc.Location = new System.Drawing.Point(494, 108);
            this.lbn_Nasc.Name = "lbn_Nasc";
            this.lbn_Nasc.Size = new System.Drawing.Size(82, 17);
            this.lbn_Nasc.TabIndex = 12;
            this.lbn_Nasc.Text = "Nascimento";
            // 
            // lbn_Rg
            // 
            this.lbn_Rg.AutoSize = true;
            this.lbn_Rg.Location = new System.Drawing.Point(290, 108);
            this.lbn_Rg.Name = "lbn_Rg";
            this.lbn_Rg.Size = new System.Drawing.Size(29, 17);
            this.lbn_Rg.TabIndex = 13;
            this.lbn_Rg.Text = "RG";
            // 
            // lblRua
            // 
            this.lblRua.AutoSize = true;
            this.lblRua.Location = new System.Drawing.Point(44, 150);
            this.lblRua.Name = "lblRua";
            this.lblRua.Size = new System.Drawing.Size(34, 17);
            this.lblRua.TabIndex = 14;
            this.lblRua.Text = "Rua";
            // 
            // btn_CarrContas
            // 
            this.btn_CarrContas.Location = new System.Drawing.Point(12, 371);
            this.btn_CarrContas.Name = "btn_CarrContas";
            this.btn_CarrContas.Size = new System.Drawing.Size(135, 44);
            this.btn_CarrContas.TabIndex = 17;
            this.btn_CarrContas.Text = "Carregar Contas";
            this.btn_CarrContas.UseVisualStyleBackColor = true;
            this.btn_CarrContas.Click += new System.EventHandler(this.btn_CarrContas_Click);
            // 
            // txtNumeroCasa
            // 
            this.txtNumeroCasa.Location = new System.Drawing.Point(436, 147);
            this.txtNumeroCasa.Name = "txtNumeroCasa";
            this.txtNumeroCasa.Size = new System.Drawing.Size(55, 22);
            this.txtNumeroCasa.TabIndex = 10;
            // 
            // lblNum
            // 
            this.lblNum.AutoSize = true;
            this.lblNum.Location = new System.Drawing.Point(405, 147);
            this.lblNum.Name = "lblNum";
            this.lblNum.Size = new System.Drawing.Size(23, 17);
            this.lblNum.TabIndex = 17;
            this.lblNum.Text = "Nº";
            // 
            // lblCep
            // 
            this.lblCep.AutoSize = true;
            this.lblCep.Location = new System.Drawing.Point(498, 149);
            this.lblCep.Name = "lblCep";
            this.lblCep.Size = new System.Drawing.Size(35, 17);
            this.lblCep.TabIndex = 18;
            this.lblCep.Text = "CEP";
            // 
            // txtCep
            // 
            this.txtCep.Location = new System.Drawing.Point(539, 146);
            this.txtCep.Name = "txtCep";
            this.txtCep.Size = new System.Drawing.Size(90, 22);
            this.txtCep.TabIndex = 11;
            // 
            // txtBairro
            // 
            this.txtBairro.Location = new System.Drawing.Point(104, 194);
            this.txtBairro.Name = "txtBairro";
            this.txtBairro.Size = new System.Drawing.Size(166, 22);
            this.txtBairro.TabIndex = 12;
            // 
            // txtCidade
            // 
            this.txtCidade.Location = new System.Drawing.Point(348, 196);
            this.txtCidade.Name = "txtCidade";
            this.txtCidade.Size = new System.Drawing.Size(143, 22);
            this.txtCidade.TabIndex = 13;
            // 
            // lblCidade
            // 
            this.lblCidade.AutoSize = true;
            this.lblCidade.Location = new System.Drawing.Point(290, 199);
            this.lblCidade.Name = "lblCidade";
            this.lblCidade.Size = new System.Drawing.Size(52, 17);
            this.lblCidade.TabIndex = 23;
            this.lblCidade.Text = "Cidade";
            // 
            // lblUf
            // 
            this.lblUf.AutoSize = true;
            this.lblUf.Location = new System.Drawing.Point(507, 199);
            this.lblUf.Name = "lblUf";
            this.lblUf.Size = new System.Drawing.Size(26, 17);
            this.lblUf.TabIndex = 24;
            this.lblUf.Text = "UF";
            // 
            // lblBairro
            // 
            this.lblBairro.AutoSize = true;
            this.lblBairro.Location = new System.Drawing.Point(45, 198);
            this.lblBairro.Name = "lblBairro";
            this.lblBairro.Size = new System.Drawing.Size(46, 17);
            this.lblBairro.TabIndex = 25;
            this.lblBairro.Text = "Bairro";
            // 
            // btnCep
            // 
            this.btnCep.Location = new System.Drawing.Point(640, 146);
            this.btnCep.Name = "btnCep";
            this.btnCep.Size = new System.Drawing.Size(82, 72);
            this.btnCep.TabIndex = 26;
            this.btnCep.Text = "Buscar CEP";
            this.btnCep.UseVisualStyleBackColor = true;
            this.btnCep.Click += new System.EventHandler(this.btnCep_Click);
            // 
            // txtUf
            // 
            this.txtUf.Location = new System.Drawing.Point(539, 196);
            this.txtUf.Name = "txtUf";
            this.txtUf.Size = new System.Drawing.Size(90, 22);
            this.txtUf.TabIndex = 27;
            // 
            // CadastroDeContas
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(734, 477);
            this.Controls.Add(this.txtUf);
            this.Controls.Add(this.btnCep);
            this.Controls.Add(this.lblBairro);
            this.Controls.Add(this.lblUf);
            this.Controls.Add(this.lblCidade);
            this.Controls.Add(this.txtCidade);
            this.Controls.Add(this.txtBairro);
            this.Controls.Add(this.txtCep);
            this.Controls.Add(this.lblCep);
            this.Controls.Add(this.lblNum);
            this.Controls.Add(this.txtNumeroCasa);
            this.Controls.Add(this.btn_CarrContas);
            this.Controls.Add(this.lblRua);
            this.Controls.Add(this.lbn_Rg);
            this.Controls.Add(this.lbn_Nasc);
            this.Controls.Add(this.txtNasc);
            this.Controls.Add(this.txtRua);
            this.Controls.Add(this.txtRg);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.txtCpf);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.comboTipoConta);
            this.Controls.Add(this.txtTitularNovaConta);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.btnCadastrar);
            this.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.Name = "CadastroDeContas";
            this.Text = "Cadastro de Contas";
            this.Load += new System.EventHandler(this.CadastroDeContas_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button btnCadastrar;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.TextBox txtTitularNovaConta;
        private System.Windows.Forms.ComboBox comboTipoConta;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.TextBox txtCpf;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.TextBox txtRg;
        private System.Windows.Forms.TextBox txtRua;
        private System.Windows.Forms.DateTimePicker txtNasc;
        private System.Windows.Forms.Label lbn_Nasc;
        private System.Windows.Forms.Label lbn_Rg;
        private System.Windows.Forms.Label lblRua;
        private System.Windows.Forms.Button btn_CarrContas;
        private System.Windows.Forms.TextBox txtNumeroCasa;
        private System.Windows.Forms.Label lblNum;
        private System.Windows.Forms.Label lblCep;
        private System.Windows.Forms.TextBox txtCep;
        private System.Windows.Forms.TextBox txtBairro;
        private System.Windows.Forms.TextBox txtCidade;
        private System.Windows.Forms.Label lblCidade;
        private System.Windows.Forms.Label lblUf;
        private System.Windows.Forms.Label lblBairro;
        private System.Windows.Forms.Button btnCep;
        private System.Windows.Forms.TextBox txtUf;
    }
}