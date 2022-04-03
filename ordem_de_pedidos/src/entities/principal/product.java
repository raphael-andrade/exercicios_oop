package entities.principal;

public class product {
    private String aparelho;
    private Double price;

    public product(String aparelho, Double price) {
        this.aparelho = aparelho;
        this.price = price;
    }

    public String getName() {
        return aparelho;
    }

    public void setName(String aparelho) {

        this.aparelho = aparelho;
    }

    public Double getPrice() {

        return price;
    }

}
