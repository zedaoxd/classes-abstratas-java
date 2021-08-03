package Exercicio11;

public abstract class Pessoa {
    private String name;
    private Double renda_anual;

    
    public Pessoa(String name, Double renda_anual) {
        this.name = name;
        this.renda_anual = renda_anual;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getRenda_anual() {
        return renda_anual;
    }

    public void setRenda_anual(Double renda_anual) {
        this.renda_anual = renda_anual;
    }

    public abstract Double tax();

    public String ToString(){
        return this.name + " $ " + String.format("%.2f", tax());
    }
}
