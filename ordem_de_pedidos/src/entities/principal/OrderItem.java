package entities.principal;

public class OrderItem {
    private Integer quantity;
    private product produto;
    private Double price;

    public OrderItem(Integer quantity, Double price, product produto) {
        this.quantity = quantity;
        this.produto = produto;
        this.price = price;
    }

    public Integer getQuantity() {

        return quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setQuantity(Integer quantity) {

        this.quantity = quantity;
    }

    public product getProduto() {

        return produto;
    }

    public Double subTotal() {

        return quantity * price;
    }

    public String toString() {
        return produto.getName()
                + ", $"
                + String.format("%.2f", price)
                + ", Quantity: "
                + quantity +
                ", Subtotal: $"
                + String.format("%.2f", subTotal());
    }
}
