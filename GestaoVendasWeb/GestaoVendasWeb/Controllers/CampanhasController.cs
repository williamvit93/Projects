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
    public class CampanhasController : Controller
    {
        private GestaoMariluciaEntities db = new GestaoMariluciaEntities();

        // GET: Campanhas
        public ActionResult Index()
        {
            var campanhas = db.Campanhas.Include(c => c.Tipos);
            return View(campanhas.ToList());
        }

        // GET: Campanhas/Details/5
        public ActionResult Details(int? id)
        {
            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            Campanhas campanhas = db.Campanhas.Find(id);
            if (campanhas == null)
            {
                return HttpNotFound();
            }
            return View(campanhas);
        }

        // GET: Campanhas/Create
        public ActionResult Create()
        {
            ViewBag.Tiposid = new SelectList(db.Tipos, "id", "descricao");
            return View();
        }

        // POST: Campanhas/Create
        // To protect from overposting attacks, please enable the specific properties you want to bind to, for 
        // more details see https://go.microsoft.com/fwlink/?LinkId=317598.
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Create([Bind(Include = "Id,Titulo,Inicio,Termino,Tiposid")] Campanhas campanhas)
        {
            if (ModelState.IsValid)
            {
                db.Campanhas.Add(campanhas);
                db.SaveChanges();
                return RedirectToAction("Index");
            }

            ViewBag.Tiposid = new SelectList(db.Tipos, "id", "descricao", campanhas.Tiposid);
            return View(campanhas);
        }

        // GET: Campanhas/Edit/5
        public ActionResult Edit(int? id)
        {
            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            Campanhas campanhas = db.Campanhas.Find(id);
            if (campanhas == null)
            {
                return HttpNotFound();
            }
            ViewBag.Tiposid = new SelectList(db.Tipos, "id", "descricao", campanhas.Tiposid);
            return View(campanhas);
        }

        // POST: Campanhas/Edit/5
        // To protect from overposting attacks, please enable the specific properties you want to bind to, for 
        // more details see https://go.microsoft.com/fwlink/?LinkId=317598.
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Edit([Bind(Include = "Id,Titulo,Inicio,Termino,Tiposid")] Campanhas campanhas)
        {
            if (ModelState.IsValid)
            {
                db.Entry(campanhas).State = EntityState.Modified;
                db.SaveChanges();
                return RedirectToAction("Index");
            }
            ViewBag.Tiposid = new SelectList(db.Tipos, "id", "descricao", campanhas.Tiposid);
            return View(campanhas);
        }

        // GET: Campanhas/Delete/5
        public ActionResult Delete(int? id)
        {
            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            Campanhas campanhas = db.Campanhas.Find(id);
            if (campanhas == null)
            {
                return HttpNotFound();
            }
            return View(campanhas);
        }

        // POST: Campanhas/Delete/5
        [HttpPost, ActionName("Delete")]
        [ValidateAntiForgeryToken]
        public ActionResult DeleteConfirmed(int id)
        {
            Campanhas campanhas = db.Campanhas.Find(id);
            db.Campanhas.Remove(campanhas);
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
