import models.Cliente;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Cliente c1 = null;

        System.out.println(
                "--------------------\n" +
                "0 - Fechar Sistema\n"  +
                "1 - Novo Cadastro\n" +
                "2 - Fazer Login\n" +
                "--------------------\n"
        );
        int escolha = sc.nextInt();
        if (escolha == 1){
           c1 = Cliente.Cadastrar();
        }


        }
    }
