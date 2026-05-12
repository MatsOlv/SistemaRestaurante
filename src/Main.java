import models.Cliente;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Cliente c1 = null;
    int escolha;

      do {
          System.out.println(
                  "--------------------\n" +
                          "0 - Fechar Sistema\n" +
                          "1 - Novo Cadastro\n" +
                          "2 - Consultar Dados\n" +
                          "--------------------\n"
          );
          escolha = sc.nextInt();

          if (escolha == 0) {
              System.out.println("Encerrando o Sistema.....");
          }else if (escolha == 1) {
              c1 = Cadastro.Cadastrar();
          }else if (escolha == 2) {
              Cadastro.ConsultarCadastro(c1);
          }else {
              System.out.println("Comando Invalido, Digite novamente");
          }

      } while (escolha != 0);


        }
    }
