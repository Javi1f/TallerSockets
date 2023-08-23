package main;

public class MainServer {

	public static void main(String[] args) {

		Thread server = new Thread(new Servidor());
		server.setPriority(10);
		server.run();
	}

}
