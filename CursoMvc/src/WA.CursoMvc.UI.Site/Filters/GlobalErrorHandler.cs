using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace WA.CursoMvc.UI.Site.Filters
{
    public class GlobalErrorHandler : ActionFilterAttribute
    {
        public override void OnActionExecuted(ActionExecutedContext filterContext)
        {
            if (filterContext.Exception !=null)
            {

                filterContext.ExceptionHandled = true;
            }
            base.OnActionExecuted(filterContext);
        }
    }
}