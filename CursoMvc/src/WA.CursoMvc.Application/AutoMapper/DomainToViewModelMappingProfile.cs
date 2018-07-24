using AutoMapper;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using WA.CursoMvc.Application.ViewModels;
using WA.CursoMvc.Domain.Models;

namespace WA.CursoMvc.Application.AutoMapper
{
    public class DomainToViewModelMappingProfile : Profile
    {
        protected override void Configure()
        {
            CreateMap<Cliente, ClienteViewModel>().ReverseMap();
            CreateMap<Cliente, ClienteEnderecoViewModel>().ReverseMap();
            CreateMap<Endereco, EnderecoViewModel>().ReverseMap();
            CreateMap<Endereco, ClienteEnderecoViewModel>().ReverseMap();
        }
    }
}
