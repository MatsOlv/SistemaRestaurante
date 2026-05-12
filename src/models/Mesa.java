package models;

public class Mesa implements Exibivel {

    private int numero;
    private int capacidade;
    private boolean disponivel;

    public Mesa(boolean disponivel, int capacidade, int numero) {
        this.disponivel = true;
        this.capacidade = capacidade;
        this.numero = numero;
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
