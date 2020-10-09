package example.hello;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {

	public static void main(String[] args) {
		//String host = (args.length < 1) ? null : args[0];
        try {
            Registry registry = LocateRegistry.getRegistry(1099);
            Hello stub = (Hello) registry.lookup("Hello");
            String response = stub.sayHello("it's me...");
            System.out.println("response: " + response);
            

            int result = stub.sum(12, 34);
            
            System.out.print(result);
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
	}

}
