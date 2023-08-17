package main;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Servidor extends Conexion {

	public Servidor() {
		super("Servidor");
	}

	public void startServer() {

		System.out.println("Esperando...");

		try {
			cs = ss.accept();
			System.out.println("Cliente en linea...");
			System.out.println(cs.getInetAddress());
			System.out.println(cs.getPort());

			String charla = "";
//			int cont = 0;
			while (charla != "salir") {
				salidaCliente = new DataOutputStream(cs.getOutputStream());
				BufferedReader entrada = new BufferedReader(new InputStreamReader(cs.getInputStream()));
				charla = entrada.toString();
				while ((mensajeServidor = entrada.readLine()) != null) {
					System.out.println(mensajeServidor);
				}
			}
			System.out.println("Fin de la conexion...");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
