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
			while (true) {
				System.out.println(in.readUTF());
				mensaje = sc.nextLine();
				salidaServidor.writeUTF(mensaje);
				System.out.println(in.readUTF());
				if (mensaje == "6") {
					break;
				}
			}
			in.close();
			cs.close();
		} catch (Exception e) {
			System.out.println("Fin de la conexion");
		}
	}

}
