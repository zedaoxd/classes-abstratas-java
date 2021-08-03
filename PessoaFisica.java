package Exercicio11;

public class PessoaFisica extends Pessoa {
    private Double gastos_saude;

    public PessoaFisica(String name, Double renda_anual, Double gastos_saude) {
        super(name, renda_anual);
        this.gastos_saude = gastos_saude;
    }

    public Double getGastos_saude() {
        return gastos_saude;
    }

    public void setGastos_saude(Double gastos_saude) {
        this.gastos_saude = gastos_saude;
    }

    @Override
    public Double tax(){
        double imposto = 0;
        if (getRenda_anual() > 20000.00){
            imposto = getRenda_anual() * 0.25;
            if (this.gastos_saude > 0.0){
                imposto -= this.gastos_saude/2;
            }
        } else {
            imposto = getRenda_anual() * 0.15;
            if (this.gastos_saude > 0.0){
                imposto -= this.gastos_saude/2;
            }
        }

        return imposto;
    }
    

}
