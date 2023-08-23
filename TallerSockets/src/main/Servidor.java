package main;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.FileHandler;

public class Servidor extends Conexion implements Runnable {

	private DataInputStream in;
	private Properties prop;

	public Servidor() {
		super("servidor");
		prop = new Properties();
	}

	public void startServer() {
		System.out.println("Starting Server...");
		System.out.println("Waiting...");

		try {
			cs = ss.accept();
			System.out.println("online client...");
			System.out.println(cs.getInetAddress());
			System.out.println(cs.getPort());
			in = new DataInputStream(cs.getInputStream());

			salidaCliente = new DataOutputStream(cs.getOutputStream());
			String charla = " ";
			if (cs.isConnected()) {
				cicloprincipal: while (true) {
					salidaCliente.writeUTF(
							"Welcome to the video game encyclopedia system, please select the language you want: \n 1) English \n 2) Spanish \n 3) Italian \n 4) Exit");
					charla = in.readUTF();
					System.out.println(charla);
					volver: switch (charla) {
					case "1": {
						prop = main.FileHandler.cargarPropiedades("ingles.properties");
						salidaCliente.writeUTF(prop.getProperty("idioma.menu.uno"));
						cicloingles: while (true) {
							charla = in.readUTF();
							switch (charla) {
							case "1": {

								salidaCliente.writeUTF(prop.getProperty("idioma.menu.xbox"));

								cicloxbox: while (true) {
									charla = in.readUTF();
									switch (charla) {
									case "1": {

										salidaCliente.writeUTF(prop.getProperty("idioma.menu.halo"));
										break cicloprincipal;
									}
									case "2": {

										salidaCliente.writeUTF(prop.getProperty("idioma.menu.gears"));
										break cicloprincipal;
									}
									case "3": {

										salidaCliente.writeUTF(prop.getProperty("idioma.menu.forza"));
										break cicloprincipal;
									}
									case "4": {

										salidaCliente.writeUTF(prop.getProperty("idioma.menu.quantum"));
										break cicloprincipal;
									}
									default:
										salidaCliente.writeUTF("Option not valid");
									}

								}

							}
							case "2": {

								salidaCliente.writeUTF(prop.getProperty("idioma.menu.play"));
								cicloplay: while (true) {
									charla = in.readUTF();
									switch (charla) {
									case "1": {

										salidaCliente.writeUTF(prop.getProperty("idioma.menu.tlou"));
										break cicloprincipal;
									}
									case "2": {

										salidaCliente.writeUTF(prop.getProperty("idioma.menu.gow"));
										break cicloprincipal;
									}
									case "3": {

										salidaCliente.writeUTF(prop.getProperty("idioma.menu.uncharted"));
										break cicloprincipal;
									}
									case "4": {

										salidaCliente.writeUTF(prop.getProperty("idioma.menu.spider"));
										break cicloprincipal;
									}
									default:
										salidaCliente.writeUTF("Option not valid");
									}
								}

							}
							case "3": {

								salidaCliente.writeUTF(prop.getProperty("idioma.menu.nintendo"));
								ciclonintendo: while (true) {
									charla = in.readUTF();
									switch (charla) {
									case "1": {

										salidaCliente.writeUTF(prop.getProperty("idioma.menu.zelda"));
										break cicloprincipal;
									}
									case "2": {

										salidaCliente.writeUTF(prop.getProperty("idioma.menu.mario"));
										break cicloprincipal;
									}
									case "3": {

										salidaCliente.writeUTF(prop.getProperty("idioma.menu.pokemon"));
										break cicloprincipal;
									}
									case "4": {

										salidaCliente.writeUTF(prop.getProperty("idioma.menu.animal"));
										break cicloprincipal;
									}
									default:
										salidaCliente.writeUTF("Option not valid");
									}
								}

							}
							case "4": {

								salidaCliente.writeUTF(prop.getProperty("idioma.menu.pc"));
								ciclopc: while (true) {
									charla = in.readUTF();
									switch (charla) {
									case "1": {

										salidaCliente.writeUTF(prop.getProperty("idioma.menu.lol"));
										break cicloprincipal;
									}
									case "2": {

										salidaCliente.writeUTF(prop.getProperty("idioma.menu.dota"));
										break cicloprincipal;
									}
									case "3": {

										salidaCliente.writeUTF(prop.getProperty("idioma.menu.aoe"));
										break cicloprincipal;
									}
									case "4": {

										salidaCliente.writeUTF(prop.getProperty("idioma.menu.garry"));
										break cicloprincipal;
									}
									default:
										salidaCliente.writeUTF("Option not valid");
									}
								}

							}
							default:
								salidaCliente.writeUTF("Option not valid");
							}
						}

					}
					case "2": {
						prop = main.FileHandler.cargarPropiedades("español.properties");
						salidaCliente.writeUTF(prop.getProperty("idioma.menu.uno"));
						cicloespañol: while (true) {
							charla = in.readUTF();
							switch (charla) {
							case "1": {

								salidaCliente.writeUTF(prop.getProperty("idioma.menu.xbox"));

								cicloxbox: while (true) {
									charla = in.readUTF();
									switch (charla) {
									case "1": {

										salidaCliente.writeUTF(prop.getProperty("idioma.menu.halo"));
										break cicloprincipal;
									}
									case "2": {

										salidaCliente.writeUTF(prop.getProperty("idioma.menu.gears"));
										break cicloprincipal;
									}
									case "3": {

										salidaCliente.writeUTF(prop.getProperty("idioma.menu.forza"));
										break cicloprincipal;
									}
									case "4": {

										salidaCliente.writeUTF(prop.getProperty("idioma.menu.quantum"));
										break cicloprincipal;
									}
									default:
										salidaCliente.writeUTF("Option not valid");
									}

								}

							}
							case "2": {

								salidaCliente.writeUTF(prop.getProperty("idioma.menu.play"));
								cicloplay: while (true) {
									charla = in.readUTF();
									switch (charla) {
									case "1": {

										salidaCliente.writeUTF(prop.getProperty("idioma.menu.tlou"));
										break cicloprincipal;
									}
									case "2": {

										salidaCliente.writeUTF(prop.getProperty("idioma.menu.gow"));
										break cicloprincipal;
									}
									case "3": {

										salidaCliente.writeUTF(prop.getProperty("idioma.menu.uncharted"));
										break cicloprincipal;
									}
									case "4": {

										salidaCliente.writeUTF(prop.getProperty("idioma.menu.spider"));
										break cicloprincipal;
									}
									default:
										salidaCliente.writeUTF("Option not valid");
									}
								}

							}
							case "3": {

								salidaCliente.writeUTF(prop.getProperty("idioma.menu.nintendo"));
								ciclonintendo: while (true) {
									charla = in.readUTF();
									switch (charla) {
									case "1": {

										salidaCliente.writeUTF(prop.getProperty("idioma.menu.zelda"));
										break cicloprincipal;
									}
									case "2": {

										salidaCliente.writeUTF(prop.getProperty("idioma.menu.mario"));
										break cicloprincipal;
									}
									case "3": {

										salidaCliente.writeUTF(prop.getProperty("idioma.menu.pokemon"));
										break cicloprincipal;
									}
									case "4": {

										salidaCliente.writeUTF(prop.getProperty("idioma.menu.animal"));
										break cicloprincipal;
									}
									default:
										salidaCliente.writeUTF("Option not valid");
									}
								}

							}
							case "4": {

								salidaCliente.writeUTF(prop.getProperty("idioma.menu.pc"));
								ciclopc: while (true) {
									charla = in.readUTF();
									switch (charla) {
									case "1": {

										salidaCliente.writeUTF(prop.getProperty("idioma.menu.lol"));
										break cicloprincipal;
									}
									case "2": {

										salidaCliente.writeUTF(prop.getProperty("idioma.menu.dota"));
										break cicloprincipal;
									}
									case "3": {

										salidaCliente.writeUTF(prop.getProperty("idioma.menu.aoe"));
										break cicloprincipal;
									}
									case "4": {

										salidaCliente.writeUTF(prop.getProperty("idioma.menu.garry"));
										break cicloprincipal;
									}
									default:
										salidaCliente.writeUTF("Option not valid");
									}
								}

							}
							default:
								salidaCliente.writeUTF("Option not valid");
							}
						}
					}
					case "3": {
						prop = main.FileHandler.cargarPropiedades("italiano.properties");
						salidaCliente.writeUTF(prop.getProperty("idioma.menu.uno"));
						cicloitaliano: while (true) {
							charla = in.readUTF();
							switch (charla) {
							case "1": {

								salidaCliente.writeUTF(prop.getProperty("idioma.menu.xbox"));

								cicloxbox: while (true) {
									charla = in.readUTF();
									switch (charla) {
									case "1": {

										salidaCliente.writeUTF(prop.getProperty("idioma.menu.halo"));
										break cicloprincipal;
									}
									case "2": {

										salidaCliente.writeUTF(prop.getProperty("idioma.menu.gears"));
										break cicloprincipal;
									}
									case "3": {

										salidaCliente.writeUTF(prop.getProperty("idioma.menu.forza"));
										break cicloprincipal;
									}
									case "4": {

										salidaCliente.writeUTF(prop.getProperty("idioma.menu.quantum"));
										break cicloprincipal;
									}
									default:
										salidaCliente.writeUTF("Option not valid");
									}

								}

							}
							case "2": {

								salidaCliente.writeUTF(prop.getProperty("idioma.menu.play"));
								cicloplay: while (true) {
									charla = in.readUTF();
									switch (charla) {
									case "1": {

										salidaCliente.writeUTF(prop.getProperty("idioma.menu.tlou"));
										break cicloprincipal;
									}
									case "2": {

										salidaCliente.writeUTF(prop.getProperty("idioma.menu.gow"));
										break cicloprincipal;
									}
									case "3": {

										salidaCliente.writeUTF(prop.getProperty("idioma.menu.uncharted"));
										break cicloprincipal;
									}
									case "4": {

										salidaCliente.writeUTF(prop.getProperty("idioma.menu.spider"));
										break cicloprincipal;
									}
									default:
										salidaCliente.writeUTF("Option not valid");
									}
								}

							}
							case "3": {

								salidaCliente.writeUTF(prop.getProperty("idioma.menu.nintendo"));
								ciclonintendo: while (true) {
									charla = in.readUTF();
									switch (charla) {
									case "1": {

										salidaCliente.writeUTF(prop.getProperty("idioma.menu.zelda"));
										break cicloprincipal;
									}
									case "2": {

										salidaCliente.writeUTF(prop.getProperty("idioma.menu.mario"));
										break cicloprincipal;
									}
									case "3": {

										salidaCliente.writeUTF(prop.getProperty("idioma.menu.pokemon"));
										break cicloprincipal;
									}
									case "4": {

										salidaCliente.writeUTF(prop.getProperty("idioma.menu.animal"));
										break cicloprincipal;
									}
									default:
										salidaCliente.writeUTF("Option not valid");
									}
								}

							}
							case "4": {

								salidaCliente.writeUTF(prop.getProperty("idioma.menu.pc"));
								ciclopc: while (true) {
									charla = in.readUTF();
									switch (charla) {
									case "1": {

										salidaCliente.writeUTF(prop.getProperty("idioma.menu.lol"));
										break cicloprincipal;
									}
									case "2": {

										salidaCliente.writeUTF(prop.getProperty("idioma.menu.dota"));
										break cicloprincipal;
									}
									case "3": {

										salidaCliente.writeUTF(prop.getProperty("idioma.menu.aoe"));
										break cicloprincipal;
									}
									case "4": {

										salidaCliente.writeUTF(prop.getProperty("idioma.menu.garry"));
										break cicloprincipal;
									}
									default:
										salidaCliente.writeUTF("Option not valid");
									}
								}

							}
							default:
								salidaCliente.writeUTF("Option not valid");
							}
						}
					}
					case "4": {

						break cicloprincipal;
					}
					default:
						salidaCliente.writeUTF("Option not valid");
					}
				}
			}
		} catch (Exception e) {
			System.out.println("end of connection");
		}

	}

	@Override
	public void run() {

		startServer();

	}

}
