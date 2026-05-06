package Exib;

import java.time.LocalDateTime;

 public class Reserva  {
    private LocalDateTime Data;
    private int pessoas;
    private String Ocasiao;
    private boolean ativa;

     public Reserva(boolean ativa, String ocasiao, int pessoas, LocalDateTime data) {
         this.ativa = ativa;
         this.Ocasiao = ocasiao;
         this.pessoas = pessoas;
         Data = data;
     }
 }