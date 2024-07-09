/**
 * @author jose.facusse
 */

public class PrimeiraClasse {
    public static void main(String[] args) {
        System.out.println("Trabalho EBAC");
        Produto produto = new Produto();
        produto.setDescricao("Dragao de brinquedo");
        System.out.println(produto.getDescricao());
        produto.setNome("Dragaozinho");
        System.out.println(produto.getNome());
        produto.setCodigo(Integer.parseInt("777"));
        System.out.println(produto.getCodigo());

    }

}

