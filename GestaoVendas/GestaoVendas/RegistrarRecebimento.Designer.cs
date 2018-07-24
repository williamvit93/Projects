using System;
using System.Windows.Forms;

namespace GestaoVendas
{
    partial class RegistrarRecebimento
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
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(RegistrarRecebimento));
            this.comboClientes = new System.Windows.Forms.ComboBox();
            this.btnSalvar = new System.Windows.Forms.Button();
            this.txtValorRecebido = new System.Windows.Forms.TextBox();
            this.lblCliente = new System.Windows.Forms.Label();
            this.lblValor = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // comboClientes
            // 
            this.comboClientes.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.comboClientes.FormattingEnabled = true;
            this.comboClientes.Location = new System.Drawing.Point(246, 77);
            this.comboClientes.Name = "comboClientes";
            this.comboClientes.Size = new System.Drawing.Size(333, 33);
            this.comboClientes.TabIndex = 0;
            this.comboClientes.KeyPress += new System.Windows.Forms.KeyPressEventHandler(this.comboClientes_KeyPress);
            // 
            // btnSalvar
            // 
            this.btnSalvar.BackColor = System.Drawing.SystemColors.HotTrack;
            this.btnSalvar.Font = new System.Drawing.Font("Calibri", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnSalvar.ForeColor = System.Drawing.SystemColors.ControlLightLight;
            this.btnSalvar.Location = new System.Drawing.Point(301, 343);
            this.btnSalvar.Name = "btnSalvar";
            this.btnSalvar.Size = new System.Drawing.Size(124, 104);
            this.btnSalvar.TabIndex = 1;
            this.btnSalvar.Text = "SALVAR";
            this.btnSalvar.UseVisualStyleBackColor = false;
            this.btnSalvar.Click += new System.EventHandler(this.btnSalvar_Click);
            // 
            // txtValorRecebido
            // 
            this.txtValorRecebido.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtValorRecebido.Location = new System.Drawing.Point(246, 207);
            this.txtValorRecebido.Name = "txtValorRecebido";
            this.txtValorRecebido.Size = new System.Drawing.Size(140, 30);
            this.txtValorRecebido.TabIndex = 2;
            this.txtValorRecebido.KeyPress += new System.Windows.Forms.KeyPressEventHandler(this.txtValorRecebido_KeyPress);
            // 
            // lblCliente
            // 
            this.lblCliente.AutoSize = true;
            this.lblCliente.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblCliente.ForeColor = System.Drawing.SystemColors.ControlLightLight;
            this.lblCliente.Location = new System.Drawing.Point(154, 85);
            this.lblCliente.Name = "lblCliente";
            this.lblCliente.Size = new System.Drawing.Size(73, 25);
            this.lblCliente.TabIndex = 3;
            this.lblCliente.Text = "Cliente";
            // 
            // lblValor
            // 
            this.lblValor.AutoSize = true;
            this.lblValor.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblValor.ForeColor = System.Drawing.SystemColors.ControlLightLight;
            this.lblValor.Location = new System.Drawing.Point(39, 212);
            this.lblValor.Name = "lblValor";
            this.lblValor.Size = new System.Drawing.Size(188, 25);
            this.lblValor.TabIndex = 4;
            this.lblValor.Text = "Valor Recebido (R$)";
            // 
            // RegistrarRecebimento
            // 
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Inherit;
            this.BackColor = System.Drawing.SystemColors.ActiveCaption;
            this.ClientSize = new System.Drawing.Size(713, 512);
            this.Controls.Add(this.lblValor);
            this.Controls.Add(this.lblCliente);
            this.Controls.Add(this.txtValorRecebido);
            this.Controls.Add(this.btnSalvar);
            this.Controls.Add(this.comboClientes);
            this.Icon = ((System.Drawing.Icon)(resources.GetObject("$this.Icon")));
            this.MinimizeBox = false;
            this.Name = "RegistrarRecebimento";
            this.Text = "Registrar Recebimento";
            this.Load += new System.EventHandler(this.RegistrarRecebimento_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.ComboBox comboClientes;
        private System.Windows.Forms.Button btnSalvar;
        private System.Windows.Forms.TextBox txtValorRecebido;
        private System.Windows.Forms.Label lblCliente;
        private System.Windows.Forms.Label lblValor;
    }
}