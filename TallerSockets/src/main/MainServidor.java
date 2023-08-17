package main;

public class MainServidor {

	public static void main(String[] args) {
		Servidor sv = new Servidor();
		System.out.println("Iniciando Servidor...");
		sv.startServer();
	}
}
