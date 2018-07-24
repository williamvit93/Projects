using System;
using System.Collections.Generic;
using System.Data;
using System.Data.Entity;
using System.Linq;
using System.Net;
using System.Web;
using System.Web.Mvc;
using GestaoVendasWeb.Models;

namespace GestaoVendasWeb.Controllers
{
    public class VendaProdutosController : Controller
    {
        private GestaoMariluciaEntities db = new GestaoMariluciaEntities();

        // GET: VendaProdutos
        public ActionResult Index()
        {
            var vendaProdutos = db.VendaProdutos.Include(v => v.Campanhas).Include(v => v.Clientes).Include(v => v.Tipos).Include(v => v.Unidades);
            return View(vendaProdutos.ToList());
        }

        // GET: VendaProdutos/Details/5
        public ActionResult Details(int? id)
        {
            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            VendaProdutos vendaProdutos = db.VendaProdutos.Find(id);
            if (vendaProdutos == null)
            {
                return HttpNotFound();
            }
            return View(vendaProdutos);
        }

        // GET: VendaProdutos/Create
        public ActionResult Create()
        {
            ViewBag.Campanhaid = new SelectList(db.Campanhas, "Id", "Titulo");
            ViewBag.Clienteid = new SelectList(db.Clientes, "id", "nome");
            ViewBag.Tipoid = new SelectList(db.Tipos, "id", "descricao");
            ViewBag.Unidadeid = new SelectList(db.Unidades, "id", "descricao");
            return View();
        }

        // POST: VendaProdutos/Create
        // To protect from overposting attacks, please enable the specific properties you want to bind to, for 
        // more details see https://go.microsoft.com/fwlink/?LinkId=317598.
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Create([Bind(Include = "Id,Produto,PrecoUnitario,Codigo,Observacao,Quantidade,DataVenda,Clienteid,Tipoid,Unidadeid,Campanhaid")] VendaProdutos vendaProdutos)
        {
            if (ModelState.IsValid)
            {
                db.VendaProdutos.Add(vendaProdutos);
                db.SaveChanges();
                return RedirectToAction("Index");
            }

            ViewBag.Campanhaid = new SelectList(db.Campanhas, "Id", "Titulo", vendaProdutos.Campanhaid);
            ViewBag.Clienteid = new SelectList(db.Clientes, "id", "nome", vendaProdutos.Clienteid);
            ViewBag.Tipoid = new SelectList(db.Tipos, "id", "descricao", vendaProdutos.Tipoid);
            ViewBag.Unidadeid = new SelectList(db.Unidades, "id", "descricao", vendaProdutos.Unidadeid);
            return View(vendaProdutos);
        }

        // GET: VendaProdutos/Edit/5
        public ActionResult Edit(int? id)
        {
            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            VendaProdutos vendaProdutos = db.VendaProdutos.Find(id);
            if (vendaProdutos == null)
            {
                return HttpNotFound();
            }
            ViewBag.Campanhaid = new SelectList(db.Campanhas, "Id", "Titulo", vendaProdutos.Campanhaid);
            ViewBag.Clienteid = new SelectList(db.Clientes, "id", "nome", vendaProdutos.Clienteid);
            ViewBag.Tipoid = new SelectList(db.Tipos, "id", "descricao", vendaProdutos.Tipoid);
            ViewBag.Unidadeid = new SelectList(db.Unidades, "id", "descricao", vendaProdutos.Unidadeid);
            return View(vendaProdutos);
        }

        // POST: VendaProdutos/Edit/5
        // To protect from overposting attacks, please enable the specific properties you want to bind to, for 
        // more details see https://go.microsoft.com/fwlink/?LinkId=317598.
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Edit([Bind(Include = "Id,Produto,PrecoUnitario,Codigo,Observacao,Quantidade,DataVenda,Clienteid,Tipoid,Unidadeid,Campanhaid")] VendaProdutos vendaProdutos)
        {
            if (ModelState.IsValid)
            {
                db.Entry(vendaProdutos).State = EntityState.Modified;
                db.SaveChanges();
                return RedirectToAction("Index");
            }
            ViewBag.Campanhaid = new SelectList(db.Campanhas, "Id", "Titulo", vendaProdutos.Campanhaid);
            ViewBag.Clienteid = new SelectList(db.Clientes, "id", "nome", vendaProdutos.Clienteid);
            ViewBag.Tipoid = new SelectList(db.Tipos, "id", "descricao", vendaProdutos.Tipoid);
            ViewBag.Unidadeid = new SelectList(db.Unidades, "id", "descricao", vendaProdutos.Unidadeid);
            return View(vendaProdutos);
        }

        // GET: VendaProdutos/Delete/5
        public ActionResult Delete(int? id)
        {
            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            VendaProdutos vendaProdutos = db.VendaProdutos.Find(id);
            if (vendaProdutos == null)
            {
                return HttpNotFound();
            }
            return View(vendaProdutos);
        }

        // POST: VendaProdutos/Delete/5
        [HttpPost, ActionName("Delete")]
        [ValidateAntiForgeryToken]
        public ActionResult DeleteConfirmed(int id)
        {
            VendaProdutos vendaProdutos = db.VendaProdutos.Find(id);
            db.VendaProdutos.Remove(vendaProdutos);
            db.SaveChanges();
            return RedirectToAction("Index");
        }

        protected override void Dispose(bool disposing)
        {
            if (disposing)
            {
                db.Dispose();
            }
            base.Dispose(disposing);
        }
    }
}
