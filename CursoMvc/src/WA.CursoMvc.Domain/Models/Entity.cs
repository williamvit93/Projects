using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace WA.CursoMvc.Domain.Models
{
    public abstract class Entity
    {
        //Verificar pq gera um novo Id
        //public Entity()
        //{
        //    Id = Guid.NewGuid();
        //}
        public Guid Id { get; set; }
    }
}
