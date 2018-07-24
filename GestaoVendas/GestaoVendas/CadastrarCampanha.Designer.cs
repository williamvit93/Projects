namespace GestaoVendas
{
    partial class CadastrarCampanha
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
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(CadastrarCampanha));
            this.txtTitulo = new System.Windows.Forms.TextBox();
            this.lblTitulo = new System.Windows.Forms.Label();
            this.lblInicio = new System.Windows.Forms.Label();
            this.dateInicio = new System.Windows.Forms.DateTimePicker();
            this.dateTermino = new System.Windows.Forms.DateTimePicker();
            this.lblTermino = new System.Windows.Forms.Label();
            this.btnCadCampanha = new System.Windows.Forms.Button();
            this.comboRevista = new System.Windows.Forms.ComboBox();
            this.lblRevista = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // txtTitulo
            // 
            this.txtTitulo.CharacterCasing = System.Windows.Forms.CharacterCasing.Upper;
            this.txtTitulo.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtTitulo.Location = new System.Drawing.Point(168, 51);
            this.txtTitulo.Name = "txtTitulo";
            this.txtTitulo.Size = new System.Drawing.Size(323, 30);
            this.txtTitulo.TabIndex = 1;
            // 
            // lblTitulo
            // 
            this.lblTitulo.AutoSize = true;
            this.lblTitulo.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblTitulo.ForeColor = System.Drawing.SystemColors.ControlLightLight;
            this.lblTitulo.Location = new System.Drawing.Point(86, 56);
            this.lblTitulo.Name = "lblTitulo";
            this.lblTitulo.Size = new System.Drawing.Size(60, 25);
            this.lblTitulo.TabIndex = 1;
            this.lblTitulo.Text = "Titulo";
            // 
            // lblInicio
            // 
            this.lblInicio.AutoSize = true;
            this.lblInicio.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblInicio.ForeColor = System.Drawing.SystemColors.ControlLightLight;
            this.lblInicio.Location = new System.Drawing.Point(89, 121);
            this.lblInicio.Name = "lblInicio";
            this.lblInicio.Size = new System.Drawing.Size(57, 25);
            this.lblInicio.TabIndex = 2;
            this.lblInicio.Text = "Inicio";
            // 
            // dateInicio
            // 
            this.dateInicio.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.dateInicio.Format = System.Windows.Forms.DateTimePickerFormat.Short;
            this.dateInicio.Location = new System.Drawing.Point(168, 116);
            this.dateInicio.Name = "dateInicio";
            this.dateInicio.Size = new System.Drawing.Size(149, 30);
            this.dateInicio.TabIndex = 2;
            this.dateInicio.Value = new System.DateTime(2018, 3, 31, 0, 0, 0, 0);
            // 
            // dateTermino
            // 
            this.dateTermino.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.dateTermino.Format = System.Windows.Forms.DateTimePickerFormat.Short;
            this.dateTermino.Location = new System.Drawing.Point(168, 176);
            this.dateTermino.Name = "dateTermino";
            this.dateTermino.Size = new System.Drawing.Size(149, 30);
            this.dateTermino.TabIndex = 3;
            // 
            // lblTermino
            // 
            this.lblTermino.AutoSize = true;
            this.lblTermino.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblTermino.ForeColor = System.Drawing.SystemColors.ControlLightLight;
            this.lblTermino.Location = new System.Drawing.Point(62, 181);
            this.lblTermino.Name = "lblTermino";
            this.lblTermino.Size = new System.Drawing.Size(84, 25);
            this.lblTermino.TabIndex = 5;
            this.lblTermino.Text = "Término";
            // 
            // btnCadCampanha
            // 
            this.btnCadCampanha.BackColor = System.Drawing.SystemColors.HotTrack;
            this.btnCadCampanha.Font = new System.Drawing.Font("Calibri", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnCadCampanha.ForeColor = System.Drawing.SystemColors.ControlLightLight;
            this.btnCadCampanha.Location = new System.Drawing.Point(192, 356);
            this.btnCadCampanha.Name = "btnCadCampanha";
            this.btnCadCampanha.Size = new System.Drawing.Size(189, 101);
            this.btnCadCampanha.TabIndex = 5;
            this.btnCadCampanha.Text = "SALVAR";
            this.btnCadCampanha.UseVisualStyleBackColor = false;
            this.btnCadCampanha.Click += new System.EventHandler(this.btnCadCampanha_Click);
            // 
            // comboRevista
            // 
            this.comboRevista.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.comboRevista.FormattingEnabled = true;
            this.comboRevista.Location = new System.Drawing.Point(168, 247);
            this.comboRevista.Name = "comboRevista";
            this.comboRevista.Size = new System.Drawing.Size(149, 33);
            this.comboRevista.TabIndex = 4;
            this.comboRevista.KeyPress += new System.Windows.Forms.KeyPressEventHandler(this.comboRevista_KeyPress);
            // 
            // lblRevista
            // 
            this.lblRevista.AutoSize = true;
            this.lblRevista.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblRevista.ForeColor = System.Drawing.SystemColors.ControlLightLight;
            this.lblRevista.Location = new System.Drawing.Point(70, 255);
            this.lblRevista.Name = "lblRevista";
            this.lblRevista.Size = new System.Drawing.Size(76, 25);
            this.lblRevista.TabIndex = 8;
            this.lblRevista.Text = "Revista";
            // 
            // CadastrarCampanha
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.SystemColors.ActiveCaption;
            this.ClientSize = new System.Drawing.Size(610, 504);
            this.Controls.Add(this.lblRevista);
            this.Controls.Add(this.comboRevista);
            this.Controls.Add(this.btnCadCampanha);
            this.Controls.Add(this.lblTermino);
            this.Controls.Add(this.dateTermino);
            this.Controls.Add(this.dateInicio);
            this.Controls.Add(this.lblInicio);
            this.Controls.Add(this.lblTitulo);
            this.Controls.Add(this.txtTitulo);
            this.Icon = ((System.Drawing.Icon)(resources.GetObject("$this.Icon")));
            this.MaximizeBox = false;
            this.Name = "CadastrarCampanha";
            this.Text = "Cadastrar Campanha";
            this.Load += new System.EventHandler(this.CadastrarCampanha_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.TextBox txtTitulo;
        private System.Windows.Forms.Label lblTitulo;
        private System.Windows.Forms.Label lblInicio;
        private System.Windows.Forms.DateTimePicker dateInicio;
        private System.Windows.Forms.DateTimePicker dateTermino;
        private System.Windows.Forms.Label lblTermino;
        private System.Windows.Forms.Button btnCadCampanha;
        private System.Windows.Forms.ComboBox comboRevista;
        private System.Windows.Forms.Label lblRevista;
    }
}