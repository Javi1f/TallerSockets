package main;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

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
			if (cs.isConnected()) {
				cicloprincipal: while (true) {
					salidaCliente.writeUTF(
							"Por favor elija una de las siguientes opciones:\n1) si\n2) no\n3) talvez\n4) depronto\n5) salir");
					charla = in.readUTF();
					System.out.println(charla);
					switch (charla) {
					case "1": {
						salidaCliente.writeUTF("sisas");
						break;
					}
					case "2": {
						salidaCliente.writeUTF("noks");
						break;
					}
					case "3": {
						salidaCliente.writeUTF("tal vez mi bro");
						break;
					}
					case "4": {
						salidaCliente.writeUTF("depronto y con suerte pana");
						break;
					}
					case "5": {
						break cicloprincipal;
					}
					default:
						salidaCliente.writeUTF("Opcion no valida, intentelo de nuevo por favor");
					}
				}
			}

			in.close();
			ss.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
