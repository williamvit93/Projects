using System.Web;
using System.Web.Mvc;
using WA.CursoMvc.UI.Site.Filters;

namespace WA.CursoMvc.UI.Site
{
    public class FilterConfig
    {
        public static void RegisterGlobalFilters(GlobalFilterCollection filters)
        {
            filters.Add(new HandleErrorAttribute());
            filters.Add(new GlobalErrorHandler());
        }
    }
}
