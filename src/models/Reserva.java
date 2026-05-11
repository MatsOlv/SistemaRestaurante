package models;

import java.time.LocalDate;
import java.time.LocalTime;

public class Reserva  {
    private LocalDate Data;
    private LocalTime hora;
    private int pessoas;
    private String Ocasiao;
    private boolean ativa;

    public Reserva(LocalDate data, LocalTime hora, int pessoas, String ocasiao, boolean ativa) {
        Data = data;
        this.hora = hora;
        this.pessoas = pessoas;
        Ocasiao = ocasiao;
        this.ativa = ativa;
    }
}