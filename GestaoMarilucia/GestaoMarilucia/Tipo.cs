namespace GestaoMarilucia
{
    public class Tipo
    {
        public int id { get; set; }
        public string descricao { get; set; }


        public override string ToString()
        {
            return descricao;
        }
    }
}