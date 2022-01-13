package exercicioii;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import javax.swing.JOptionPane;

/**
 *
 * @author tainara
 */
public class Cliente {

    LoginUsuario l = new LoginUsuario();//eu não sei se precisa instanciar para os metodos funcionarem

    public static void main(String[] args) {
        
        String host = (args.length < 1) ? null : args[0]; //host para conexão
        
    }

    public void conectar(String host, LoginUsuario l) {
        try {
            //obtém o stub para registro
            Registry registry = LocateRegistry.getRegistry(host);
            //obtém stub para objeto remoto Interface
            Interface stub = (Interface) registry.lookup("Interface");
            stub.conectar(l);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro! " + e.getMessage() + JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }

    public void desconectar(String host, LoginUsuario l) {
        try {
            Registry registry = LocateRegistry.getRegistry(host);
            Interface stub = (Interface) registry.lookup("Interface");
            stub.desconectar(l);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro! " + e.getMessage() + JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }

}
