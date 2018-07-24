using System;
using System.Collections.Generic;
using System.Data.Entity;
using System.Linq;
using System.Linq.Expressions;
using WA.CursoMvc.Data.Context;
using WA.CursoMvc.Domain.Interfaces.Repository;
using WA.CursoMvc.Domain.Models;

namespace WA.CursoMvc.Data.Repository
{
    //Criada como abstract para não ser possivel instanciar a classe, somente herdar
    public abstract class Repository<TEntity> : IRepository<TEntity> where TEntity : Entity, new()
    {
        //Criado como protected para que qualquer classe que herde de repository tenha acesso à esses recursos
        protected CursoMvcContext Db;
        protected DbSet<TEntity> DbSet;
        protected Repository()
        {
            Db = new CursoMvcContext();
            DbSet = Db.Set<TEntity>();
        }
        public virtual TEntity Adicionar(TEntity obj)
        {
            var objAdd = DbSet.Add(obj);
            SaveChanges();
            return objAdd;
        }

        public virtual TEntity Atualizar(TEntity obj)
        {
            var entry = Db.Entry(obj);
            DbSet.Attach(obj);
            entry.State = EntityState.Modified;
            SaveChanges();

            return obj;
        }

        public virtual IEnumerable<TEntity> Buscar(Expression<Func<TEntity, bool>> predicate)
        {
            return DbSet.Where(predicate);
        }

        public void Dispose()
        {
            Db.Dispose();
            GC.SuppressFinalize(this);
        }

        public TEntity ObterPorId(Guid id)
        {
            return DbSet.Find(id);
        }

        public IEnumerable<TEntity> ObterTodos()
        {
            return DbSet.ToList();
        }

        //Obtem todos os itens da base com paginação
        // variavel t seria a qtd mostrada na tela, e a variavel s a qtd a pular, em caso de uma segunda página
        //public IEnumerable<TEntity> ObterTodos(int t, int s )
        //{
        //    return DbSet.Take(t).Skip(s).ToList();
        //}

        public virtual void Remover(Guid id)
        {
            var obj = new TEntity() { Id = id };
            DbSet.Remove(obj);
            SaveChanges();
        }

        public virtual int SaveChanges()
        {
            return Db.SaveChanges();
        }
    }
}
