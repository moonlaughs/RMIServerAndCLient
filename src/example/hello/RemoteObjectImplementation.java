package example.hello;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RemoteObjectImplementation extends UnicastRemoteObject
										implements Hello{

	 public RemoteObjectImplementation() throws RemoteException {
	    }

	    @Override
	    public String sayHello(String msg) throws RemoteException {
	        return "Hello,  " + msg;//this.getClass().getCanonicalName();
	    }

	    @Override
	    public int sum(int a, int b) throws RemoteException {
	        return a + b;
	    }

	
}
