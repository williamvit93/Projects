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
    public class ProdutoController : Controller
    {
        // GET: Produto
        [Route("produtos", Name = "ListaProdutos")]
        public ActionResult ListarProdutos()
        {
            ProdutosDAO dao = new ProdutosDAO();
            IList<Produto> produtos = dao.Lista();
            return View(produtos);
        }
        [Route("cadastrarProduto", Name = "CadastraProduto")]
        
        public ActionResult FormCadastroProduto()
        {
            Produto produto = new Produto();
            CategoriasDAO dao = new CategoriasDAO();
            IList<CategoriaDoProduto> categorias = dao.Lista();
            ViewBag.Categorias = categorias;

            ViewBag.Produto = produto;
            return View();
        }

        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult CadastrarProduto(Produto produto)
        {

            if (ModelState.IsValid)
            {
                ProdutosDAO dao = new ProdutosDAO();
                dao.Adiciona(produto);
                return RedirectToAction("ListarProdutos", "Produto");
            }
            else
            {
                CategoriasDAO dao = new CategoriasDAO();
                IList<CategoriaDoProduto> categorias = dao.Lista();
                ViewBag.Categorias = categorias;


                ViewBag.Produto = produto;
                return View("FormCadastroProduto");
            }
        }
        [Route("produtos/{id}", Name = "VisualizarProduto")]
        public ActionResult VisualizaProduto(int id)
        {
            ProdutosDAO dao = new ProdutosDAO();
            Produto produto = dao.BuscaPorId(id);
            ViewBag.Produto = produto;

            return View(produto);
        }
        public ActionResult DecrementaQtd(int id)
        {
            ProdutosDAO dao = new ProdutosDAO();
            var produto = dao.BuscaPorId(id);
            produto.Quantidade--;
            dao.Atualiza(produto);

            return Json(produto);

        }
    }
}