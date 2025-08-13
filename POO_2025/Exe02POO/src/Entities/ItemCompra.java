package Entities;

public class ItemCompra {
    private Produto produto;
    private double preco;
    private float quantidadeCompra;
    private float quantidadeMes;

    public ItemCompra(Produto produto, double preco, int quantidadeCompra, int quantidadeMes) {
        this.produto = produto;
        this.preco = preco;
        this.quantidadeCompra = quantidadeCompra;
        this.quantidadeMes = quantidadeMes;
    }

    @Override
    public String toString() {
        return "Item Compra " +
                "\nProduto: " + produto +
                "\nPreço: " + preco +
                "\nQuantidade compra:" + quantidadeCompra +
                "\nQuantidade estimada mês: " + quantidadeMes +
                '}';
    }

    public double getTotal() {
        return (this.quantidadeCompra * this.preco);
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        if (produto == null) {
            System.out.println("Produto não pode ser nullo.");
        } else {
            this.produto = produto;
        }
    }

    public float getQntCompra() {
        return quantidadeCompra;
    }

    public void setQntCompra(int qntCompra) {
        if (qntCompra == 0) {
            System.out.println("Quantidade de compra não pode ser zero.");
        } else {
            this.quantidadeCompra = qntCompra;
        }
    }

    public float getQuantidadeMes() {
        return quantidadeMes;
    }

    public void setQuantidadeMes(int quantidadeMes) {
        this.quantidadeMes = quantidadeMes;
    }
}
