using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;
using CaelumEstoque.DAO;
using CaelumEstoque.Filtros;
using CaelumEstoque.Models;

namespace CaelumEstoque.Controllers
{
    [AutorizacaoFilter]
    public class CategoriaController : Controller
    {
        // GET: Categoria
        [Route("categorias", Name = "ListaCategorias")]
        

        public ActionResult ListarCategorias()
        {
            CategoriasDAO dao = new CategoriasDAO();
            IList<CategoriaDoProduto> categorias = dao.Lista();
            ViewBag.Categorias = categorias;
            return View();
        }
        [Route("cadastrarCategoria", Name = "CadastraCategorias")]
        
        public ActionResult FormCadastroCategoria()
        {
            return View();
        }

        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult CadastrarCategoria(CategoriaDoProduto categoria)
        {
            CategoriasDAO dao = new CategoriasDAO();
            dao.Adiciona(categoria);
            return RedirectToAction("ListarCategorias", "Categoria");
        }
    }
}