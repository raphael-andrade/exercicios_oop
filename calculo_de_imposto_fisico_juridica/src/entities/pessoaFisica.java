package entities;

public class pessoaFisica extends Contribuinte{

    private Double health;

    public pessoaFisica() {
        super();
    }

    public pessoaFisica(String name, Double anualIncome, Double health) {
        super(name, anualIncome);
        this.health = health;
    }

    public Double getHealth() {
        return health;
    }

    public void setHealth(Double health) {
        this.health = health;
    }

    @Override
    public Double totalTax() {
        double tax;
        if(super.getAnualIncome() < 20000.0){
            tax = (super.getAnualIncome() * 0.15) - (health * 0.5);
        }
        else {
            tax = (super.getAnualIncome() * 0.25) - (health * 0.5);

        }
        return tax;
    }
}
