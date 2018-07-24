﻿using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace WA.CursoMvc.Application.ViewModels
{
    public class EnderecoViewModel
    {
        public EnderecoViewModel()
        {
            Id = Guid.NewGuid();
        }
        [Key]
        public Guid Id { get; set; }

        [Required(ErrorMessage ="Preencha o campo Logradouro")]
        [MaxLength(100, ErrorMessage ="Máximo {0} caracteres")]
        [MinLength(2, ErrorMessage ="Minimo {0} caracteres")]

        public string Logradouro { get; set; }

        [Required(ErrorMessage = "Preencha o campo Numero")]
        [MaxLength(20, ErrorMessage = "Máximo {0} caracteres")]
        [MinLength(2, ErrorMessage = "Minimo {0} caracteres")]
        public string Numero { get; set; }

        [MaxLength(150, ErrorMessage = "Preencha o campo Complemento")]
        [MinLength(2, ErrorMessage = "Minimo {0} caracteres")]
        public string Complemento { get; set; }

        [Required(ErrorMessage ="Preencha o campo Bairro")]
        [MaxLength(100, ErrorMessage = "Máximo {0} caracteres")]
        [MinLength(2, ErrorMessage ="Minimo {0} caracteres")]

        public string Bairro { get; set; }

        [Required(ErrorMessage ="Preencha o campo CEP")]
        [MaxLength(8, ErrorMessage ="Máximo {0} caracteres")]
        [MinLength(8, ErrorMessage = "Minimo {0} caracteres")]

        public string Cep { get; set; }

        [Required(ErrorMessage = "Preencha o campo Cidade")]
        [MaxLength(100, ErrorMessage = "Maximo {0} caracteres")]
        [MinLength(2, ErrorMessage = "Minimo {0} caracteres")]

        public string Cidade { get; set; }

        [Required(ErrorMessage ="Preencha o campo Estado")]
        [MaxLength(100, ErrorMessage = "Máximo {0} caracteres")]
        [MinLength(2, ErrorMessage = "Minimo {0} caracteres")]

        public string Estado { get; set; }

        [ScaffoldColumn(false)]
        public Guid ClienteId { get; set; }

    }
}
