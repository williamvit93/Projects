using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.ServiceModel;
using System.Runtime.Serialization;


namespace WcfDto
{
    [DataContract]
    public class ClienteDto
    {//crtl k c e crtl k u
        [DataMember]
        public string nome { get; set; }
        [DataMember]
        public int idade { get; set; }
    }
}
