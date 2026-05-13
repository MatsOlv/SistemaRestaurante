package models;

public class Mesa implements Exibivel {

    private int numero;
    private int capacidade;
    private boolean disponivel;

    public Mesa(int numero, int capacidade, boolean disponivel) {
        this.numero = numero;
        this.capacidade = capacidade;
        this.disponivel = true;
    }

    public int getNumero() {
        return numero;
    }

    public int getCapacidade() {
        return capacidade;
    }


    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public void exibirDados() {
        String status = disponivel? "Disponivel" : "Ocupada";
        System.out.println("Exib.Mesa{" +
                "Nº=" + numero +
                ", capacidade=" + capacidade +
                ", status=" + status +
                '}');



    }
}
