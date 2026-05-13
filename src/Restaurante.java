import erro.ClienteNotFoundException;
import erro.MesaNotFoundException;
import models.Cliente;
import models.Funcionario;
import models.Mesa;
import models.Reserva;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Restaurante {
    private ArrayList <Cliente> clientes;
    private ArrayList <Mesa> mesas;
    private ArrayList <Reserva> reserva;
    private ArrayList <Funcionario> funcionario;

    public Restaurante(ArrayList<Cliente> clientes, ArrayList<Mesa> mesas, ArrayList<Reserva> reserva, ArrayList<Funcionario> funcionario)  {
        this.clientes = clientes;
        this.mesas = mesas;
        this.reserva = reserva;
        this.funcionario = funcionario;
    }
    public void criarReserva (String cliente, int mesa, LocalDate data, LocalTime hora)  throws ClienteNotFoundException, MesaNotFoundException {
        Cliente cliente1 = null;
        Mesa mesa1 = null;
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getCpf().equals(cliente)) {
                cliente1 = clientes.get(i);
                break;
            }
        }
// terminando ainda:
//        if (Cliente c1 == null) {
//            throw new ClienteNotFoundException(String idCliente);
        // }

//        if(mesa1 == null) {
//            throw new MesaNotFoundException(String message);
        //   }


        for (int i = 0; i < mesas.size(); i++) {
            if (mesas.get(i).getNumero() == mesa) {
                mesa1 = mesas.get(i);
                break;
            }
        }



    }
    public void cadastrarCliente(Cliente cliente){
        clientes.add(cliente);

        }

public void CadastrarMesa (){

    mesas.add(new Mesa(1, 2, true));
    mesas.add(new Mesa(2, 2, true));
    mesas.add(new Mesa(3, 4, true));
    mesas.add(new Mesa(4, 4, true));
    mesas.add(new Mesa(5, 6, true));
    mesas.add(new Mesa(6, 6, true));

}
}
