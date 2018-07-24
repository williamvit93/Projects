using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.ServiceModel.Web;
using System.Text;

namespace WcfCEP
{
    // NOTE: You can use the "Rename" command on the "Refactor" menu to change the class name "Service1" in code, svc and config file together.
    public class Service1 : IService1
    {

        public List<WcfDto.ClienteDto> ListarCliente(string nome)
        {
            List<WcfDto.ClienteDto> clientes = new List<WcfDto.ClienteDto>();

            clientes.Add(new WcfDto.ClienteDto() { idade = 31, nome = "Fabio" });
            clientes.Add(new WcfDto.ClienteDto() { idade=25, nome = "William" });
            
            return clientes.Where(x => x.nome.Contains(nome)).ToList();
        }
    }
}
