package main;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Cliente extends Conexion implements Runnable {

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

	public void startClient() {
		System.out.println("Starting client...");

		try {
			salidaServidor = new DataOutputStream(cs.getOutputStream());

			String mensaje = " ";
			int count = 0;
			cicloprincipal: while (true) {
				System.out.println(in.readUTF());
				mensaje = sc.nextLine();

				if (count == 0) {
					switch (mensaje) {
					case "1": {

						salidaServidor.writeUTF("1");
						count++;
						break;

					}
					case "2": {

						salidaServidor.writeUTF("2");
						count++;
						break;

					}
					case "3": {

						salidaServidor.writeUTF("3");
						count++;
						break;

					}
					case "4": {
						System.out.println("end of connection");
						break cicloprincipal;

					}
					default:

					}
				} else if (count == 1) {

					switch (mensaje) {
					case "1": {

						salidaServidor.writeUTF("1");
						count++;
						break;

					}
					case "2": {

						salidaServidor.writeUTF("2");
						count++;
						break;

					}
					case "3": {

						salidaServidor.writeUTF("3");
						count++;
						break;

					}
					case "4": {
						salidaServidor.writeUTF("4");
						count++;
						break;

					}

					}
				} else {
					salidaServidor.writeUTF(mensaje);
					System.out.println(in.readUTF());
				}

			}

		} catch (Exception e) {
			System.out.println("end of connection");
		}
	}

	@Override
	public void run() {

		startClient();

	}

}
