package main;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Cliente extends Conexion {

	private DataInputStream in;
	private Scanner sc;

	public Cliente() {
		super("cliente");
		sc = new Scanner(System.in);
		try {
			in = new DataInputStream(cs.getInputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void startCliente() {

		try {
			salidaServidor = new DataOutputStream(cs.getOutputStream());

			String mensaje = " ";
			while (mensaje != "salir") {

				mensaje = sc.nextLine();

				salidaServidor.writeUTF(mensaje);
				System.out.println(in.readUTF());
			}
			in.close();
			cs.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
