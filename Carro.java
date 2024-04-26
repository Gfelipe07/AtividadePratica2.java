public class Carro {
    private String modelo;
    private String placa;
    private int ano;
    private double kilometragem;

    public Carro(String modelo, String placa, int ano, double kilometragem) {
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
        this.kilometragem = kilometragem;
    }

    // Getters e Setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getKilometragem() {
        return kilometragem;
    }

    public void setKilometragem(float kilometragem) {
        this.kilometragem = kilometragem;
    }

    @Override
    public String toString() {
        return "Carro: " +
                "modelo = " + modelo +
                ", placa = " + placa +
                ", ano = " + ano +
                ", kilometragem = " + kilometragem;
    }
}
