using System;

namespace GestaoVendas
{
    partial class GestaoVenda
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
            System.Windows.Forms.TableLayoutPanel tableLayoutPanel1;
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(GestaoVenda));
            this.btnRelatorios = new System.Windows.Forms.Button();
            this.btnCadCampanha = new System.Windows.Forms.Button();
            this.btnReceber = new System.Windows.Forms.Button();
            this.btnCadVenda = new System.Windows.Forms.Button();
            this.btnCadCliente = new System.Windows.Forms.Button();
            this.pFoto = new System.Windows.Forms.Panel();
            this.panel1 = new System.Windows.Forms.Panel();
            this.label1 = new System.Windows.Forms.Label();
            this.lblTitulo = new System.Windows.Forms.Label();
            tableLayoutPanel1 = new System.Windows.Forms.TableLayoutPanel();
            tableLayoutPanel1.SuspendLayout();
            this.panel1.SuspendLayout();
            this.SuspendLayout();
            // 
            // tableLayoutPanel1
            // 
            tableLayoutPanel1.BackColor = System.Drawing.SystemColors.ActiveCaptionText;
            tableLayoutPanel1.CellBorderStyle = System.Windows.Forms.TableLayoutPanelCellBorderStyle.OutsetPartial;
            tableLayoutPanel1.ColumnCount = 3;
            tableLayoutPanel1.ColumnStyles.Add(new System.Windows.Forms.ColumnStyle(System.Windows.Forms.SizeType.Percent, 50F));
            tableLayoutPanel1.ColumnStyles.Add(new System.Windows.Forms.ColumnStyle(System.Windows.Forms.SizeType.Percent, 50F));
            tableLayoutPanel1.ColumnStyles.Add(new System.Windows.Forms.ColumnStyle(System.Windows.Forms.SizeType.Absolute, 248F));
            tableLayoutPanel1.Controls.Add(this.btnRelatorios, 2, 0);
            tableLayoutPanel1.Controls.Add(this.btnCadCampanha, 1, 0);
            tableLayoutPanel1.Controls.Add(this.btnReceber, 2, 1);
            tableLayoutPanel1.Controls.Add(this.btnCadVenda, 0, 1);
            tableLayoutPanel1.Controls.Add(this.btnCadCliente, 0, 0);
            tableLayoutPanel1.Controls.Add(this.pFoto, 1, 1);
            tableLayoutPanel1.Location = new System.Drawing.Point(1, 156);
            tableLayoutPanel1.Name = "tableLayoutPanel1";
            tableLayoutPanel1.RowCount = 2;
            tableLayoutPanel1.RowStyles.Add(new System.Windows.Forms.RowStyle(System.Windows.Forms.SizeType.Percent, 48F));
            tableLayoutPanel1.RowStyles.Add(new System.Windows.Forms.RowStyle(System.Windows.Forms.SizeType.Percent, 52F));
            tableLayoutPanel1.Size = new System.Drawing.Size(755, 418);
            tableLayoutPanel1.TabIndex = 6;
            // 
            // btnRelatorios
            // 
            this.btnRelatorios.BackColor = System.Drawing.SystemColors.HotTrack;
            this.btnRelatorios.Font = new System.Drawing.Font("Calibri", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnRelatorios.ForeColor = System.Drawing.SystemColors.ControlLightLight;
            this.btnRelatorios.Location = new System.Drawing.Point(506, 6);
            this.btnRelatorios.Name = "btnRelatorios";
            this.btnRelatorios.Size = new System.Drawing.Size(243, 190);
            this.btnRelatorios.TabIndex = 3;
            this.btnRelatorios.Text = "MOSTRAR DADOS";
            this.btnRelatorios.UseVisualStyleBackColor = false;
            this.btnRelatorios.Click += new System.EventHandler(this.btnRelatorios_Click);
            // 
            // btnCadCampanha
            // 
            this.btnCadCampanha.BackColor = System.Drawing.SystemColors.HotTrack;
            this.btnCadCampanha.Font = new System.Drawing.Font("Calibri", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnCadCampanha.ForeColor = System.Drawing.SystemColors.ControlLightLight;
            this.btnCadCampanha.Location = new System.Drawing.Point(256, 6);
            this.btnCadCampanha.Name = "btnCadCampanha";
            this.btnCadCampanha.Size = new System.Drawing.Size(241, 190);
            this.btnCadCampanha.TabIndex = 5;
            this.btnCadCampanha.Text = "CADASTRAR CAMPANHA";
            this.btnCadCampanha.UseVisualStyleBackColor = false;
            this.btnCadCampanha.Click += new System.EventHandler(this.btnCadCampanha_Click);
            // 
            // btnReceber
            // 
            this.btnReceber.BackColor = System.Drawing.SystemColors.HotTrack;
            this.btnReceber.Font = new System.Drawing.Font("Calibri", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnReceber.ForeColor = System.Drawing.SystemColors.ControlLightLight;
            this.btnReceber.Location = new System.Drawing.Point(506, 205);
            this.btnReceber.Name = "btnReceber";
            this.btnReceber.Size = new System.Drawing.Size(243, 207);
            this.btnReceber.TabIndex = 2;
            this.btnReceber.Text = "REGISTRAR RECEBIMENTO";
            this.btnReceber.UseVisualStyleBackColor = false;
            this.btnReceber.Click += new System.EventHandler(this.btnReceber_Click);
            // 
            // btnCadVenda
            // 
            this.btnCadVenda.BackColor = System.Drawing.SystemColors.HotTrack;
            this.btnCadVenda.Font = new System.Drawing.Font("Calibri", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnCadVenda.ForeColor = System.Drawing.SystemColors.ControlLightLight;
            this.btnCadVenda.Location = new System.Drawing.Point(6, 205);
            this.btnCadVenda.Name = "btnCadVenda";
            this.btnCadVenda.Size = new System.Drawing.Size(241, 207);
            this.btnCadVenda.TabIndex = 1;
            this.btnCadVenda.Text = "CADASTRAR VENDA";
            this.btnCadVenda.UseVisualStyleBackColor = false;
            this.btnCadVenda.Click += new System.EventHandler(this.btnCadVenda_Click);
            // 
            // btnCadCliente
            // 
            this.btnCadCliente.BackColor = System.Drawing.SystemColors.HotTrack;
            this.btnCadCliente.Font = new System.Drawing.Font("Calibri", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnCadCliente.ForeColor = System.Drawing.SystemColors.ControlLightLight;
            this.btnCadCliente.Location = new System.Drawing.Point(6, 6);
            this.btnCadCliente.Name = "btnCadCliente";
            this.btnCadCliente.Size = new System.Drawing.Size(241, 190);
            this.btnCadCliente.TabIndex = 0;
            this.btnCadCliente.Text = "CADASTRAR CLIENTE";
            this.btnCadCliente.UseVisualStyleBackColor = false;
            this.btnCadCliente.Click += new System.EventHandler(this.btnCadCliente_Click);
            // 
            // pFoto
            // 
            this.pFoto.Location = new System.Drawing.Point(256, 205);
            this.pFoto.Name = "pFoto";
            this.pFoto.Size = new System.Drawing.Size(241, 207);
            this.pFoto.TabIndex = 6;
            // 
            // panel1
            // 
            this.panel1.BackColor = System.Drawing.SystemColors.ButtonHighlight;
            this.panel1.Controls.Add(this.label1);
            this.panel1.Controls.Add(this.lblTitulo);
            this.panel1.Location = new System.Drawing.Point(1, -8);
            this.panel1.Name = "panel1";
            this.panel1.Size = new System.Drawing.Size(755, 158);
            this.panel1.TabIndex = 4;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Bauhaus 93", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(518, 120);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(169, 23);
            this.label1.TabIndex = 1;
            this.label1.Text = "MARILUCIA VITOR";
            // 
            // lblTitulo
            // 
            this.lblTitulo.AutoSize = true;
            this.lblTitulo.Font = new System.Drawing.Font("Microsoft Sans Serif", 40.2F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblTitulo.Location = new System.Drawing.Point(2, 33);
            this.lblTitulo.Name = "lblTitulo";
            this.lblTitulo.Size = new System.Drawing.Size(724, 78);
            this.lblTitulo.TabIndex = 0;
            this.lblTitulo.Text = "GESTÃO DE VENDAS";
            // 
            // GestaoVenda
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.SystemColors.ActiveCaption;
            this.ClientSize = new System.Drawing.Size(757, 586);
            this.Controls.Add(tableLayoutPanel1);
            this.Controls.Add(this.panel1);
            this.Icon = ((System.Drawing.Icon)(resources.GetObject("$this.Icon")));
            this.MaximizeBox = false;
            this.MinimizeBox = false;
            this.Name = "GestaoVenda";
            this.Text = "Gestão de Vendas";
            tableLayoutPanel1.ResumeLayout(false);
            this.panel1.ResumeLayout(false);
            this.panel1.PerformLayout();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Button btnCadCliente;
        private System.Windows.Forms.Button btnCadVenda;
        private System.Windows.Forms.Button btnReceber;
        private System.Windows.Forms.Button btnRelatorios;
        private System.Windows.Forms.Panel panel1;
        private System.Windows.Forms.Label lblTitulo;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Button btnCadCampanha;
        private System.Windows.Forms.Panel pFoto;
    }
}

