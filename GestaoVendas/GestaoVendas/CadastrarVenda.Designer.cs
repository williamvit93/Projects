using System;
using System.Windows.Forms;

namespace GestaoVendas
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
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(CadastrarVenda));
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
            this.lblMoeda = new System.Windows.Forms.Label();
            this.comboUnidade = new System.Windows.Forms.ComboBox();
            this.lblKg = new System.Windows.Forms.Label();
            this.lblUnidade = new System.Windows.Forms.Label();
            this.comboCampanha = new System.Windows.Forms.ComboBox();
            this.lblCampanha = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // comboClientes
            // 
            this.comboClientes.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.comboClientes.FormattingEnabled = true;
            this.comboClientes.Location = new System.Drawing.Point(174, 29);
            this.comboClientes.Name = "comboClientes";
            this.comboClientes.Size = new System.Drawing.Size(499, 33);
            this.comboClientes.TabIndex = 0;
            this.comboClientes.KeyPress += new System.Windows.Forms.KeyPressEventHandler(this.comboClientes_KeyPress);
            // 
            // lblClienteNome
            // 
            this.lblClienteNome.AutoSize = true;
            this.lblClienteNome.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblClienteNome.ForeColor = System.Drawing.SystemColors.ControlLightLight;
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
            this.lblProduto.ForeColor = System.Drawing.SystemColors.ControlLightLight;
            this.lblProduto.Location = new System.Drawing.Point(78, 139);
            this.lblProduto.Name = "lblProduto";
            this.lblProduto.Size = new System.Drawing.Size(80, 25);
            this.lblProduto.TabIndex = 2;
            this.lblProduto.Text = "Produto";
            // 
            // txtProduto
            // 
            this.txtProduto.CharacterCasing = System.Windows.Forms.CharacterCasing.Upper;
            this.txtProduto.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtProduto.Location = new System.Drawing.Point(174, 136);
            this.txtProduto.Name = "txtProduto";
            this.txtProduto.Size = new System.Drawing.Size(208, 30);
            this.txtProduto.TabIndex = 3;
            this.txtProduto.KeyPress += new System.Windows.Forms.KeyPressEventHandler(this.txtProduto_KeyPress);
            // 
            // txtPrecoUnit
            // 
            this.txtPrecoUnit.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.txtPrecoUnit.CausesValidation = false;
            this.txtPrecoUnit.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtPrecoUnit.Location = new System.Drawing.Point(213, 193);
            this.txtPrecoUnit.Name = "txtPrecoUnit";
            this.txtPrecoUnit.Size = new System.Drawing.Size(170, 30);
            this.txtPrecoUnit.TabIndex = 5;
            this.txtPrecoUnit.TextChanged += new System.EventHandler(this.txtPrecoUnit_TextChanged);
            this.txtPrecoUnit.KeyPress += new System.Windows.Forms.KeyPressEventHandler(this.txtPrecoUnit_KeyPress);
            // 
            // lblPrecoUnit
            // 
            this.lblPrecoUnit.AutoSize = true;
            this.lblPrecoUnit.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblPrecoUnit.ForeColor = System.Drawing.SystemColors.ControlLightLight;
            this.lblPrecoUnit.Location = new System.Drawing.Point(51, 199);
            this.lblPrecoUnit.Name = "lblPrecoUnit";
            this.lblPrecoUnit.Size = new System.Drawing.Size(107, 25);
            this.lblPrecoUnit.TabIndex = 5;
            this.lblPrecoUnit.Text = "Preço Unit.";
            // 
            // txtObservacoes
            // 
            this.txtObservacoes.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtObservacoes.Location = new System.Drawing.Point(29, 369);
            this.txtObservacoes.Multiline = true;
            this.txtObservacoes.Name = "txtObservacoes";
            this.txtObservacoes.Size = new System.Drawing.Size(453, 199);
            this.txtObservacoes.TabIndex = 8;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.ForeColor = System.Drawing.SystemColors.ControlLightLight;
            this.label1.Location = new System.Drawing.Point(30, 329);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(135, 25);
            this.label1.TabIndex = 7;
            this.label1.Text = "Observações:";
            // 
            // btnRegVenda
            // 
            this.btnRegVenda.BackColor = System.Drawing.SystemColors.HotTrack;
            this.btnRegVenda.FlatAppearance.BorderSize = 0;
            this.btnRegVenda.Font = new System.Drawing.Font("Calibri", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnRegVenda.ForeColor = System.Drawing.SystemColors.ControlLightLight;
            this.btnRegVenda.Location = new System.Drawing.Point(510, 409);
            this.btnRegVenda.Name = "btnRegVenda";
            this.btnRegVenda.Size = new System.Drawing.Size(163, 113);
            this.btnRegVenda.TabIndex = 9;
            this.btnRegVenda.Text = "REGISTRAR VENDA";
            this.btnRegVenda.UseVisualStyleBackColor = false;
            this.btnRegVenda.Click += new System.EventHandler(this.btnRegVenda_Click);
            // 
            // txtQtd
            // 
            this.txtQtd.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtQtd.Location = new System.Drawing.Point(522, 251);
            this.txtQtd.Name = "txtQtd";
            this.txtQtd.Size = new System.Drawing.Size(151, 30);
            this.txtQtd.TabIndex = 7;
            this.txtQtd.KeyPress += new System.Windows.Forms.KeyPressEventHandler(this.txtQtd_KeyPress);
            // 
            // lblQtd
            // 
            this.lblQtd.AutoSize = true;
            this.lblQtd.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblQtd.ForeColor = System.Drawing.SystemColors.ControlLightLight;
            this.lblQtd.Location = new System.Drawing.Point(402, 256);
            this.lblQtd.Name = "lblQtd";
            this.lblQtd.Size = new System.Drawing.Size(114, 25);
            this.lblQtd.TabIndex = 10;
            this.lblQtd.Text = "Quantidade";
            // 
            // comboTipo
            // 
            this.comboTipo.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.comboTipo.FormattingEnabled = true;
            this.comboTipo.Location = new System.Drawing.Point(174, 82);
            this.comboTipo.Name = "comboTipo";
            this.comboTipo.Size = new System.Drawing.Size(208, 33);
            this.comboTipo.TabIndex = 1;
            this.comboTipo.SelectedIndexChanged += new System.EventHandler(this.comboTipo_SelectedIndexChanged);
            this.comboTipo.KeyPress += new System.Windows.Forms.KeyPressEventHandler(this.comboTipo_KeyPress);
            // 
            // lblTipo
            // 
            this.lblTipo.AutoSize = true;
            this.lblTipo.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblTipo.ForeColor = System.Drawing.SystemColors.ControlLightLight;
            this.lblTipo.Location = new System.Drawing.Point(24, 90);
            this.lblTipo.Name = "lblTipo";
            this.lblTipo.Size = new System.Drawing.Size(141, 25);
            this.lblTipo.TabIndex = 12;
            this.lblTipo.Text = "Tipo de Venda";
            // 
            // txtCodigo
            // 
            this.txtCodigo.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtCodigo.Location = new System.Drawing.Point(522, 136);
            this.txtCodigo.Name = "txtCodigo";
            this.txtCodigo.Size = new System.Drawing.Size(151, 30);
            this.txtCodigo.TabIndex = 4;
            this.txtCodigo.KeyPress += new System.Windows.Forms.KeyPressEventHandler(this.txtCodigo_KeyPress);
            // 
            // lblCod
            // 
            this.lblCod.AutoSize = true;
            this.lblCod.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblCod.ForeColor = System.Drawing.SystemColors.ControlLightLight;
            this.lblCod.Location = new System.Drawing.Point(462, 141);
            this.lblCod.Name = "lblCod";
            this.lblCod.Size = new System.Drawing.Size(54, 25);
            this.lblCod.TabIndex = 14;
            this.lblCod.Text = "Cod.";
            // 
            // lblMoeda
            // 
            this.lblMoeda.AutoSize = true;
            this.lblMoeda.BackColor = System.Drawing.SystemColors.ControlLightLight;
            this.lblMoeda.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.lblMoeda.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblMoeda.ImageAlign = System.Drawing.ContentAlignment.BottomCenter;
            this.lblMoeda.Location = new System.Drawing.Point(174, 193);
            this.lblMoeda.MaximumSize = new System.Drawing.Size(100, 100);
            this.lblMoeda.MinimumSize = new System.Drawing.Size(25, 31);
            this.lblMoeda.Name = "lblMoeda";
            this.lblMoeda.Size = new System.Drawing.Size(38, 31);
            this.lblMoeda.TabIndex = 15;
            this.lblMoeda.Text = "R$";
            // 
            // comboUnidade
            // 
            this.comboUnidade.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.comboUnidade.FormattingEnabled = true;
            this.comboUnidade.Location = new System.Drawing.Point(174, 248);
            this.comboUnidade.Name = "comboUnidade";
            this.comboUnidade.Size = new System.Drawing.Size(100, 33);
            this.comboUnidade.TabIndex = 6;
            this.comboUnidade.SelectedIndexChanged += new System.EventHandler(this.comboUnidade_SelectedIndexChanged);
            this.comboUnidade.KeyPress += new System.Windows.Forms.KeyPressEventHandler(this.comboUnidade_KeyPress);
            // 
            // lblKg
            // 
            this.lblKg.AutoSize = true;
            this.lblKg.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblKg.ForeColor = System.Drawing.SystemColors.ControlLightLight;
            this.lblKg.Location = new System.Drawing.Point(475, 256);
            this.lblKg.Name = "lblKg";
            this.lblKg.Size = new System.Drawing.Size(41, 25);
            this.lblKg.TabIndex = 17;
            this.lblKg.Text = "KG";
            this.lblKg.Visible = false;
            // 
            // lblUnidade
            // 
            this.lblUnidade.AutoSize = true;
            this.lblUnidade.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblUnidade.ForeColor = System.Drawing.SystemColors.ControlLightLight;
            this.lblUnidade.Location = new System.Drawing.Point(73, 256);
            this.lblUnidade.Name = "lblUnidade";
            this.lblUnidade.Size = new System.Drawing.Size(85, 25);
            this.lblUnidade.TabIndex = 18;
            this.lblUnidade.Text = "Unidade";
            // 
            // comboCampanha
            // 
            this.comboCampanha.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.comboCampanha.FormattingEnabled = true;
            this.comboCampanha.Location = new System.Drawing.Point(522, 82);
            this.comboCampanha.Name = "comboCampanha";
            this.comboCampanha.Size = new System.Drawing.Size(151, 33);
            this.comboCampanha.TabIndex = 2;
            this.comboCampanha.Visible = false;
            this.comboCampanha.KeyPress += new System.Windows.Forms.KeyPressEventHandler(this.comboCampanha_KeyPress);
            // 
            // lblCampanha
            // 
            this.lblCampanha.AutoSize = true;
            this.lblCampanha.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblCampanha.ForeColor = System.Drawing.SystemColors.ControlLightLight;
            this.lblCampanha.Location = new System.Drawing.Point(402, 90);
            this.lblCampanha.Name = "lblCampanha";
            this.lblCampanha.Size = new System.Drawing.Size(109, 25);
            this.lblCampanha.TabIndex = 20;
            this.lblCampanha.Text = "Campanha";
            this.lblCampanha.Visible = false;
            // 
            // CadastrarVenda
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.SystemColors.ActiveCaption;
            this.ClientSize = new System.Drawing.Size(722, 584);
            this.Controls.Add(this.lblCampanha);
            this.Controls.Add(this.comboCampanha);
            this.Controls.Add(this.lblUnidade);
            this.Controls.Add(this.lblKg);
            this.Controls.Add(this.comboUnidade);
            this.Controls.Add(this.lblMoeda);
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
            this.Icon = ((System.Drawing.Icon)(resources.GetObject("$this.Icon")));
            this.MinimizeBox = false;
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
        private Label lblMoeda;
        private ComboBox comboUnidade;
        private Label lblKg;
        private Label lblUnidade;
        private ComboBox comboCampanha;
        private Label lblCampanha;
    }
}