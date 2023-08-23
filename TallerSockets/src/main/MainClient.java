package main;

public class MainClient {

	public static void main(String[] args) {

		Thread client = new Thread(new Cliente());
		client.setPriority(1);
		client.run();

	}

}
