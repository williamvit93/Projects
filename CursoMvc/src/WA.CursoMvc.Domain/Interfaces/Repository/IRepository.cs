using System;
using System.Collections.Generic;
using System.Linq;
using System.Linq.Expressions;
using System.Text;
using System.Threading.Tasks;
using WA.CursoMvc.Domain.Models;

namespace WA.CursoMvc.Domain.Interfaces.Repository
{
    public interface IRepository<TEntity> : IDisposable where TEntity : Entity
    {
        TEntity Adicionar(TEntity obj);
        TEntity ObterPorId(Guid id);
        IEnumerable<TEntity> ObterTodos();
        TEntity Atualizar(TEntity obj);
        void Remover(Guid id);
        IEnumerable<TEntity> Buscar(Expression<Func<TEntity, bool>> predicate);
        int SaveChanges();
    }
}
