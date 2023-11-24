package edu.dandaevit;

import edu.dandaevit.server.Server;

public class Main {
	public static void main (String[] args) {
		var port = Integer.parseInt(args[0]);
		var directory = args[1];

		new Server(port, directory).start();
	}
}
