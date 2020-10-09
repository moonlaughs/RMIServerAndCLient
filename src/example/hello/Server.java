package example.hello;

import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.net.MalformedURLException;
import java.nio.channels.AlreadyBoundException;
import java.rmi.*;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Server { 

    private int port = 1099;    // rmi default port on the server
    private String host = "localhost"; // the server's host

    public static void main (String[] args) throws java.rmi.AlreadyBoundException {
        try {            
        	RemoteObjectImplementation remoteObj = new RemoteObjectImplementation();
            //starts the rmiregistry
            LocateRegistry.createRegistry(1099);
            //bind the object to the registry
            Naming.bind("Hello", remoteObj);
            
            System.out.println ("RMI Server is ready.");   
        } catch (RemoteException | MalformedURLException | AlreadyBoundException ex) {
            ex.printStackTrace();
        }
    }
    
}