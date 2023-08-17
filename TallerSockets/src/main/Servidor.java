package main;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Servidor extends Conexion {

	public Servidor() {
		super("servidor");
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

			salidaCliente = new DataOutputStream(cs.getOutputStream());

			BufferedReader entrada = new BufferedReader(new InputStreamReader(cs.getInputStream()));

			while ((mensajeServidor = entrada.readLine()) != null) {

				System.out.println(mensajeServidor);

			}

			System.out.println("Fin de la conexion...");
			ss.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
