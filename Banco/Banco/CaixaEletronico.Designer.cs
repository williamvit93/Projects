namespace Banco
{
    partial class CaixaEletronico
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
            this.txtTitular = new System.Windows.Forms.TextBox();
            this.txtNumero = new System.Windows.Forms.TextBox();
            this.txtSaldo = new System.Windows.Forms.TextBox();
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.btnDepositar = new System.Windows.Forms.Button();
            this.txtValor = new System.Windows.Forms.TextBox();
            this.lblDepositar = new System.Windows.Forms.Label();
            this.btnSacar = new System.Windows.Forms.Button();
            this.comboContas = new System.Windows.Forms.ComboBox();
            this.comboTransferir = new System.Windows.Forms.ComboBox();
            this.label4 = new System.Windows.Forms.Label();
            this.label5 = new System.Windows.Forms.Label();
            this.Transferir = new System.Windows.Forms.Button();
            this.btnNovaConta = new System.Windows.Forms.Button();
            this.txtTipoDeConta = new System.Windows.Forms.TextBox();
            this.label6 = new System.Windows.Forms.Label();
            this.btnQtdContas = new System.Windows.Forms.Button();
            this.btnRemoveTudo = new System.Windows.Forms.Button();
            this.btn_Remover = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // txtTitular
            // 
            this.txtTitular.Location = new System.Drawing.Point(202, 85);
            this.txtTitular.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.txtTitular.Name = "txtTitular";
            this.txtTitular.ReadOnly = true;
            this.txtTitular.Size = new System.Drawing.Size(570, 22);
            this.txtTitular.TabIndex = 1;
            // 
            // txtNumero
            // 
            this.txtNumero.Location = new System.Drawing.Point(202, 124);
            this.txtNumero.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.txtNumero.Name = "txtNumero";
            this.txtNumero.ReadOnly = true;
            this.txtNumero.Size = new System.Drawing.Size(181, 22);
            this.txtNumero.TabIndex = 2;
            // 
            // txtSaldo
            // 
            this.txtSaldo.Location = new System.Drawing.Point(591, 124);
            this.txtSaldo.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.txtSaldo.Name = "txtSaldo";
            this.txtSaldo.ReadOnly = true;
            this.txtSaldo.Size = new System.Drawing.Size(181, 22);
            this.txtSaldo.TabIndex = 4;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(124, 129);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(58, 17);
            this.label1.TabIndex = 5;
            this.label1.Text = "Número";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(521, 129);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(44, 17);
            this.label2.TabIndex = 6;
            this.label2.Text = "Saldo";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(134, 90);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(48, 17);
            this.label3.TabIndex = 7;
            this.label3.Text = "Titular";
            this.label3.Click += new System.EventHandler(this.label3_Click);
            // 
            // btnDepositar
            // 
            this.btnDepositar.Location = new System.Drawing.Point(333, 303);
            this.btnDepositar.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.btnDepositar.Name = "btnDepositar";
            this.btnDepositar.Size = new System.Drawing.Size(101, 41);
            this.btnDepositar.TabIndex = 8;
            this.btnDepositar.Text = "Depositar";
            this.btnDepositar.UseVisualStyleBackColor = true;
            this.btnDepositar.Click += new System.EventHandler(this.btnDepositar_Click_1);
            // 
            // txtValor
            // 
            this.txtValor.Location = new System.Drawing.Point(202, 168);
            this.txtValor.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.txtValor.Name = "txtValor";
            this.txtValor.Size = new System.Drawing.Size(181, 22);
            this.txtValor.TabIndex = 10;
            this.txtValor.KeyPress += new System.Windows.Forms.KeyPressEventHandler(this.txtValor_KeyPress);
            // 
            // lblDepositar
            // 
            this.lblDepositar.AutoSize = true;
            this.lblDepositar.Location = new System.Drawing.Point(138, 168);
            this.lblDepositar.Name = "lblDepositar";
            this.lblDepositar.Size = new System.Drawing.Size(41, 17);
            this.lblDepositar.TabIndex = 11;
            this.lblDepositar.Text = "Valor";
            // 
            // btnSacar
            // 
            this.btnSacar.Location = new System.Drawing.Point(180, 303);
            this.btnSacar.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.btnSacar.Name = "btnSacar";
            this.btnSacar.Size = new System.Drawing.Size(101, 41);
            this.btnSacar.TabIndex = 12;
            this.btnSacar.Text = "Sacar";
            this.btnSacar.UseVisualStyleBackColor = true;
            this.btnSacar.Click += new System.EventHandler(this.btnSacar_Click);
            // 
            // comboContas
            // 
            this.comboContas.FormattingEnabled = true;
            this.comboContas.Location = new System.Drawing.Point(203, 53);
            this.comboContas.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.comboContas.Name = "comboContas";
            this.comboContas.Size = new System.Drawing.Size(569, 24);
            this.comboContas.TabIndex = 13;
            this.comboContas.SelectedIndexChanged += new System.EventHandler(this.comboBox1_SelectedIndexChanged);
            // 
            // comboTransferir
            // 
            this.comboTransferir.FormattingEnabled = true;
            this.comboTransferir.Location = new System.Drawing.Point(202, 213);
            this.comboTransferir.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.comboTransferir.Name = "comboTransferir";
            this.comboTransferir.Size = new System.Drawing.Size(570, 24);
            this.comboTransferir.TabIndex = 14;
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(82, 216);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(100, 17);
            this.label4.TabIndex = 15;
            this.label4.Text = "Tranferir para:";
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Location = new System.Drawing.Point(134, 60);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(45, 17);
            this.label5.TabIndex = 16;
            this.label5.Text = "Conta";
            // 
            // Transferir
            // 
            this.Transferir.Location = new System.Drawing.Point(488, 303);
            this.Transferir.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.Transferir.Name = "Transferir";
            this.Transferir.Size = new System.Drawing.Size(115, 41);
            this.Transferir.TabIndex = 17;
            this.Transferir.Text = "Tranferir";
            this.Transferir.UseVisualStyleBackColor = true;
            this.Transferir.Click += new System.EventHandler(this.Transferir_Click_1);
            // 
            // btnNovaConta
            // 
            this.btnNovaConta.Location = new System.Drawing.Point(180, 366);
            this.btnNovaConta.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.btnNovaConta.Name = "btnNovaConta";
            this.btnNovaConta.Size = new System.Drawing.Size(101, 32);
            this.btnNovaConta.TabIndex = 18;
            this.btnNovaConta.Text = "Nova Conta";
            this.btnNovaConta.UseVisualStyleBackColor = true;
            this.btnNovaConta.Click += new System.EventHandler(this.btnNovaConta_Click);
            // 
            // txtTipoDeConta
            // 
            this.txtTipoDeConta.Location = new System.Drawing.Point(591, 168);
            this.txtTipoDeConta.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.txtTipoDeConta.Name = "txtTipoDeConta";
            this.txtTipoDeConta.ReadOnly = true;
            this.txtTipoDeConta.Size = new System.Drawing.Size(181, 22);
            this.txtTipoDeConta.TabIndex = 19;
            // 
            // label6
            // 
            this.label6.AutoSize = true;
            this.label6.Location = new System.Drawing.Point(529, 173);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(36, 17);
            this.label6.TabIndex = 20;
            this.label6.Text = "Tipo";
            // 
            // btnQtdContas
            // 
            this.btnQtdContas.Location = new System.Drawing.Point(650, 303);
            this.btnQtdContas.Name = "btnQtdContas";
            this.btnQtdContas.Size = new System.Drawing.Size(122, 95);
            this.btnQtdContas.TabIndex = 22;
            this.btnQtdContas.Text = "Quantidade de Contas";
            this.btnQtdContas.UseVisualStyleBackColor = true;
            this.btnQtdContas.Click += new System.EventHandler(this.btnMostrarQtdContas);
            // 
            // btnRemoveTudo
            // 
            this.btnRemoveTudo.Location = new System.Drawing.Point(488, 366);
            this.btnRemoveTudo.Name = "btnRemoveTudo";
            this.btnRemoveTudo.Size = new System.Drawing.Size(115, 32);
            this.btnRemoveTudo.TabIndex = 23;
            this.btnRemoveTudo.Text = "Remove Tudo";
            this.btnRemoveTudo.UseVisualStyleBackColor = true;
            this.btnRemoveTudo.Click += new System.EventHandler(this.btnRemoveTudo_Click);
            // 
            // btn_Remover
            // 
            this.btn_Remover.Location = new System.Drawing.Point(333, 366);
            this.btn_Remover.Name = "btn_Remover";
            this.btn_Remover.Size = new System.Drawing.Size(101, 32);
            this.btn_Remover.TabIndex = 24;
            this.btn_Remover.Text = "Remover";
            this.btn_Remover.UseVisualStyleBackColor = true;
            this.btn_Remover.Click += new System.EventHandler(this.btn_Remover_Click);
            // 
            // CaixaEletronico
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(857, 464);
            this.Controls.Add(this.btn_Remover);
            this.Controls.Add(this.btnRemoveTudo);
            this.Controls.Add(this.btnQtdContas);
            this.Controls.Add(this.label6);
            this.Controls.Add(this.txtTipoDeConta);
            this.Controls.Add(this.btnNovaConta);
            this.Controls.Add(this.Transferir);
            this.Controls.Add(this.label5);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.comboTransferir);
            this.Controls.Add(this.comboContas);
            this.Controls.Add(this.btnSacar);
            this.Controls.Add(this.lblDepositar);
            this.Controls.Add(this.txtValor);
            this.Controls.Add(this.btnDepositar);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.txtSaldo);
            this.Controls.Add(this.txtNumero);
            this.Controls.Add(this.txtTitular);
            this.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.Name = "CaixaEletronico";
            this.Text = "Caixa Eletrônico";
            this.Load += new System.EventHandler(this.CaixaEletronico_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion
        private System.Windows.Forms.TextBox txtTitular;
        private System.Windows.Forms.TextBox txtNumero;
        private System.Windows.Forms.TextBox txtSaldo;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Button btnDepositar;
        private System.Windows.Forms.TextBox txtValor;
        private System.Windows.Forms.Label lblDepositar;
        private System.Windows.Forms.Button btnSacar;
        private System.Windows.Forms.ComboBox comboContas;
        private System.Windows.Forms.ComboBox comboTransferir;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.Button Transferir;
        private System.Windows.Forms.Button btnNovaConta;
        private System.Windows.Forms.TextBox txtTipoDeConta;
        private System.Windows.Forms.Label label6;
        private System.Windows.Forms.Button btnQtdContas;
        private System.Windows.Forms.Button btnRemoveTudo;
        private System.Windows.Forms.Button btn_Remover;
    }
}

