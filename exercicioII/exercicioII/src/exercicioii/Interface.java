package exercicioii;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author tainara
 */
public interface Interface extends Remote {

    public void enviar(String mensagem) throws RemoteException;

    public void desconectar(LoginUsuario l) throws RemoteException;

    public void conectar(LoginUsuario l) throws RemoteException;

}
