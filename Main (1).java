public class Main {
  static public void main(String[] parametros)
	{
    Produto prod = new Produto();
    prod.setCodigo(1);
    prod.setNome("Shampoo");
    prod.setPreco(25.0);
    System.out.println("Código: " + prod.getCodigo() + "\t" + "Produto: " + prod.getNome() + "\t" + "Preço: " + prod.getPreco());
  }
}