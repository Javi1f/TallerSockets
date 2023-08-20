package main;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Servidor extends Conexion {

	private DataInputStream in;

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
			in = new DataInputStream(cs.getInputStream());

			salidaCliente = new DataOutputStream(cs.getOutputStream());
			String charla = " ";
			charla.toLowerCase();
			while (charla != "salir") {
				charla = in.readUTF();
				salidaCliente.writeUTF(charla);
			}

			System.out.println("Fin de la conexion...");
			in.close();
			ss.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
