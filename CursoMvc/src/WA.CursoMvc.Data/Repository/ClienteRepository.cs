using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using WA.CursoMvc.Domain.Interfaces.Repository;
using WA.CursoMvc.Domain.Models;

namespace WA.CursoMvc.Data.Repository
{
    public class ClienteRepository : Repository<Cliente>, IClienteRepository
    {
        public IEnumerable<Cliente> ObterAtivos()
        {
            ////usando o DAPPER par buscar todos por conta da velocidade
            //var sql = "SELECT c.clienteId as 'Id' FROM Clientes c where Ativo = 1";

            //return Db.Database.Connection.Query<Cliente>(sql);

            return Buscar(c => c.Ativo);
        }

        public Cliente ObterPorCpf(string cpf)
        {
            return Buscar(c => c.Cpf == cpf).FirstOrDefault();
        }

        public Cliente ObterPorEmail(string email)
        {
            return Buscar(c => c.Email == email).FirstOrDefault();
        }

        public override void Remover (Guid id)
        {
            var cliente = ObterPorId(id);
            cliente.Excluido = true;
            cliente.Ativo = false;
            Atualizar(cliente);
        }
    }
}
