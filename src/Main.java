public class Main {
    public static void main(String[] args) {
        Class<Produto> classeProduto = Produto.class;
        Tabela tabela = classeProduto.getAnnotation(Tabela.class);
        if (tabela != null) {
            System.out.println("A classe Produto representa a tabela: " + tabela.value());
        } else {
            System.out.println("A classe Produto não está marcada com a annotation Tabela");
        }
    }
}
