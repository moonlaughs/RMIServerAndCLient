package example.hello;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Hello extends Remote {

	int sum(int a, int b) throws RemoteException;

	String sayHello(String msg) throws RemoteException;
}
