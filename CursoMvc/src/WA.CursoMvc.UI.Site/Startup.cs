using Microsoft.Owin;
using Owin;

[assembly: OwinStartupAttribute(typeof(WA.CursoMvc.UI.Site.Startup))]
namespace WA.CursoMvc.UI.Site
{
    public partial class Startup
    {
        public void Configuration(IAppBuilder app)
        {
            ConfigureAuth(app);
        }
    }
}
