package br.fafic.sd;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Server {

    public static void iniciar() {

        try {
            Registry reg = LocateRegistry.createRegistry(3000);
            reg.rebind("jogar", new Multiplayer());
            System.out.println("Servidor inicado...");
           

        } catch (RemoteException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
