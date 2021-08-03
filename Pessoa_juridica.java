package Exercicio11;

public class Pessoa_juridica extends Pessoa {
    private Integer n_funcionarios;

    public Pessoa_juridica(String name, Double renda_anual, Integer n_funcionarios) {
        super(name, renda_anual);
        this.n_funcionarios = n_funcionarios;
    }

    public Integer getN_funcionarios() {
        return n_funcionarios;
    }

    public void setN_funcionarios(Integer n_funcionarios) {
        this.n_funcionarios = n_funcionarios;
    }

    @Override
    public Double tax() {
        double imposto = 0;
        if(this.n_funcionarios > 10){
            imposto = getRenda_anual() * 0.14;
        } else {
            imposto = getRenda_anual() * 0.16;
        }
        return imposto;
    }

}
