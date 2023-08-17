package main;

import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Cliente extends Conexion {

	private Scanner sc;

	public Cliente() {
		super("cliente");
		sc = new Scanner(System.in);
		// TODO Auto-generated constructor stub
	}

	public void startCliente() {

		try {
			salidaServidor = new DataOutputStream(cs.getOutputStream());
			
			String mensaje = "";

			while (!(mensaje.equals("salir"))) {

				mensaje = sc.nextLine();

				salidaServidor.writeUTF(mensaje);

			}

			cs.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
