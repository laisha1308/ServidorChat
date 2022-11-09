import Interfaces.InterfaceRMI;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ImplementacionInterface extends UnicastRemoteObject implements InterfaceRMI {
    public ImplementacionInterface() throws RemoteException {
        super();
    }

    public String nombre(String nombre) throws RemoteException {
        return nombre;
    }
}
