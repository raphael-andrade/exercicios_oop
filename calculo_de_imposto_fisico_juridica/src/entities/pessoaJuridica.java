package entities;

public class pessoaJuridica extends Contribuinte {

    private Integer funcionarios;

    public pessoaJuridica() {
        super();
    }

    public pessoaJuridica(String name, Double anualIncome, Integer funcionarios) {
        super(name, anualIncome);
        this.funcionarios = funcionarios;
    }

    public Integer getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Integer funcionarios) {
        this.funcionarios = funcionarios;
    }

    @Override
    public Double totalTax() {
        double tax;
        if(funcionarios < 10){
            tax = (super.getAnualIncome() * 0.16);
        }
        else {
            tax = (super.getAnualIncome() * 0.14);

        }
        return tax;
    }
}
