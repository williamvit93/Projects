using AutoMapper;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using WA.CursoMvc.Application.Interfaces;
using WA.CursoMvc.Application.ViewModels;
using WA.CursoMvc.Data.Repository;
using WA.CursoMvc.Domain.Interfaces.Repository;
using WA.CursoMvc.Domain.Models;

namespace WA.CursoMvc.Application.Services
{
    public class ClienteAppService : IClienteAppService
    {
        private readonly IClienteRepository _clienteRepository;
        public ClienteAppService()
        {
            _clienteRepository = new ClienteRepository();
        }
        public ClienteEnderecoViewModel Adicionar(ClienteEnderecoViewModel clienteEnderecoViewmodel)
        {
            var cliente = Mapper.Map<Cliente>(clienteEnderecoViewmodel.ClienteViewModel);
            var endereco = Mapper.Map<Endereco>(clienteEnderecoViewmodel.EnderecoViewModel);
            cliente.Enderecos.Add(endereco);
            cliente.Ativo = true;

            _clienteRepository.Adicionar(cliente);

            return clienteEnderecoViewmodel;
        }

        public virtual ClienteViewModel Atualizar(ClienteViewModel clienteViewModel)
        {
            var cliente = Mapper.Map<Cliente>(clienteViewModel);
            _clienteRepository.Atualizar(cliente);
            return clienteViewModel;

        }

        public void Dispose()
        {
            _clienteRepository.Dispose();
        }

        public IEnumerable<ClienteViewModel> ObterAtivos()
        {
            return Mapper.Map<IEnumerable<ClienteViewModel>>(_clienteRepository.ObterAtivos());
        }

        public ClienteViewModel ObterPorCpf(string cpf)
        {
            return Mapper.Map<ClienteViewModel>(_clienteRepository.ObterPorCpf(cpf));
        }

        public ClienteViewModel ObterPorEmail(string email)
        {
            return Mapper.Map<ClienteViewModel>(_clienteRepository.ObterPorEmail(email));
        }

        public ClienteViewModel ObterPorId(Guid id)
        {
            return Mapper.Map<ClienteViewModel>(_clienteRepository.ObterPorId(id));
        }

        public IEnumerable<ClienteViewModel> ObterTodos()
        {
            return Mapper.Map<IEnumerable<ClienteViewModel>>(_clienteRepository.ObterTodos());
        }

        public void Remover(Guid id)
        {
            _clienteRepository.Remover(id);
        }
    }
}
