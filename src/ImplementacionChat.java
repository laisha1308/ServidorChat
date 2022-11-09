import Interfaces.ChatCliente;
import Interfaces.ChatServidor;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class ImplementacionChat extends UnicastRemoteObject implements ChatServidor {
    public ArrayList<ChatCliente> clientes;

    public ImplementacionChat () throws RemoteException {
        clientes = new ArrayList<ChatCliente>();
    }

    public void mensaje(String mensaje) throws RemoteException {
        int a = 0;
        while (a < clientes.size()) {
            clientes.get(a++).mensajeCliente(mensaje);
        }
    }

    public void registro(ChatCliente cliente) throws RemoteException {
        this.clientes.add(cliente);
    }
}
