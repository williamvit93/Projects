using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;
using CaelumEstoque.Filtros;

namespace CaelumEstoque.Controllers
{
    [AutorizacaoFilter]
    public class HomeController : Controller
    {
        //
        // GET: /Home/
        [Route("", Name = "Home")]
        

        public ActionResult Index()
        {
            return View();
        }
	}
}