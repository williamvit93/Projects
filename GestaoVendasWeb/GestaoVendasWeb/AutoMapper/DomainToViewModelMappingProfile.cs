using AutoMapper;
using GestaoVendasWeb.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;


namespace GestaoVendasWeb.AutoMapper
{
    public class DomainToViewModelMappingProfile : Profile
    {
        
        protected override void Configure()
        {
            CreateMap<Clientes, ClienteEnderecoViewModel>().ReverseMap();

            CreateMap<Enderecos, ClienteEnderecoViewModel>().ReverseMap();
        }


        
    }
}
