package exercicioii;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author tainara
 */
public class Servidor implements Interface {

  public Servidor(){
      LoginUsuario l = new LoginUsuario();//instancia objeto da classe LoginUsuario
  }

    public static void main(String[] args) throws RemoteException {
        try {
            //criação do objeto remoto
            Servidor s = new Servidor();

            //exportação do objeto remoto
            Interface stub = (Interface) UnicastRemoteObject.exportObject(s, 0);

            //registro do objeto remoto com RMI Registry
            Registry registry = LocateRegistry.getRegistry();
            registry.bind("Interface", stub);
            System.err.println("Servidor está pronto...");

        } catch (RemoteException | AlreadyBoundException e) {
            System.err.println("Exceção no Servidor:" + e.toString());
        }
    }

  
    @Override
    public void enviar(String mensagem) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }

    @Override
    public void desconectar(LoginUsuario l) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void conectar(LoginUsuario l) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
    }
    
    
}
